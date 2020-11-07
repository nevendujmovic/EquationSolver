package naive.tutorial;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        info = @Info(
                title="Find solution for the system of linear equations",
                description = "ax + by = u <br>" + "cx + cy = z",
                version = "1.0",
                contact = @Contact(
                        name = "My 'naive' IT tutorials series",
                        url = "https://www.linkedin.com/in/neven-dujmovic/"),
                license = @License(
                        name = "Free to use (author: Neven Dujmovic)"))
)

public class MyApi extends Application {
}

