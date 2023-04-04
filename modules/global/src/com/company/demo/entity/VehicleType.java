package com.company.demo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "DEMO_VEHICLE_TYPE")
@Entity(name = "demo_VehicleType")
public class VehicleType extends StandardEntity {
    private static final long serialVersionUID = -4364269296150261846L;

    @Column(name = "VEHICLE_TYPE_ID")
    private Integer vehicleTypeID;

    @Column(name = "VEHICLE_DESCRIPTION")
    private String vehicleDescription;

    public String getVehicleDescription() {
        return vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    public Integer getVehicleTypeID() {
        return vehicleTypeID;
    }

    public void setVehicleTypeID(Integer vehicleTypeID) {
        this.vehicleTypeID = vehicleTypeID;
    }
}