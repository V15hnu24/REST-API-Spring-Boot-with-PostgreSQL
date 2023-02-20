package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

// import org.springframework.http.HttpStatus;

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
    public ResponseEntity<load> getLoad(@PathVariable String loadId){
        load load = this.loadsService.getLoad(Long.parseLong(loadId));
        
        if(load == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok().body(load);
        }
    }

    @PostMapping(path="/load", consumes = "application/json")
    public ResponseEntity<String> addLoad(@RequestBody load load){
        this.loadsService.addLoad(load);
        return ResponseEntity.ok("Load added successfully");
    }

    @PutMapping(path="/load/{loadId}", consumes = "application/json")
    public ResponseEntity<load> updateLoad(@PathVariable("loadId") long loadId, @RequestBody load load){
        load existingLoad = this.loadsService.updateLoad(loadId, load);

        if(existingLoad == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(existingLoad);
    }

    @DeleteMapping("/load/{loadId}")
    public ResponseEntity<String> deleteLoad(@PathVariable String loadId){
        try {
            this.loadsService.deleteLoad(Long.parseLong(loadId));
            return ResponseEntity.ok("Load deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }    
    }

    @GetMapping("/load")
    public List<load> getLoadByShipperId(@RequestParam("shipperId") String shipperId){
        return this.loadsService.getLoadByShipperId(shipperId);
    }

}
