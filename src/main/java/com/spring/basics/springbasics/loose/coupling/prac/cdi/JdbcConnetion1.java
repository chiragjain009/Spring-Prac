package com.spring.basics.springbasics.loose.coupling.prac.cdi;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Component
public class JdbcConnetion1 {
    public void createConnection(){
        System.out.println("Connection created");
    }
}
