@import exercise.dto.users.UsersPage
@param UsersPage page

<html>
    <head>
        <title>Пользователи</title>
    </head>
    <body>
        <h1>${page.getHeader()}</h1>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
            @for(var user : page.getUsers())
            <tr>
                <td>${user.getId()}</td>
                <td><a href="/users/${user.getId()}">${user.getFirstName()} ${user.getLastName()}</a></td>
                <td>${user.getEmail()}</td>
            </tr>
            @endfor
        </table>
    </body>
</html>