package com.company.demo.service;

public interface ApplicantService {
    String NAME = "demo_ApplicantService";


    String firstApplicantAPI();

    String GetApplicantList();

    String GetApplicantListbyID(String id);
}