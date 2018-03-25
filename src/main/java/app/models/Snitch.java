package app.models;

import org.javalite.activejdbc.Model;

/**
 * @author Adebola Olowofela
 */
public class Snitch extends Model {
    static {
        validatePresenceOf("ip_address", "user_agent");
        validatePresenceOf("snitch_key").message("Snitch key must be present");
    }
}
