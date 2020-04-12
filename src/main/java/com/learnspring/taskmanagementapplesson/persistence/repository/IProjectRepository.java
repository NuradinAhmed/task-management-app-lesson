package com.learnspring.taskmanagementapplesson.persistence.repository;

import com.learnspring.taskmanagementapplesson.persistence.model.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IProjectRepository  extends CrudRepository<Project, Long> {

    Optional<Project> findByName(String name);

    Project save (Project project);
}
