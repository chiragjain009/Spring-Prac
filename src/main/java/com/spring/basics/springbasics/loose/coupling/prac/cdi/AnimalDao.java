package com.spring.basics.springbasics.loose.coupling.prac.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalDao {

    @Autowired
    JdbcConnetion1 jdbcConnetion;

    public void setJdbcConnetion(JdbcConnetion1 jdbcConnetion) {
        this.jdbcConnetion = jdbcConnetion;
    }

    public JdbcConnetion1 getJdbcConnetion() {
        return jdbcConnetion;
    }


}
