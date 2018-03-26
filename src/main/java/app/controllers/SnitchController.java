package app.controllers;

import org.javalite.activeweb.AppController;

import java.util.UUID;

/**
 * @author Adebola Olowofela
 */
public class SnitchController extends AppController {

    public void index() {
    }


    public void generate() {
        // generate the new snitch key

        UUID snitchKey = UUID.randomUUID();
        String path = "/view/" + snitchKey;
        redirect(path);
        //redirect(SnitchController.class, "view", snitchKey);
    }

    public void view() {
        String snitchKey = param("snitchKey");
        snitchKey = snitchKey != null ? snitchKey : "default";
        view("snitchKey", snitchKey);
    }

    public void ping(){
        String snitchKey = param("snitchKey");
        snitchKey = snitchKey != null ? snitchKey : "default";
        view("snitchKey", snitchKey);
    }
}
