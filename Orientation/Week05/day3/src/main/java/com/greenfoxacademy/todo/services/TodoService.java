package com.greenfoxacademy.todo.services;

import com.greenfoxacademy.todo.models.Todo;

import java.util.List;

public interface TodoService {
    Todo save(Todo todo);

    List<Todo> getAll();
}
