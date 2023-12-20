package models;

import models.enums.Role;

public class Actors {
    private long id;
    private String fullNameActors;
    private Role role;

//    public Actors() {
//    }

    public Actors(long id, String fullNameActors, Role role) {
        this.id = id;
        this.fullNameActors = fullNameActors;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullNameActors() {
        return fullNameActors;
    }

    public void setFullNameActors(String fullNameActors) {
        this.fullNameActors = fullNameActors;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Actors{" +
                "id=" + id +
                ", fullNameActors='" + fullNameActors + '\'' +
                ", role=" + role +
                '}';
    }
}
