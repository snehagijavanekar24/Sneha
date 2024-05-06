package com.project.spring_demo.Registration.model;

import jakarta.persistence.*;
//import jakarta.validation.constraints.*;
import jakarta.validation.constraints.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Basic_Information")
public class Information {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private String informationId;

        @NotEmpty(message = "FullName should not be empty")
        @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
        private String fullname;

        @NotBlank
        @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",message = "Should be number only")
        @Size(min = 10,max = 10,message = "Phonenumber should be only of 10 digit only")
        @NotBlank(message = "Should be not empty and numberic only")
        private String phoneNumber;

        @Email(message = "Email should be Valid")
        @Pattern(message = "Invalid email id", regexp = "^.+@.+\\..+$")
        private String email;

        @NotEmpty(message = "BroupGroup should not be empty")
        @Size(min = 1,max = 2,message = "Please enter valid blood Group")
        @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
        private String bloodGroup;

        @NotEmpty(message = "Address should not be empty")
        private String address1;

        @NotEmpty(message = "Address should not be empty")
        private String address2;

        @NotEmpty(message = "FullName should not be empty")
        @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
        private String city;

        @NotEmpty(message = "FullName should not be empty")
        @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
        private String state;

        @Pattern(regexp = "^[0-9]+$",message = "Should be number only")
        @Size(min = 6,max = 6,message = "Phonenumber should be only of 6 digit only")
        @NotBlank(message = "Should be not empty and numberic only")
        private String Pincode;

        @NotEmpty(message = "Highest Qualification should not be empty")
        @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
        private String qualification;

        @Pattern(regexp = "^[0-9]+$",message = "Year be number only")
        @Size(min = 4,max = 4,message = "Year should be only of 4 digit only")
        @NotBlank(message = "Should be not empty and numberic only")
        private String Year;

        @Pattern(regexp = "^[0-9]+$",message = "Total Experenience be number only")
        @Size(min = 1,max = 2,message = "Total Experience should be only of 1 to 2 digit only")
        @NotBlank(message = "Should be not empty and numberic only")
        private String Total_Experience;

        @NotEmpty(message = "Last Company Name should not be empty")
        private String lastCompanyName;

        @NotEmpty(message = "Joining Date should not be empty")
        @Pattern(regexp = "^[0-9]+$",message = "Jioining Date be number only")
        private String Joining_Date;

        @NotEmpty(message = "Relieving Date should not be empty")
        @Pattern(regexp = "^[0-9]+$",message = "Relieving  be number only")
        private String Relieving_Date;

        @NotEmpty(message = "Reference Name should not be empty")
        @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
        private String Ref_1_Name;

        @NotEmpty(message = "Relation should not be empty")
        @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
        private String Ref_1_Relation;

        @NotBlank
        @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",message = "Should be number only")
        @Size(min = 10,max = 10,message = "Phonenumber should be only of 10 digit only")
        @NotBlank(message = "Should be not empty and numberic only")
        private String Ref_1_Contact_No;

        @NotEmpty(message = "Address should not be empty")
        private String ref_1_address1;

        @NotEmpty(message = "Reference Name should not be empty")
        @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
        private String Ref_2_Name;

        @NotEmpty(message = "Relation should not be empty")
        @Pattern(regexp = "^[A-Za-z\s]+$",message = "Should be only alphabets")
        private String Ref_2_Relation;

        @NotBlank
        @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$",message = "Should be number only")
        @Size(min = 10,max = 10,message = "Phonenumber should be only of 10 digit only")
        @NotBlank(message = "Should be not empty and numberic only")
        private String Ref_2_Contact_No;

        @NotEmpty(message = "Address should not be empty")
        private String ref_2_address1;

}
