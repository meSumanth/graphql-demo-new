package com.demo.learngraphql.exception;

import graphql.GraphQLException;
import graphql.kickstart.spring.error.ThrowableGraphQLError;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;

@Component
public class GraphQlExceptionHandler {

    @ExceptionHandler(GraphQLException.class)
    public ThrowableGraphQLError handle(GraphQLException e){
        return new ThrowableGraphQLError(e);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ThrowableGraphQLError handle(ConstraintViolationException e){
        return new ThrowableGraphQLError(e,e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public ThrowableGraphQLError handle(RuntimeException e){
        return new ThrowableGraphQLError(e,"Internal Server Error. Please try again later!");
    }
    @ExceptionHandler(Exception.class)
    public ThrowableGraphQLError handle(Exception e){
        return new ThrowableGraphQLError(e, e.getMessage());
    }
}
