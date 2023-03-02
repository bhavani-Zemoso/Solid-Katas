package com.codurance.training.tasks.service.impl;

import com.codurance.training.tasks.Task;
import com.codurance.training.tasks.service.ShowByDeadlineService;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

public class ShowByDeadlineServiceImpl implements ShowByDeadlineService {

    private final PrintWriter out;

    public ShowByDeadlineServiceImpl(PrintWriter writer) {
        this.out = writer;
    }

    @Override
    public void showByDeadline(Map<String, List<Task>> tasks) {
        Comparator<Task> compareByDate = Comparator.comparing(p -> parseDate(p.getDeadline()));

        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            out.println(project.getKey());
            List<Task> newTasks = project.getValue();
            Collections.sort(newTasks, compareByDate);
            for (Task task : newTasks) {
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
