package app.controllers;

import org.javalite.activeweb.DBControllerSpec;
import org.junit.Test;

/**
 * @author Adebola Olowofela
 */
public class SnitchControllerSpec extends DBControllerSpec {


    @Test
    public void shouldDisplayForm() {
        request().get("index"); //<< this is where we execute the controller
        // make test pass for now
//        a(true).shouldBeEqual(true);
    }
}
