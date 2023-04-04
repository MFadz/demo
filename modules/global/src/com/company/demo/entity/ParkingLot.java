package com.company.demo.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "DEMO_PARKING_LOT")
@Entity(name = "demo_ParkingLot")
public class ParkingLot extends StandardEntity {
    private static final long serialVersionUID = -1892279262444129165L;

    @Column(name = "LOT_ID", unique = true)
    private Integer lotID;

    @Column(name = "LOT_NUMBER")
    private String lotNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "VALID_FROM")
    private Date validFrom;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "VALID_TO")
    private Date validTo;

    @Column(name = "LEVEL_DESCRIPTION")
    private String levelDescription;

    public void setLotID(Integer lotID) {
        this.lotID = lotID;
    }

    public Integer getLotID() {
        return lotID;
    }

    public String getLevelDescription() {
        return levelDescription;
    }

    public void setLevelDescription(String levelDescription) {
        this.levelDescription = levelDescription;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

}