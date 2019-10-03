package scope_of_beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode=ScopedProxyMode.TARGET_CLASS)//use proxy to create more than one bean for dependency class.scopeprototype only is not enough to create multiple beans for this dependency class.
public class JdbcConnection {
	
public JdbcConnection() {
	System.out.println("jdbc connection");
}
	
}
