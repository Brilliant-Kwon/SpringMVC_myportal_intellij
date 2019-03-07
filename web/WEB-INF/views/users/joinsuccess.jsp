<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Homepage</title>
    <!-- TODO: 현재 페이지에 적절한 CSS를 임포트하십시오. -->
    <link type="text/css"
          rel="stylesheet"
          href="<%= request.getContextPath() %>/css/users.css"/>
</head>
<body>
<div id="container">
    <%--HEADER영역--%>
    <jsp:include page="../includes/header.jsp"/>
    <%--NAVIGATION영역--%>
    <jsp:include page="../includes/navigation.jsp"/>
    <div id="wrapper">
        <div id="content">
            <!-- Content 영역 -->
            <div id="user">

                <p class="jr-success">
                    회원 가입을 축하합니다.
                </p>

            </div>

        </div>
    </div>
    <%--<%@include file="../includes/footer.jsp"%>--%>
    <jsp:include page="../includes/footer.jsp"/>
</div>
</body>
</html>