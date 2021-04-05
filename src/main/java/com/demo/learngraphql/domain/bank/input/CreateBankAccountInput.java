package com.demo.learngraphql.domain.bank.input;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CreateBankAccountInput {

    @NotBlank(message = "first name must not be blank")
    @Size(min = 5, max = 8, message = "first name length must be between 5 and 8")
    public String firstName;

    @NotBlank(message = "last name must not be blank")
    @Size(min = 5, max = 20, message = "last name length must be between 5 and 20")
    public String lastName;

    public String address;

    public String phoneNumber;
}
