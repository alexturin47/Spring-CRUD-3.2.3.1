package org.example.controllers;

import org.example.dao.UserDao;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/")
    public String index(Model model, @ModelAttribute("user") User user) {
        model.addAttribute("users", userDao.index());
        return "/index";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user) {
        userDao.save(user);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        userDao.delete(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userDao.read(id));
        return "/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        userDao.update(id, user);
        return "redirect:/";
    }
}
