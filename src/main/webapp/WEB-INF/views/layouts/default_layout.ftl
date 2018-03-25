<#setting url_escaping_charset='utf-8'>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link href="${context_path}/css/main.css" rel="stylesheet" type="text/css"/>
    <title>ActiveWeb - <@yield to="title"/></title>
</head>
<body>

<div class="main">
<#include "header.ftl" >
    <div class="content">
    ${page_content}
    </div>
<#include "footer.ftl" >
</div>

</body>

</html>
