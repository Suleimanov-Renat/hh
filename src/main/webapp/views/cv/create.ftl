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
<#--TODO: 10: set params to fields-->
<div class="container" style="min-width: 1000px">
    <h3>Резюме</h3>
    <div class="jumbotron" style="padding: 10px 30px 20px">
        <div class="row">
            <form action="/cv?action=create" method="get" class="form-horizontal" id="cvform" role="form">
                <input class="hidden" name="user" value="1"/>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Заголовок</label>
                    <div class="col-lg-10"><input type="text"  data-required="true" /></div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Текст</label>
                    <div class="col-lg-10"><textarea ></textarea></div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Образование</label>
                    <div class="col-lg-10"><input type="text" /></div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Опыт</label>
                    <div class="col-lg-10"><input type="number" /></div>
                </div>

                <button class="btn btn-primary btn-lg" type="submit">Сохранить</button>
            </form>
        </div>
    </div>



</div>
</body>
</html>