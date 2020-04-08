package com.learnspring.taskmanagementapplesson.persistence.repository;

import com.learnspring.taskmanagementapplesson.persistence.model.Project;

import java.util.Optional;

public interface IProjectRepository {
    Optional<Project> findById(Long id);

    Project save (Project project);
}
