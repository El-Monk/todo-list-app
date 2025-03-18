package com.example.todo_list_app.controller;

import org.springframework.web.bind.annotation.*;
import com.example.todo_list_app.service.TaskServiceImpl;
import com.example.todo_list_app.model.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

//    @Autowired
//    private TaskServiceImpl taskService;
//
//    @PostMapping("/")
//    public Task addTask(@RequestBody Task task) {
//        return taskService.addTask(task);
//    }
//
//    @GetMapping("/")
//    public List<Task> getAkkTasks() {
//        return taskService.getAllTasks();
//    }
//
//    @PutMapping("/{id}")
//    public Task markTaskCompleted(@PathVariable Long id) {
//        return taskService.markTaskCompleted(id);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTask(@PathVariable Long id) {
//        taskService.deleteTask(id);
//    }
}
