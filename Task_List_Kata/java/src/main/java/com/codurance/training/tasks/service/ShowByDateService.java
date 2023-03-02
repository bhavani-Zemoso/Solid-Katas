package com.codurance.training.tasks.service;

import com.codurance.training.tasks.Task;

import java.util.List;
import java.util.Map;

public interface ShowByDateService {
    public void showByDate(Map<String, List<Task>> tasks);
}
