package com.project.spring_demo.Registration.service.Impl;
import com.project.spring_demo.Registration.model.Information;
import com.project.spring_demo.Registration.repository.InformationRepository;
import com.project.spring_demo.Registration.service.InformationService;
import org.springframework.stereotype.Service;

@Service
public class InformationImpl implements InformationService {

    InformationRepository informationRepository;

    public InformationImpl(InformationRepository informationRepository) {
        this.informationRepository = informationRepository;
    }

    @Override
    public String createInformation(Information information) {
        informationRepository.save(information);
        return "Success";
    }

    @Override
    public String updateInformation(Information information) {
        informationRepository.save(information);
        return "Success";
    }

    @Override
    public String deleteInformation(String informationId) {
        informationRepository.deleteById(informationId);
        return "Success";
    }

    public Information getInformation(String informationId) {
        return informationRepository.findById(informationId).get();
    }

}
