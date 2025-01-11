@import exercise.dto.users.UserPage
@param UserPage page

@template.layout.page(
    content = @`
        <tr>
            <td>${page.getUser().getId()}</td>
            <td><a href="/users/${page.getUser().getId()}">${page.getUser().getFirstName()} ${page.getUser().getLastName()}</a>></td>
            <td>${page.getUser().getEmail()}</td>
        </tr>
    `
)
