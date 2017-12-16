package com.example.relational.controller;

import com.example.relational.domain.Groups;
import com.example.relational.repository.GroupDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
public class GroupsController extends BaseController{
    @Autowired
    private GroupDao groupDao;

    @RequestMapping(value = "/group/save",method = RequestMethod.POST)
    @ResponseBody
    public Groups save(@RequestBody Groups groups){
        return groupDao.save(groups);
    }

    @RequestMapping(value = "/group/get",method = RequestMethod.GET)
    @ResponseBody
    public Groups get(@RequestParam Integer id){
        return groupDao.findOne(id);
    }

    @RequestMapping(value = "/group/getGroupList",method = RequestMethod.POST)
    @ResponseBody
    public List<Groups> getGroup(@RequestBody List<Integer> idList){
        return groupDao.findAllGroupsId(idList);
    }
}