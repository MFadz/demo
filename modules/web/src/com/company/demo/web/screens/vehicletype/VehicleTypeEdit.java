package com.company.demo.web.screens.vehicletype;

import com.haulmont.cuba.gui.screen.*;
import com.company.demo.entity.VehicleType;

@UiController("demo_VehicleType.edit")
@UiDescriptor("vehicle-type-edit.xml")
@EditedEntityContainer("vehicleTypeDc")
@LoadDataBeforeShow
public class VehicleTypeEdit extends StandardEditor<VehicleType> {
}