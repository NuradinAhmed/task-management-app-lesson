package com.learnspring.taskmanagementapplesson.service.impl;

import com.learnspring.taskmanagementapplesson.persistence.model.Project;
import com.learnspring.taskmanagementapplesson.persistence.repository.IProjectRepository;
import com.learnspring.taskmanagementapplesson.service.IProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
//Here we're going to auto wire our repository and just delegate. Just to delegate operations.
public class ProjectServiceImpl implements IProjectService {

    private static final Logger Log = LoggerFactory.getLogger(ProjectServiceImpl.class);

    private IProjectRepository projectRepository;

    /** Three ways to define or inject dependencies: 1: Construstor injection 2:setter injection 3:field injection
     *      here we are taking ProjectServiceImpl class an an example and inject IProjectRepository in this class via constructor argument.
     *      Note: that since we have a single constructor, the @Autowired annotation is optional. */
    public ProjectServiceImpl(@Qualifier("projectRepositoryImpl2") IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Optional<Project> findById(Long id) {
        Log.debug("Project Service >> Finding Project By Id {}", id);
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project)  {
        Log.debug("Project Service >> Saving Project By Id", project);
        return projectRepository.save(project);
    }





    /**  The autowired annotation is optinal
    @Autowired
    private IProjectRepository projectRepo;

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepo.findById(id);
    }

    @Override
    public Project save(Project project) {
        return  projectRepo.save(project);
    }
    */
}
