<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<center>
<h1 style="color: red">USER REGISTRATION FORM</h1>
<form:form action="/register" method="POST" modelAttribute="users">
NAME:<form:input path="name"/><p></p>
PASSWORD:<form:password path="password"/><p></p>
EMAIL:<form:input path="email"/><p></p>
MOBILE:<form:input path="mobile"/><p></p>
ADDRESS:<form:input path="address"/><p></p>
<input type="submit" value="REGISTER">
</form:form>
</center>





