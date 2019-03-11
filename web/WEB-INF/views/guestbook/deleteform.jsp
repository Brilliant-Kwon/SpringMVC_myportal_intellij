<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>방명록</title>
</head>
<body>
<%
//    ServletContext context = request.getServletContext();
//    String dbUser = context.getInitParameter("dbUser");
//    String dbPass = context.getInitParameter("dbPass");

    String no = request.getParameter("no");
    String pass = request.getParameter("pass");

    System.out.println("delete form param: "+no + " / " + pass);

//    GuestBookDao dao = new GuestBookDaoImpl(dbUser, dbPass);
//    boolean success = dao.delete(Long.valueOf(no));
%>

<form method="post" action="<%=request.getContextPath()%>/delete.jsp">
    <input type='hidden' name="no" value="<%=no%>">
    <input type='hidden' name="pass" value="<%=pass%>">
    <table>
        <tr>
            <td>비밀번호</td>
            <td><input type="password" name="inpass"></td>
            <td><input type="submit" value="확인"></td>
            <td><a href="<%=request.getContextPath()%>/list.jsp">메인으로 돌아가기</a></td>
        </tr>
    </table>
</form>
</body>
</html>