package com.demo.learngraphql.domain.bank;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Builder
@Setter
@Getter
public class Client {
    UUID id;
    String firstName;
    List<String> middleName;
    String lastName;
}
