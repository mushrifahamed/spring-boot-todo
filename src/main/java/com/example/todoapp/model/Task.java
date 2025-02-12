package com.example.todoapp.model;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private boolean completed;

    public Task() {}

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public Long getId() { return id; }
    public String getDescription() { return description; }
    public boolean isCompleted() { return completed; }

    public void setDescription(String description) { this.description = description; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}