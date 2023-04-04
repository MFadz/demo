package com.company.demo.web.screens.parkinglot;

import com.haulmont.cuba.gui.screen.*;
import com.company.demo.entity.ParkingLot;

@UiController("demo_ParkingLot.browse")
@UiDescriptor("parking-lot-browse.xml")
@LookupComponent("parkingLotsTable")
@LoadDataBeforeShow
public class ParkingLotBrowse extends StandardLookup<ParkingLot> {
}