package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;
import exercise.dto.MainPage;
import exercise.dto.LoginPage;
import exercise.repository.UsersRepository;
import static exercise.util.Security.encrypt;

import exercise.util.Security;
import io.javalin.http.Context;

public class SessionsController {

    // BEGIN
    public static void build(Context ctx) {
        ctx.render("build.jte");
    }

    public static void create(Context ctx) {
        String name = ctx.formParam("name");
        String formPassword = Security.encrypt(ctx.formParam("password"));

        var user = UsersRepository.findByName(name).orElse(null);

        if (user != null) {
            String password = user.getPassword();

            if (formPassword.equals(password)) {
                ctx.sessionAttribute("currentUser", user.getName());
                ctx.redirect("/");
                return;
            }
        }

        String error = "Wrong username or password";
        var page = new LoginPage(name, error);
        ctx.render("build.jte", model("page", page));
    }

    public static void destroy(Context ctx) {
        ctx.sessionAttribute("currentUser", null);
        ctx.redirect("/");
    }

    public static void show(Context ctx) {
        var page = new MainPage(ctx.sessionAttribute("currentUser"));
        ctx.render("index.jte", model("page", page));
    }
    // END
}
