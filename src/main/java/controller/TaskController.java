package controller;

import org.springframework.web.bind.annotation.*;
import service.TaskService;
import entity.Task;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/")
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @GetMapping("/")
    public List<Task> getAkkTasks() {
        return taskService.getAllTasks();
    }

    @PutMapping("/{id}")
    public Task markTaskCompleted(@PathVariable Long id) {
        return taskService.markTaskCompleted(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}
