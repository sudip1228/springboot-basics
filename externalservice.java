package properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class externalservice {

	@Value("${sudip}")
	private String url;
	
	public String returnserviceurl()
	{
		return url;
	}
	
	
}
