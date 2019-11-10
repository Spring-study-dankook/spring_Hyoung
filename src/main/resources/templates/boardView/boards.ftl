<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>Board</title>
</head>
<body>
<h1> 게시판 </h1>
<#list boards as board>
    <h3> [ ${board.type} ]  ${board.title}  </h3>
    <h5> contents : ${board.content} </h5>
</#list>
<h3> 게시글 수 : ${boards?size}</h3>
</body>
</html>