<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>Board</title>
</head>
<body>
<h1> 게시판 </h1>
<h2> 게시글 개수 : ${boards?size}</h2>
<#list boards as board>
    <h3> ${board.title}  </h3> <h5> content: ${board.content} </h5>
</#list>
</body>
</html>