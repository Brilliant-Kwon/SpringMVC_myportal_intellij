﻿<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false"
%>
<%--jstl 사용하기 위해 라이브러리 추가--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%--<script type="text/javascript" src="<%=request.getContextPath()%>/js/form.js"></script>--%>
    <title>방명록</title>
</head>
<body>

<%--<form action="<%=request.getContextPath()%>/add.jsp" method="post" onsubmit="return checkForm(this)">--%>
<form action="<%=request.getContextPath()%>/add.jsp" method="post">
    <table border=1 width=500>
        <tr>
            <td>이름</td>
            <td><input type="text" name="name"></td>
            <td>비밀번호</td>
            <td><input type="password" name="pass"></td>
        </tr>
        <tr>
            <td colspan=4><textarea name="content" cols=60 rows=5></textarea></td>
        </tr>
        <tr>
            <td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
        </tr>
    </table>
</form>
<br/>

<%--JSTL LOOP--%>
<%--실려온 객체 list 뿌려줄 것--%>
<%--vo는 list를 each 하나씩 나눈 이름임--%>
<c:forEach items="${list}" var="vo">

<table width=620 border=1>
    <tr>
        <td>[${vo.no}]
        </td>
        <td>${vo.name}
        </td>
        <td>${vo.regDate}
        </td>
        <td align="center">
            <form method="post" action="<%=request.getContextPath()%>/delete"
                  style="margin-top:auto;margin-bottom:auto;">
                <input type="hidden" name="no">
                <input type="hidden" name="pass">
                <input type="submit" value="삭제">
            </form>
        </td>
        <td align="center">
            <form method="post" action="<%=request.getContextPath()%>/modify.jsp"
                  style="margin-top:auto;margin-bottom:auto;">
                <input type="hidden" name="no">
                <input type="hidden" name="pass">
                <input type="submit" value="수정">
            </form>
        </td>
    </tr>
    <tr>
        <td colspan=5>${vo.content}
        </td>
    </tr>
</table>
<br>

</c:forEach>

</body>
</html>