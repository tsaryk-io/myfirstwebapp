<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>List Todos Page</title>
</head>
<body>
<div>Welcome to the List Todo Page, ${name}!</div>
<div>Your Todos are ${todos}</div>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Description</th>
        <th>Target Date</th>
        <th>Is Completed?</th>
    </tr>
    </thead>
<c:forEach items="${todos}" var="todo">
    <tr>
        <td>${todo.id}</td>
        <td>${todo.description}</td>
        <td>${todo.targetDate}</td>
        <td>${todo.done}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>