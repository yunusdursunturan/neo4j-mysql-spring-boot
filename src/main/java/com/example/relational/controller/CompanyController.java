package com.example.relational.controller;

import com.example.relational.domain.Company;
import com.example.relational.repository.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
public class CompanyController extends BaseController {
    @Autowired
    private CompanyDao companyDao;

    @RequestMapping(value = "/company/save",method = RequestMethod.POST)
    @ResponseBody
    public Company saveUser(@RequestBody Company company){
        return companyDao.save(company);
    }

    @RequestMapping(value = "/company/get",method = RequestMethod.GET)
    @ResponseBody
    public Company getUser(@RequestParam Long id){
        return companyDao.findOne(id);
    }

    @RequestMapping(value = "/company/getCompanyList",method = RequestMethod.POST)
    @ResponseBody
    public List<Company> getUser(@RequestBody List<Integer> idList){
        return companyDao.userList(idList);
    }
}
