package com.company.demo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "DEMO_APPLICANT")
@Entity(name = "demo_Applicant")
public class Applicant extends StandardEntity {
    private static final long serialVersionUID = 2357261198972321930L;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "IDENTIFICATION_NO")
    private String identificationNumber;

    @Column(name = "PLATE_NUMBER")
    private String plateNumber;

    @Column(name = "UNIT_NUMBER")
    private String unitNumber;

    @JoinColumn(name = "VEHICLE_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private VehicleType vehicleType;

    @JoinColumn(name = "LOT_ID_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private ParkingLot lotID;

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setLotID(ParkingLot lotID) {
        this.lotID = lotID;
    }

    public ParkingLot getLotID() {
        return lotID;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}