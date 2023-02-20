package com.springrest.springrest.entitiy;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class load {
    @Id
    private Long id;

    private String loadingPoint;

    private String unloadingPoint;

    private String productType;

    private String truckType;

    private String noOfTrucks;

    private String weight;

    private String comment;

    private String shipperId;

    private String date;

    // getters and setters

    public load(long id, String loadingPoint, String unloadingPoint, String productType, String truckType, String noOfTrucks,
            String weight, String comment, String shipperId, String date) {
        super();
        this.id = id;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.shipperId = shipperId; 
        this.date = date;
    }



    public load() {
        super();
    }


    //getters and setters for all the fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(String noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}