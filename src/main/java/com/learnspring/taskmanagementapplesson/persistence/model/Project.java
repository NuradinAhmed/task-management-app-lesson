package com.learnspring.taskmanagementapplesson.persistence.model;


import java.time.LocalDate;
import java.util.Objects;

public class Project {

    private Long id;
    private String name;
    private LocalDate dateCreated;


    //Generate Getters and setters - reason the private variables cannot be accessed directly so they will have to invoke the getter and setter to read and update.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }


    //generate hashCode() and equals()

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Project project = (Project) obj;
        return Objects.equals(id, project.id) &&
                Objects.equals(name, project.name) &&
                Objects.equals(dateCreated, project.dateCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateCreated);
    }
}
