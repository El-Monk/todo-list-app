package com.example.todo_list_app.dto;

import com.example.todo_list_app.model.Task;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

public class TaskDTO {

    private Long id;

    @NotBlank(message = "Description cannot be blank")
    @Size(max = 255, message = "Description cannot exceed 255 character")
    private String description;
    private boolean isCompleted;
    private String category;

    @Future(message = "Due date must be in the future")
    private LocalDate dueDate;

    public TaskDTO(Long id, String description, boolean isCompleted, String category, LocalDate dueDate) {
        this.id = id;
        this.description = description;
        this.isCompleted = isCompleted;
        this.category = category;
        this.dueDate = dueDate;
    }

    public TaskDTO(Task task) {
        this.id = task.getId();
        this.description = task.getDescription();
        this.isCompleted = task.isCompleted();
        this.category = task.getCategory();
        this.dueDate = task.getDueDate();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
