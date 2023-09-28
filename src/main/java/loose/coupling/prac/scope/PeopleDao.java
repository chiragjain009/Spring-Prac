package loose.coupling.prac.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
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
