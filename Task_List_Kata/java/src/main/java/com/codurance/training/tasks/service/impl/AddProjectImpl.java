package com.codurance.training.tasks.service.impl;

import com.codurance.training.tasks.Task;
import com.codurance.training.tasks.service.AddProject;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AddProjectImpl implements AddProject {

    private Map<String, List<Task>> tasks = new LinkedHashMap<>();

    public AddProjectImpl(Map<String, List<Task>> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void addProject(String name) {
        tasks.put(name, new ArrayList<Task>());
    }

}
