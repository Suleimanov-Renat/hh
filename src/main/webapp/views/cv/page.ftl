<#-- @ftlvariable name="cv" type="model.CV" -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>HH</title>
    <link href="/css/bootstrap.css" rel="stylesheet"/>
    <link href="/css/signin.css" rel="stylesheet"/>
    <script src="/js/jquery-1.10.2.min.js"></script>
</head>
<body>

<div class="container" style="min-width: 1000px">
    <h3 >${cv.title}</h3>
    <h5><a style="cursor: pointer" href="/user?action=get&id=${cv.owner.id}">${cv.owner.name}</a></h5>

    <div class="jumbotron" style="padding: 10px 30px 20px">
        <div class="row">
            <div class="col-xs-3"><h4>Образование</h4><h5>${cv.education}</h5></div>
            <div class="col-xs-2"><h4>Опыт</h4><h5>${cv.experience}</h5></div>
            <div class="col-xs-2"><h4>Город</h4><h5 >${cv.owner.city}</h5></div>
            <div class="col-xs-3"><h4>Email</h4><h5>${cv.owner.email}</h5></div>
            <div class="col-xs-2"><h4>Телефон</h4><h5>${cv.owner.phone}</h5></div>
        </div>
    </div>

    <p>${cv.text}</p>
</div>
</body>
</html>