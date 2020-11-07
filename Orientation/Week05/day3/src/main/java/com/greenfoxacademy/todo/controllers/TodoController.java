package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RequestMapping(path = "/todo")
@Controller
public class TodoController {

    final
    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(path = {"/", "/list"})
    public String renderList(Model model, @RequestParam(required = false, name = "isActive") boolean isActice) {
        model.addAttribute("todos", todoService.getAll());
        model.addAttribute("isActive", isActice);
        if (isActice) {
            model.addAttribute("todos", todoService.getAll().stream().filter(todo -> todo.isDone()).collect(Collectors.toList()));
        }
        return "todolist";
    }

    @GetMapping(path = "/add")
    public String renderAddTodo(Model model) {
        model.addAttribute("todo", new Todo("bla5"));
        return "add";
    }

    @PostMapping(path = "/add")
    public String renderAddTodoPost(@ModelAttribute Todo todo) {
        todoService.save(todo);
        return "redirect:/todo/";
    }
}
