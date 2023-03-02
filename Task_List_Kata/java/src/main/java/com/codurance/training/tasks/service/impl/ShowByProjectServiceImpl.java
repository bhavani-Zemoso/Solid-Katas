package com.codurance.training.tasks.service.impl;

import com.codurance.training.tasks.Task;
import com.codurance.training.tasks.service.ShowByDateService;
import com.codurance.training.tasks.service.ShowByDeadlineService;
import com.codurance.training.tasks.service.ShowByProjectService;
import com.codurance.training.tasks.service.ShowDueTaskService;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

public class ShowByProjectServiceImpl implements ShowByProjectService {

    private final PrintWriter out;

    public ShowByProjectServiceImpl(PrintWriter writer) {
        this.out = writer;
    }
    @Override
    public void showByProject(Map<String, List<Task>> tasks) {
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            out.println(project.getKey());
            for (Task task : project.getValue()) {
                out.printf("    [%c] %s: %s %s%n", (task.isDone() ? 'x' : ' '), task.getId(), task.getDescription(), parseDate(task.getDeadline()));
            }
            out.println();
        }
    }







    private String parseDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }
}
