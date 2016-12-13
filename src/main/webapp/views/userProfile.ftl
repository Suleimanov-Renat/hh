<#-- @ftlvariable name="user" type="model.User" -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-s ale=1.0"/>
    <title>HH</title>
    <link href="/css/bootstrap.css" rel="stylesheet"/>
    <link href="/css/signin.css" rel="stylesheet"/>
</head>
<body>

<div class="container">
    <h3>Имя пользователя</h3>
    <dl class="dl-horizontal">
        <dt>Город</dt>
        <dd>${user.city}</dd>
        <dt>Email</dt>
        <dd>${user.email}</dd>
        <dt>Телефон</dt>
        <dd>${user.phone}</dd>
    </dl>
<#--TODO: 10. display list of cvs-->
    <ul class="list-unstyled">
            <li><a href="hrefToCurrentCv">Название резюме</a></li>
    <#list user.resume as resume>
        <li><a href="hrefToCurrentCv">${resume.title}</a></li>
    </#list>
    </ul>
</div>
</body>
</html>