@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
    content = @`
        @for(var user : page.getUsers())
            <tr>
                <td>${user.getId()}</td>
                <td><a href="/users/${user.getId()}">${user.getFirstName()} ${user.getLastName()}</a></td>
                <td>${user.getEmail()}</td>
            </tr>
        @endfor
    `
)
