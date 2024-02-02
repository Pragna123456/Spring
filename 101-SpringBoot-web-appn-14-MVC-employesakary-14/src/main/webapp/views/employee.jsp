<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<center>
<h1 style="color: red">EMPLOYEE INVOICE</h1>
<form:form action="/employee" method="POST" modelAttribute="employees">
EMPLOYEE ID:<form:input path="eid"/><p></p>
EMPLOYEE NAME:<form:input path="ename"/><p></p>
SALARY:<form:input path="salary"/><p></p>
<input type="submit" value="EMPLOYEEINVOICE">
</form:form>
</center>



