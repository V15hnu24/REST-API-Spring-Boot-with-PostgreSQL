package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entitiy.load;

public interface loadsService {


    public List<load> getLoads();

    public load getLoad(long loadId);

    public load addLoad(load load);

    public load updateLoad(load load);

    public void deleteLoad(long loadId);

}
