package com.learnspring.taskmanagementapplesson.persistence.model;


import java.time.LocalDate;
import java.util.Objects;

public class Project {


    private Long id;
    private String name;
    private LocalDate dateCreated;
    private String internalId;


    //Constructor
    public Project(Long id, String name, LocalDate dateCreated) {
        super();
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
    }

    //Constructor for our entity
    public Project(Project project) {
        //TODO Auto-generated constructor stub
        this(project.getId(), project.getName(), project.getDateCreated());
    }



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
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null )
            return  false;
        if (getClass() != obj.getClass())
            return false;
        Project other = (Project) obj;
        return Objects.equals(id, other.id) &&
                Objects.equals(name, other.name) &&
                Objects.equals(dateCreated, other.dateCreated);
    }


    public void setInternalId(String internalId) {
        this.name = internalId;
    }

    public String getInternalId() {
        return name;
    }
}
