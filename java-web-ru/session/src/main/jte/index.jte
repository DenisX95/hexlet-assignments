@import exercise.util.NamedRoutes
@import exercise.dto.MainPage

@param MainPage page = null

@template.layout.page(
content = @`
    @if(page.getName() != null)
        <h1>${String.valueOf(page.getName())}</h1>
        <form action="${NamedRoutes.logoutPath()}" method="post">
            <button type="submit">Выйти</button>
        </form>
    @else
        <a href="${NamedRoutes.buildSessionPath()}">Войти</a>
    @endif

`
)