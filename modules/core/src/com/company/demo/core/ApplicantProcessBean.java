package com.company.demo.core;

import com.company.demo.entity.Applicant;
import com.haulmont.cuba.core.global.DataManager;
import groovyjarjarasm.asm.commons.InstructionAdapter;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.text.ParseException;
import java.util.List;

@Component(ApplicantProcessBean.NAME)
public class ApplicantProcessBean {
    public static final String NAME = "demo_ApplicantProcessBean";

    @Inject
    private static DataManager dataManager;


    public static String firstApplicantAPI() {
        return "OK";
    }

    public static JSONObject GetApplicantList() {
        JSONObject jsonObject = new JSONObject();
        List<Applicant> applicantNames = dataManager.load(Applicant.class)
                .query("select e from demo_Applicant e")
                .list();

        jsonObject.put("applicant_name", applicantNames);

        return jsonObject;
    }

    public static JSONObject GetApplicantListbyID(String id) throws ParseException {
        JSONObject jsonObject = new JSONObject();
        List<Applicant> applicantListbyID = dataManager.load(Applicant.class)
                .query("select * from demo_applicant where demo_applicant.id = id")
                .parameter("id", id)
                //.view("berthFormAPI-view")
                .list();
        jsonObject.put("applicantListbyID", applicantListbyID);
        return jsonObject;
    }


}