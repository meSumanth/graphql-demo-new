package com.demo.learngraphql.resolver;

import com.demo.learngraphql.domain.bank.BankAccount;
import com.demo.learngraphql.domain.bank.Client;
import graphql.GraphQLException;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {

    public Client client(BankAccount bankAccount){
        log.info("Retrieving from client resolver");
//        throw new RuntimeException("It's not a valid account id");
        return Client.builder()
                .id(bankAccount.getId())
                .firstName("Sumanth")
                .lastName("Varada")
                .build();
    }
}
