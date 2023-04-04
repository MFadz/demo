package com.company.demo.web.screens.applicant;

import com.haulmont.cuba.gui.screen.*;
import com.company.demo.entity.Applicant;

@UiController("demo_Applicant.browse")
@UiDescriptor("applicant-browse.xml")
@LookupComponent("applicantsTable")
@LoadDataBeforeShow
public class ApplicantBrowse extends StandardLookup<Applicant> {
}