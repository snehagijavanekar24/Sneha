package com.project.spring_demo.Login.service;

import com.project.spring_demo.Login.model.Document;


public interface DocumentService {
    public String createDocument(Document document);
    public String updateDocument(Document document);
    public String deleteDocument(String informationId);
    public Document getDocument(String informationId);
}
