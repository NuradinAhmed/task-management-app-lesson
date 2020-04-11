package com.learnspring.taskmanagementapplesson.service.impl;


import java.util.Optional;
import com.learnspring.taskmanagementapplesson.persistence.model.Project;
import com.learnspring.taskmanagementapplesson.persistence.repository.IProjectRepository;
import com.learnspring.taskmanagementapplesson.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ProjectServiceImplSetterInjection implements IProjectService {



    private IProjectRepository projectRepository;

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);

    }

    @Override
    public Project save(Project project){
        return projectRepository.save(project);
    }


    @Autowired
    @Qualifier("projectRepositoryImpl2")
    public void setProjectRepository(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }
}
