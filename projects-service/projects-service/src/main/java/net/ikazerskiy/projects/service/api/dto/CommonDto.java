package net.ikazerskiy.projects.service.api.dto;

import java.io.Serializable;

public abstract class CommonDto implements Serializable {

    private String uid;

    private String name;

    private String description;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
