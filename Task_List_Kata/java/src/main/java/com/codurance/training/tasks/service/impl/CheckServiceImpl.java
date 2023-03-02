package com.codurance.training.tasks.service.impl;

import com.codurance.training.tasks.Task;
import com.codurance.training.tasks.service.CheckService;

import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CheckServiceImpl implements CheckService {

    private final PrintWriter out;

    private  Map<String, List<Task>> tasks = new LinkedHashMap<>();

    public CheckServiceImpl(PrintWriter writer, Map<String, List<Task>> tasks) {
        this.out = writer;
        this.tasks = tasks;
    }

    public void check(String idString) {
        setDone(idString, true);
    }

    public void uncheck(String idString) {
        setDone(idString, false);
    }

    private void setDone(String idString, boolean done) {
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            for (Task task : project.getValue()) {
                if (task.getId().equals(idString)) {
                    task.setDone(done);
                    return;
                }
            }
        }
        out.printf("Could not find a task with an ID of %d.", idString);
        out.println();
    }
}
