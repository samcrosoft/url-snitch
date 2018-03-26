package app.config;

import app.controllers.SnitchController;
import org.javalite.activeweb.AbstractRouteConfig;
import org.javalite.activeweb.AppContext;

/**
 * Created by Samuel on 26/03/2018.
 */
public class RouteConfig extends AbstractRouteConfig {
    public void init(AppContext appContext) {
        route("/generate").to(SnitchController.class).action("generate");
        route("/{snitchKey}").to(SnitchController.class).action("ping");
        route("/{action}/{snitchKey}").to(SnitchController.class);
    }
}