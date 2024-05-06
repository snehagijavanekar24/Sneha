package com.project.spring_demo.Login.controller;

import com.project.spring_demo.Login.model.Document;
import com.project.spring_demo.Login.service.DocumentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/Document")
public class Document_controller {
    DocumentService documentService;

    public Document_controller(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping
    public String CreateInformationrDetails(@Valid @RequestBody Document document) {
        documentService.createDocument(document);
        return "Basic Document Created Successfully";
    }

    @PutMapping
    public String updateInformationDetails(@Valid @RequestBody Document document) {
        documentService.updateDocument(document);
        return "Basic document Updated Successfull";
    }

    @DeleteMapping("{documentId}")
    public String deleteInformationDetails(@PathVariable("documentId") String documentId) {
        documentService.deleteDocument(documentId);
        return "document Deleted Successfully";
    }

    @GetMapping("{documentId}")
    public Document getInformationDetails(@PathVariable("documentId") String documentId) {
        return documentService.getDocument(documentId);
    }
}
