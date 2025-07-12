package com.example.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class TodoController {

    private List<Todo> todoList = new ArrayList<>();

    private AtomicLong idCounter = new AtomicLong();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("todoList", todoList);
        return "home";
    }

    @GetMapping("/todos/new")
    public String showForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "new-todo";
    }

    @GetMapping("/todos/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoList.removeIf(todo -> todo.getId().equals(id));
        return "redirect:/";
    }

    // 수정 폼 보여주기
    @GetMapping("/todos/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        // id로 해당 Todo 찾기
        for (Todo todo : todoList) {
            if (todo.getId().equals(id)) {
                model.addAttribute("todo", todo);
                return "edit-todo";
            }
        }
        // 못 찾았을 경우 홈으로 리다이렉트
        return "redirect:/";
    }

    // 수정된 내용 반영
    @PostMapping("/todos/update")
    public String updateTodo(@ModelAttribute Todo updatedTodo) {
        for (Todo todo : todoList) {
            if (todo.getId().equals(updatedTodo.getId())) {
                todo.setContent(updatedTodo.getContent());
                todo.setDone(updatedTodo.isDone());
                break;
            }
        }
        return "redirect:/";
    }

    @PostMapping("/todos")
    public String addTodo(@ModelAttribute Todo todo) {
    todo.setId(idCounter.incrementAndGet());
    todoList.add(todo);
    return "redirect:/";
    }


}
