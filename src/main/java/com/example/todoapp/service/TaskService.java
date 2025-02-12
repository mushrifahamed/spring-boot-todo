package com.example.todoapp.service;

import com.example.todoapp.model.Task;
import com.example.todoapp.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() { return taskRepository.findAll(); }
    public Task addTask(Task task) { return taskRepository.save(task); }
    public void deleteTask(Long id) { taskRepository.deleteById(id); }

    public Task markTaskCompleted(Long id) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setCompleted(true);
        return taskRepository.save(task);
    }
}
