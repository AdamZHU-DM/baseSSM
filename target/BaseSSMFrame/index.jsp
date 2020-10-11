<%@page pageEncoding="UTF-8" contentType="text/html; utf-8" %>
<%@page isELIgnored="false" %>
<html>
<body>
<h2>Hello World!</h2>

<form action="${pageContext.request.contextPath}/student/register">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age"><br/>
    成绩：<input type="text" name="score"><br/>
    <input type="submit" value="注册">
</form>
</body>
</html>
