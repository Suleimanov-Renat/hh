<#-- @ftlvariable name="cvList" type="java.util.List<model.CV>" -->
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8"/>
   <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
   <title>HH</title>
   <link href="/css/bootstrap.css" rel="stylesheet"/>
   <link href="/css/signin.css" rel="stylesheet"/>
   <script src="/js/jquery-1.10.2.min.js"></script>
   <script src="/js/jquery-ui.min.js"></script>
   <link href="/css/jquery-ui.min.css" rel="stylesheet"/>
</head>
<body>

<div class="container">
   <h3>Каталог резюме</h3>
    <div class="row">
        <div class="col-lg-12">
            <ul class="list-unstyled">
            <#list cvList as cv>
                <li>
                    <div class="col-xs-6"><a href="/cv?action=get&id=${cv.id}">${cv.title}</a></div>
                    <div class="col-xs-3">
                        <small>${cv.experience } года/лет</small>
                    </div>
                    <div class="col-xs-3">
                        <small>${cv.owner.city}</small>
                    </div>
                </li>
                </li>
            </#list>
            </ul>
        </div>
    </div>
</div>
</body>
</html>