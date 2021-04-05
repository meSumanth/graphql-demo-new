package com.demo.learngraphql.mutation;

import com.demo.learngraphql.domain.bank.BankAccount;
import com.demo.learngraphql.domain.bank.Currency;
import com.demo.learngraphql.domain.bank.input.BankAccountInput;
import com.demo.learngraphql.domain.bank.input.CreateBankAccountInput;
import com.demo.learngraphql.validation.CreateAccountValidationGroup;
import com.demo.learngraphql.validation.UpdateAccountValidationGroup;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.UUID;

@Slf4j
@Component
@Validated
public class BankAccountMutation implements GraphQLMutationResolver {

    public BankAccount createBankAccount(@Valid CreateBankAccountInput createBankAccountInput){
        log.info("Creating bank account");
        return BankAccount.builder()
                .id(UUID.randomUUID())
                .currency(Currency.USD)
                .build();
    }

    @Validated(CreateAccountValidationGroup.class)
    public BankAccount createAccount(@Valid BankAccountInput bankAccountInput){
        return BankAccount.builder()
                .id(UUID.randomUUID())
                .currency(Currency.USD)
                .build();
    }

    @Validated(UpdateAccountValidationGroup.class)
    public BankAccount updateAccount(@Valid BankAccountInput bankAccountInput){
        return BankAccount.builder()
                .id(UUID.randomUUID())
                .currency(Currency.USD)
                .build();
    }
}
