<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h3 style=color:coral;text-align:center>Product Data</h3>
${successMsg} ${errorMsg}
<center><table border="1">
<tr>
<th>Product Id</th>
<th>Product Name</th>
<th>Product Product Cost</th>
<th>GST</th>
<th>Total Amount</th>
<th>Email</th>
<th>Total Amount</th>
<th>Note</th>
<th>Address</th>
<th>Contact</th>
<th>Operation</th>
</tr>
<c:forEach items="${product}" var="ob">
<tr>
<td><c:out value="${ob.prodId}"></c:out></td>
<td><c:out value="${ob.prodName}"></c:out></td>
<td><c:out value="${ob.prodCost}"></c:out></td>
<td><c:out value="${ob.gst}"></c:out></td>
<td><c:out value="${ob.prodTotal}"></c:out></td>
<td><c:out value="${ob.note}"></c:out></td>
<td><c:out value="${ob.email}"></c:out></td>
<td><c:out value="${ob.address}"></c:out></td>
<td><c:out value="${ob.contact}"></c:out></td>
<td colspan="3"><a style="color:green" href="/prod/edit?prodId=${ob.prodId}">Edit</a>|<a style="color:red" href="/prod/delete?prodId=${ob.prodId}">Delete</a> | <a style="color:navy" href="/prod/show">Add Product</a></td>
</tr>
</c:forEach>
</table></center>