package com.codurance.training.tasks.service;

import com.codurance.training.tasks.Task;

import java.util.List;
import java.util.Map;

public interface ShowByDeadlineService {
    public void showByDeadline(Map<String, List<Task>> tasks);
}
