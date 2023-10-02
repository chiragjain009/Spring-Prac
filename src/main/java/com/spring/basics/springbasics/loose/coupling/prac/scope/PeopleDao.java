package com.spring.basics.springbasics.loose.coupling.prac.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class PeopleDao {

    @Autowired
    JdbcConnetion jdbcConnetion;

    public void setJdbcConnetion(JdbcConnetion jdbcConnetion) {
        this.jdbcConnetion = jdbcConnetion;
    }

    public JdbcConnetion getJdbcConnetion() {
        return jdbcConnetion;
    }


}
