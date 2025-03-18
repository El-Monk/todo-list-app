package com.example.todo_list_app.service;

import com.example.todo_list_app.dto.TaskDTO;
import com.example.todo_list_app.model.Task;
import com.example.todo_list_app.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public Task convertToEntity(TaskDTO taskDTO) {
        return new Task(taskDTO);
    }

    public TaskDTO convertToDTO(Task task) {
        return new TaskDTO(task);
    }

    @Override
    public TaskDTO createTask(TaskDTO taskDTO) {
        Task task = convertToEntity(taskDTO);
        return convertToDTO(taskRepository.save(task));
    }

    @Override
    public TaskDTO getTaskById(Long id) {
        if (id == null) {
            return null;
        }
        return taskRepository.findById(id)
                .map(this::convertToDTO)
                .orElse(null);
    }

    @Override
    public List<TaskDTO> getAllTasks() {
//        List<TaskDTO> taskDTOList = new ArrayList<>();
        List<Task> tasks = taskRepository.findAll();
        return tasks.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TaskDTO updateTask(Long id, TaskDTO taskDTO) {
        return null;
    }

    @Override
    public void deleteTask(Long id) {

    }
}
