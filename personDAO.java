package scope_of_beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository    //used specifically for talking to the database.In general, you can use @component to create beans.
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class personDAO {
	@Autowired
	JdbcConnection jdbc;

	public JdbcConnection getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcConnection jdbc) {
		this.jdbc = jdbc;
	}
	

}
