package com.company.demo.web.screens.vehicletype;

import com.haulmont.cuba.gui.screen.*;
import com.company.demo.entity.VehicleType;

@UiController("demo_VehicleType.browse")
@UiDescriptor("vehicle-type-browse.xml")
@LookupComponent("vehicleTypesTable")
@LoadDataBeforeShow
public class VehicleTypeBrowse extends StandardLookup<VehicleType> {
}