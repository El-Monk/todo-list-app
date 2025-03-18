package com.example.todo_list_app.service;

import com.example.todo_list_app.dto.TaskDTO;
import java.util.List;

public interface TaskService {

    TaskDTO createTask(TaskDTO taskDTO);
    TaskDTO getTaskById(Long id);
    List<TaskDTO> getAllTasks();
    TaskDTO updateTask(Long id, TaskDTO taskDTO);
    void deleteTask(Long id);

}
