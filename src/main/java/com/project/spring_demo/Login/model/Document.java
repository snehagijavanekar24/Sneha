package com.project.spring_demo.Login.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Document")
public class Document {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private String documentId;

        @Lob
        private byte[] PanCard;

        @Lob
        private byte[] AadharCard;

        @Lob
        private byte[] Photo;

        @Lob
        private byte[] AddressProof;

        @Lob
        private byte[] Highest_QualiFication_Certificate;

        @Lob
        private byte[] Last_Company_Relieving_Letter;

        @Lob
        private byte[] Bank_Details;

        @NotEmpty(message = "FullName should not be empty")
        @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
        private String Bank_Name;

        @NotEmpty(message = "FullName should not be empty")
        @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
        private String Account_Holder_Name;

        @NotEmpty(message = "Relieving Date should not be empty")
        @Pattern(regexp = "^[0-9]+$",message = "Relieving  be number only")
        private String Account_No;

        @NotEmpty(message = "FullName should not be empty")
        @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
        private String IFSC_Code;



}
