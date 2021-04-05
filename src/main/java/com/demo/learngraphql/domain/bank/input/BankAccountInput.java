package com.demo.learngraphql.domain.bank.input;

import com.demo.learngraphql.validation.CreateAccountValidationGroup;
import com.demo.learngraphql.validation.UpdateAccountValidationGroup;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class BankAccountInput {

    @NotEmpty(groups = {CreateAccountValidationGroup.class, UpdateAccountValidationGroup.class})
    @Size(min = 5, max = 20)
    private String firstName;

    @NotEmpty(groups = {CreateAccountValidationGroup.class, UpdateAccountValidationGroup.class})
    @Size(min = 5, max = 20)
    private String lastName;

    @Email(groups = {CreateAccountValidationGroup.class, UpdateAccountValidationGroup.class}, message = "Please enter a valid email address")
    private String email;

    @NotEmpty(groups = {CreateAccountValidationGroup.class, UpdateAccountValidationGroup.class}, message = "Phone Number must not be empty")
    private String phoneNumber;

    @NotEmpty(groups = {UpdateAccountValidationGroup.class})
    private String street;

    @NotEmpty(groups = {UpdateAccountValidationGroup.class})
    private String houseNumber;

    @NotEmpty(groups = {UpdateAccountValidationGroup.class})
    private String zipCode;

    @NotEmpty(groups = {UpdateAccountValidationGroup.class})
    private String city;

    @NotEmpty(groups = {UpdateAccountValidationGroup.class})
    private String country;

}
