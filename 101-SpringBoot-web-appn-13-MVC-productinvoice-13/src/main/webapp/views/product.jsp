<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<center>
<h1 style="color: red">PRODUCT INVOICE</h1>
<form:form action="/product" method="POST" modelAttribute="product">
CUSTOMER ID:<form:input path="cid"/><p></p>
CUSTOMER NAME:<form:input path="cname"/><p></p>
MOBILE:<form:input path="mobile"/><p></p>
PRODUCT NAME:<form:input path="pname"/><p></p>
PRICE:<form:input path="price"/><p></p>
QUANTITY:<form:input path="quant"/><p></p>
<input type="submit" value="PRODUCTINVOICE">
</form:form>
</center>



