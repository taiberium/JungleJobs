<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Skinseller</title>
    <!-- Bootstrap -->
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/css/skinseller.css" rel="stylesheet">
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <script> context = "";</script>
    <script src="/resources/js/news.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/resources/js/bootstrap.min.js"></script>
</head>
<body>

<%--Top menu--%>
<nav class="navbar navbar-static-top navbar-dark bg-inverse">

</nav>

<div class="container">

    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3">Hello, Jungle!</h1>
            <p>You always can return to main page, just push the button!</p>
            <p><a class="btn btn-primary btn-lg" href="/" role="button">Main page</a></p>
        </div>
    </div>

    <jsp:include page="${requestScope.path}"/>

    <hr>

    <footer>
        <p>© Company 2015</p>
    </footer>
</div>

</body>
</html>