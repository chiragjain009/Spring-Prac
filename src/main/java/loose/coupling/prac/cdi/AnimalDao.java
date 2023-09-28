package loose.coupling.prac.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

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
