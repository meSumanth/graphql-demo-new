package com.demo.learngraphql.resolver;

import com.demo.learngraphql.domain.bank.BankAccount;
import com.demo.learngraphql.domain.bank.Client;
import com.demo.learngraphql.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id){
        log.info("Retrieving the bank account");
        return BankAccount.builder()
                .id(id)
                .currency(Currency.USD)
                .build();
    }
}
