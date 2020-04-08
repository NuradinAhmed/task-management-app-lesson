package com.learnspring.taskmanagementapplesson.service;

import java.util.Optional;

import com.learnspring.taskmanagementapplesson.persistence.model.Project;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);
}
