package com.codurance.training.tasks.service;

import java.util.Date;

public interface AddTask extends AddService{

    public void addTask(String project, String taskId, String description);

    public void addDeadlineToTask(String taskId, String deadline);
}
