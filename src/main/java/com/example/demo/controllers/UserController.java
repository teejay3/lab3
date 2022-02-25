package com.example.demo.controllers;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = UserController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController
{
    public static final String REST_URL = "/api/v1/user";
    @Autowired
    private final UserService service;

    UserController(UserService service) {
        this.service = service;
    }

    @GetMapping(value = "/{id}")
    public User get(@PathVariable("id") Integer id)
    {
        log.info("get " + id);
        return service.get(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public User save(@RequestBody User user)
    {
        log.info("save " + user);
        return service.save(user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Integer id)
    {
        log.info("delete " + id);
        service.delete(id);
    }
    @GetMapping
    List<User> all() {
        //log.info("all");
        return service.getAll();
    }
}
