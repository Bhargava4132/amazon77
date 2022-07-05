package amazon77_login;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/time")
@Produces("text/plain")
public class TimeResource {
	@GET
	public String getTime() {
		return new Date().toString();
	}
}
