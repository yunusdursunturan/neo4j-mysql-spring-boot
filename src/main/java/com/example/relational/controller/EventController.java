package com.example.relational.controller;


import com.example.relational.domain.Event;
import com.example.relational.repository.EventDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
public class EventController extends BaseController {
    @Autowired
    private EventDao eventDao;

    @RequestMapping(value = "/event/save",method = RequestMethod.POST)
    @ResponseBody
    public Event saveUser(@RequestBody Event event){
        return eventDao.save(event);
    }

    @RequestMapping(value = "/event/get",method = RequestMethod.GET)
    @ResponseBody
    public Event getUser(@RequestParam Integer id){
        return eventDao.findOne(id);
    }

    @RequestMapping(value = "/event/getEventList",method = RequestMethod.POST)
    @ResponseBody
    public List<Event> getEvent(@RequestBody List<Integer> idList){
        return eventDao.findEvent(idList);
    }
}
