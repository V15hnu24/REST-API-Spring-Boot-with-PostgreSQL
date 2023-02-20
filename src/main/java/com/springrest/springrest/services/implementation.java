package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entitiy.load;
import com.springrest.springrest.repo.LoadRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class implementation implements loadsService{
    
    @Autowired
    private LoadRepo loadRepo;

    @Override
    public List<load> getLoads(){
        List<load> loads = loadRepo.findAll();
        return loads;
    }

    @Override
    public load getLoad(long loadId){
        return loadRepo.findById(loadId).orElse(null);
    }

    @Override
    public load addLoad(load load){
        return loadRepo.save(load);
    }

    @Override
    public load updateLoad(long Id,load load){
        load exisitingLoad = loadRepo.findById(Id).orElse(null);

        if(exisitingLoad !=null){
            exisitingLoad.setLoadingPoint(load.getLoadingPoint());
            exisitingLoad.setUnloadingPoint(load.getUnloadingPoint());
            exisitingLoad.setProductType(load.getProductType());
            exisitingLoad.setTruckType(load.getTruckType());
            exisitingLoad.setNoOfTrucks(load.getNoOfTrucks());
            exisitingLoad.setWeight(load.getWeight());
            exisitingLoad.setShipperId(load.getShipperId());
            exisitingLoad.setComment(load.getComment());
            exisitingLoad.setDate(load.getDate());
            loadRepo.save(exisitingLoad);
        }

        return exisitingLoad;
    }

    @Override
    public void deleteLoad(long loadId){
        loadRepo.deleteById(loadId);
    }

    @Override
    public List<load> getLoadByShipperId(String shipperId){
        return loadRepo.findByShipperId(shipperId);
    }
}


// package com.springrest.springrest.services;

// import java.util.List;
// import com.springrest.springrest.entitiy.load;

// import org.springframework.stereotype.Service;

// @Service
// public class implementation implements loadsService{
    
//     @Override
//     public List<load> getLoads(){
//         return null;
//     }

//     @Override
//     public load getLoad(long loadId){
//         return null;
//     }

//     @Override
//     public load addLoad(load load){
//         return null;
//     }

//     @Override
//     public load updateLoad(long loadId, load load){
//         return null;
//     }

//     @Override
//     public void deleteLoad(long loadId){
        
//         return;   
//     }

//     @Override
//     public List<load> getLoadByShipperId(String shipperId) {
//         // TODO Auto-generated method stub
//         return null;
//     }
// }