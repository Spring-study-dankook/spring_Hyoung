<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>Board</title>
</head>
<body>
<h1> 게시판 </h1>
<h1>${boards?size}</h1>
<#list boards as board>
    <h3> 1. ${board.title}  </h3> <h5> content: ${board.content} </h5>
</#list>
</body>
</html>