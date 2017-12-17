<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Here</title>

    <link href="/resources/semantic/semantic.min.css" rel="stylesheet">

    <link href="/resources/css/styles.css" rel="stylesheet">
</head>
<body>

<style type="text/css">
    body {
        background-color: #DADADA;
    }

    body > .grid {
        height: 100%;
    }

    .image {
        margin-top: -100px;
    }

    .column {
        max-width: 450px;
    }
</style>

<div class="ui middle aligned center aligned grid">
    <div class="column">
        <h2 class="ui teal image header">
            <div class="content">
               Enter The Questions Web Page
            </div>
        </h2>
        <form class="ui form" method="GET" action="enterTheQuestion">
            <!--class="ui stacked segment">-->

            <div class="field">
                <div class="ui left icon input">
                    <i class="lock icon"></i>
                    <input type="password" name="password" placeholder="Password">

                </div>
            </div>
            <input type="submit" value="Login" class="ui fluid large teal submit button"></input>

            <div class="ui error message"></div>

        </form>


    </div>
</div>

<script src="/resources/jquery/jquery-3.1.1.min.js"></script>
<script src="/resources/semantic/semantic.min.js"></script>
<script>
</script>
</body>
</html>