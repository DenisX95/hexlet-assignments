@import exercise.util.NamedRoutes
@import exercise.dto.LoginPage

@param LoginPage page = null

@template.layout.page(
content = @`
    <form action="${NamedRoutes.loginPath()}" method="post">
        <input type="text" placeholder="Nickname" name="name" />
        <input type="password" placeholder="Password" name="password" />
        <button type="submit">Войти</button>
    </form>

    @if(page != null && !page.getError().isEmpty())
        <p>${page.getError()}</p>
    @endif
    `
)