package com.project.spring_demo.Login.service.Impl;
import com.project.spring_demo.Login.model.Document;
import com.project.spring_demo.Login.repository.DocumentRepository;
import com.project.spring_demo.Login.service.DocumentService;
import org.springframework.stereotype.Service;

@Service
public class DocumentImpl implements DocumentService {

    DocumentRepository documentRepository;

    public DocumentImpl(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public String createDocument(Document document) {
        documentRepository.save(document);
        return "Success";
    }

    @Override
    public String updateDocument(Document document) {
        documentRepository.save(document);
        return "Success";
    }

    @Override
    public String deleteDocument(String informationId) {
        documentRepository.deleteById(informationId);
        return "Success";
    }

    public Document getDocument(String informationId) {
        return documentRepository.findById(informationId).get();
    }

}
