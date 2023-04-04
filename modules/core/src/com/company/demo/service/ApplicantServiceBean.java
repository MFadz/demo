package com.company.demo.service;

import com.company.demo.core.ApplicantProcessBean;
import com.haulmont.cuba.core.app.importexport.EntityImportExportService;
import com.haulmont.cuba.core.app.serialization.EntitySerializationAPI;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import com.haulmont.cuba.core.app.serialization.EntitySerializationOption;


import javax.inject.Inject;

@Service(ApplicantService.NAME)
public class ApplicantServiceBean implements ApplicantService {

    @Inject
    private ApplicantProcessBean applicantProcessBean;
    @Inject
    private EntitySerializationAPI entitySerializationAPI;
    @Inject
    private EntityImportExportService entityImportExportService;
    @Inject
    private static DataManager dataManager;

    @Override
    public String firstApplicantAPI() {
        return ApplicantProcessBean.firstApplicantAPI();
    }

    @Override
    public String GetApplicantList() {
        try {
            return entitySerializationAPI.objectToJson(ApplicantProcessBean.GetApplicantList(), EntitySerializationOption.PRETTY_PRINT);
        } catch (Exception ex) {
            return entitySerializationAPI.objectToJson(ResponseEntity.badRequest().body(ex), EntitySerializationOption.PRETTY_PRINT);
        }
    }

    @Override
    public String GetApplicantListbyID(String id) {
        try {
            return entitySerializationAPI.objectToJson(ApplicantProcessBean.GetApplicantListbyID(id), EntitySerializationOption.PRETTY_PRINT);
        } catch (Exception ex) {
            return entitySerializationAPI.objectToJson(ResponseEntity.badRequest().body(ex), EntitySerializationOption.PRETTY_PRINT);
        }
    }

}