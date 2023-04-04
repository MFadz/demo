package com.company.demo.web.screens.applicant;

import com.haulmont.cuba.gui.screen.*;
import com.company.demo.entity.Applicant;

@UiController("demo_Applicant.edit")
@UiDescriptor("applicant-edit.xml")
@EditedEntityContainer("applicantDc")
@LoadDataBeforeShow
public class ApplicantEdit extends StandardEditor<Applicant> {

}