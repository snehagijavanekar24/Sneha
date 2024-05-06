package com.project.spring_demo.Registration.service;

import com.project.spring_demo.Registration.model.Information;


public interface InformationService {
    public String createInformation(Information information);
    public String updateInformation(Information information);
    public String deleteInformation(String informationId);
    public Information getInformation(String informationId);
}
