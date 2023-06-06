package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    private final UserRepo userRepo;

    @Autowired
    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/users")
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @GetMapping("/users/{users_id}")
    public User getOne(@PathVariable("users_id") User user) {
        return user;
    }

    @PostMapping("/users")
    public User create(@RequestBody User user) {
        //user.setCreationDate(LocalDateTime.now());
        return userRepo.save(user);
    }

/*    @PutMapping("/users/{id}")
    public User update(
            @PathVariable("id") User userFromDb,
            @RequestBody User user
    ) {
        BeanUtils.copyProperties(user, userFromDb, "id");
        return userRepo.save(userFromDb);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") User user) {
        userRepo.delete(user);
    }*/
}

