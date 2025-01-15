@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
    content = @`
        @if(!page.getUsers().isEmpty())
            <ul>
            @for(var user : page.getUsers())
                <li>${user.getFirstName()} ${user.getLastName()}</li>
            @endfor
            </ul>
        @endif
        <form action="/courses" method="get">
            <input type="search" required name="term" value="${page.getTerm()}">
            <input type="submit" value="Искать">
        </form>
    `
)