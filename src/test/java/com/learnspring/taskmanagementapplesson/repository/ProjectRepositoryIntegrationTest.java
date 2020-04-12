package com.learnspring.taskmanagementapplesson.repository;

import jdk.vm.ci.meta.Local;
import org.apache.commons.lang3.RandomStringUtils;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import com.learnspring.taskmanagementapplesson.persistence.repository.IProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import com.learnspring.taskmanagementapplesson.persistence.model.Project;
import java.time.LocalDate;

@SpringBootTest
public class ProjectRepositoryIntegrationTest {

    @Autowired
    private IProjectRepository projectRepository;


    @Test
    public void whenSavingNewProject_thenSuccess() {
        Project newProject = new Project(randomAlphabetic(6), LocalDate.now());

        assertThat(projectRepository.save(newProject), is(notNullValue()));
    }


    @Test
    public void givenProject_whenFindById_thenSuccess() {
        Project newProject = new Project(randomAlphabetic(6), LocalDate.now());
        projectRepository.save(newProject);

        Optional<Project> retrievedProject = projectRepository.findById(newProject.getId());

        assertThat(retrievedProject.get(), is(equalTo(newProject)));

    }

    @Test
    public void givenProject_whenFindByName_thenSuccess() {
        Project newProject = new Project(randomAlphabetic(6), LocalDate.now());
        projectRepository.save(newProject);

        Optional<Project> retrievedProject = projectRepository.findByName(newProject.getName());

        assertThat(retrievedProject.get(), is(equalTo(newProject)));
    }


    @Test
    public void givenProjectCreated_whenFindByDateCreatedBetween_thenSuccess() {
        Project oldProject = new Project(randomAlphabetic(6), LocalDate.now().minusYears(1));
        projectRepository.save(oldProject);


        Project newProject = new Project(randomAlphabetic(6), LocalDate.now());
        projectRepository.save(newProject);


        Project newProject2 = new Project(randomAlphabetic(6), LocalDate.now());
        projectRepository.save(newProject2);


        List<Project> retrievedProjects = new projectRepository.findByDateCreatedBetween(LocalDate.now().minus(1), LocalDate.now().plus(1));
    }
}
