package com.example.relational.controller;

import com.example.relational.domain.User;
import com.example.relational.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
public class UserController extends BaseController{
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user/save",method = RequestMethod.POST)
    @ResponseBody
    public User saveUser(@RequestBody User user){
        return userDao.save(user);
    }

    @RequestMapping(value = "/user/get",method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@RequestParam Integer id){
        return userDao.findOne(id);
    }

    @RequestMapping(value = "/user/getUserList",method = RequestMethod.POST)
    @ResponseBody
    public List<User> getUser(@RequestBody List<Integer> idList){
        return userDao.userList(idList);
    }
}

