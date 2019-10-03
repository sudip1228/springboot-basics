package scope_of_beans.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //used specifically for business service.it is same as @component.
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class componentpersonDAO {
	@Autowired
	componentJdbcConnection jdbc;

	public componentJdbcConnection getJdbc() {
		return jdbc;
	}

	public void setJdbc(componentJdbcConnection jdbc) {
		this.jdbc = jdbc;
	}

		

}
