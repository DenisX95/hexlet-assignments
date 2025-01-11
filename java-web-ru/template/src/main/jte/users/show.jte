@import exercise.dto.users.UserPage
@param UserPage page

<html>
    <head>
        <title>Пользователь</title>
    </head>
    <body>
        <h1>${page.getHeader()}</h1>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
            <tr>
                <td>${page.getUser().getId()}</td>
                <td><a href="/users/${page.getUser().getId()}">${page.getUser().getFirstName()} ${page.getUser().getLastName()}</a></td>
                <td>${page.getUser().getEmail()}</td>
            </tr>
        </table>
    </body>
</html>