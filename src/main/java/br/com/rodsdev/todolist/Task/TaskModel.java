package br.com.rodsdev.todolist.Task;

import java.time.LocalDateTime;
import java.util.UUID;

public class TaskModel {


    private UUID id;
    private String description;
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt; 
}
