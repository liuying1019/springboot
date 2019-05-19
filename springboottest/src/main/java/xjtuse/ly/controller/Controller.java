package xjtuse.ly.controller;
import xjtuse.ly.pojo.Task;
import org.springframework.web.bind.annotation.*;
import xjtuse.ly.pojo.Task;

import java.util.ArrayList;
import java.util.List;
@RestController
public class Controller {

    private static List<Task> tasks = new ArrayList<>(10);

    @GetMapping("/api/task")
    public List<Task> getall() {
        return tasks;
    }

    @PostMapping("/api/task")
    public List<Task> add(@RequestBody Task result) {
        tasks.add(result);
        return tasks;
    }

    @DeleteMapping("/api/task/{id}")
    public List<Task> delete(@PathVariable Integer id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId().equals(id)){
                tasks.remove(i);
                break;
            }
        }
        return tasks;
    }

    @GetMapping("/api/task/{id}")
    public Task get(@PathVariable Integer id) {
        Task task = null;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId().equals(id)){
                task =  tasks.get(i);
                break;
            }
        }
        return task;
    }

}