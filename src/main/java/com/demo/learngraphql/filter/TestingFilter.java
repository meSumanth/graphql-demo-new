package com.demo.learngraphql.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
@WebFilter(urlPatterns = "/*")
public class TestingFilter implements Filter {

    private static final String RACF  = "racf";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("Filter invoked");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String racf = request.getHeader(RACF);
        if(StringUtils.isBlank(racf)){
            ((HttpServletResponse)servletResponse).setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        } else{
            filterChain.doFilter(servletRequest, servletResponse);
        }
        log.info("filter completed");
    }
}
