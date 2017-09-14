package com.institute.reputation.management.publisher.controller;

import com.institute.reputation.management.publisher.dao.Address;
import com.institute.reputation.management.publisher.dao.Institute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/institute")
public class InstituteController {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void add(Institute institute){

    }
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public void get(){

    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public void get(@PathVariable String id){

    }
    @RequestMapping(method = RequestMethod.PUT)
    public void update(Institute institute){

    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete (@PathVariable String id){

    }


}
