package com.company.demo.web.screens.parkinglot;

import com.haulmont.cuba.gui.screen.*;
import com.company.demo.entity.ParkingLot;

@UiController("demo_ParkingLot.edit")
@UiDescriptor("parking-lot-edit.xml")
@EditedEntityContainer("parkingLotDc")
@LoadDataBeforeShow
public class ParkingLotEdit extends StandardEditor<ParkingLot> {
}