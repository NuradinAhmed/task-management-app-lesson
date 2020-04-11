package com.learnspring.taskmanagementapplesson.service.impl;

import com.learnspring.taskmanagementapplesson.persistence.repository.IProjectRepository;
import com.learnspring.taskmanagementapplesson.service.IProjectService;
import com.learnspring.taskmanagementapplesson.persistence.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Optional;

public class ProjectServiceImplFieldInjection implements IProjectService {

    /** for example: what would happen if had two beans both implementing the IProjectRepository */
    @Autowired
    @Qualifier("projectRepositoryImpl2")
    private IProjectRepository projectRepository;


    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }
}
