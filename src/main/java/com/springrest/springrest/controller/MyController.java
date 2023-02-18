package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

import com.springrest.springrest.services.loadsService;

import java.util.List;

import com.springrest.springrest.entitiy.load;


@RestController
public class MyController {
    
    @Autowired
    private loadsService loadsService;

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    //Get all the  loads

    @GetMapping("/loads")
    public List<load> getLoads(){
        return this.loadsService.getLoads();
    }

    //Get the load by id

    @GetMapping("/loads/{loadId}")
    public load getLoad(@PathVariable String loadId){
        return this.loadsService.getLoad(Long.parseLong(loadId));
    }

    @PostMapping(path="/load", consumes = "application/json")
    public load addLoad(@RequestBody load load){
        return this.loadsService.addLoad(load);
    }

    @PutMapping(path="/load/{loadId}", consumes = "application/json")
    public load updateLoad(@RequestBody load load){
        return this.loadsService.updateLoad(load);
    }

    @DeleteMapping("/load/{loadId}")
    public String deleteLoad(@PathVariable String loadId){
        try {
            this.loadsService.deleteLoad(Long.parseLong(loadId));
            return "Load deleted successfully";
        } catch (Exception e) {
            return e.getMessage();
        }    
    }

}
