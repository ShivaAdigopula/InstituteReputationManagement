package com.institute.reputation.management.publisher.controller;

import com.institute.reputation.management.publisher.dao.Department;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/department")
public class DepartmentController {

    @RequestMapping("/{instituteId}")
    @ResponseBody
    public void add(Department department){

    }
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public void get(){

    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    @ResponseBody
    public void get(@PathVariable String id){

    }

    @RequestMapping(value="/{instituteId}/{id}",method = RequestMethod.GET)
    @ResponseBody
    public void get(@PathVariable String instituteId,@PathVariable String id){

    }
    @RequestMapping(method = RequestMethod.PUT)
    public void update(Department department){

    }

    @RequestMapping(value="/{instituteId}/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable String instituteId,@PathVariable String id){

    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable String id){

    }

}
