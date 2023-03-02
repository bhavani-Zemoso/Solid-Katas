package com.codurance.training.tasks.service.impl;

import com.codurance.training.tasks.Task;
import com.codurance.training.tasks.service.DeleteService;

import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DeleteServiceImpl implements DeleteService {

    private Map<String, List<Task>> tasks = new LinkedHashMap<>();

    private final PrintWriter out;

    public DeleteServiceImpl(Map<String, List<Task>> tasks, PrintWriter writer) {
        this.tasks = tasks;
        this.out = writer;
    }

    public void delete(String idString) {
        int id = Integer.parseInt(idString);
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            for(Task task: project.getValue()) {
                if(task.getId().equals(id)) {
                    project.getValue().remove(task);
                    return;
                }
            }
        }
        out.printf("Could not find a task with an ID of %d.", id);
        out.println();
    }
}
