package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entitiy.load;

import org.springframework.stereotype.Service;

@Service
public class implementation implements loadsService{
    
    @Override
    public List<load> getLoads(){
        return null;
    }

    @Override
    public load getLoad(long loadId){
        return null;
    }

    @Override
    public load addLoad(load load){
        return null;
    }

    @Override
    public load updateLoad(load load){
        return null;
    }

    @Override
    public void deleteLoad(long loadId){
        
        return;   
    }
}
