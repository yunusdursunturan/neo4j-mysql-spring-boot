package com.example.graph.controller;

import com.example.graph.domain.User;
import com.example.graph.service.GraphUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class GraphUserController {

    @Autowired
    private GraphUserService graphUserService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public User createPerson(@RequestBody User user) {

        return graphUserService.create(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getPerson(@PathVariable("id") Long id) {

        return graphUserService.findOne(id);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Collection<User> getAll() {

        return graphUserService.getAll();
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public List<User> getUser(@RequestParam Long mysqlId) {

        return graphUserService.getUserByMysqlId(mysqlId);
    }
}
