package com.learnspring.taskmanagementapplesson.persistence.repository.impl;


import com.learnspring.taskmanagementapplesson.persistence.model.Project;
import com.learnspring.taskmanagementapplesson.persistence.repository.IProjectRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

@Repository
@Profile("dev")
//@Component /** Spring will scan for any classes annotated with @Component and will instantiate them as bean **/
public class ProjectRepositoryImpl implements IProjectRepository {

    @Value("${project.prefix}")
    private String prefix;


    @Value("${project.suffix}")
    private Integer suffix;



     List<Project> projects = new ArrayList<>();

     public ProjectRepositoryImpl(){
         super();
     }



    @Override
    public Optional<Project> findById(Long id) {
        //streaming, filtering and then just returning the first occurrence.
        return projects.stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public Project save(Project project) {
        //here save and update both. First we're removing the existing project, then we're creating and adding a new project into the list
        Project existingProject = findById(project.getId()).orElse(null);

        updateInternalId(project);

        if (existingProject == null) {
            projects.add(project);
            return project;
        } else {
            projects.remove(existingProject);
            //This constructor created because this is useful to have in our entity. And we are done with persistence layer.
            Project newProject = new Project(project);
            projects.add(newProject);
            return project;
        }
    //return project;

    }

    private void updateInternalId(Project project) {
        project.setInternalId(prefix + "-" + project.getId() + "-" + suffix);
    }

}
