package com.example.todo_list_app.model;
/*
1. подтянуть основы джавы
2.

3. жизненый цикл бина

 */
import com.example.todo_list_app.dto.TaskDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private boolean isCompleted;
    private String category;
    private LocalDate dueDate;

    public Task() {
    }

    public Task(TaskDTO taskDTO) {
        this.description = taskDTO.getDescription();
        this.isCompleted = taskDTO.isCompleted();
        this.category = taskDTO.getCategory();
        this.dueDate = taskDTO.getDueDate();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
