<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
        		        rel="stylesheet"
        		        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
        		        crossorigin="anonymous">
</head>
<body class="bg-success p-2 text-dark bg-opacity-25">
    <div class="container">
       <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Kolumna1</th>
                        <th>Kolumna2</th>
                        <th>Kolumna3</th>
                        <th>Kolumna4</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${data}" var="name">
                        <tr>
                            <td>${name.id}</td>
                            <td>${name.firstColumn}</td>
                            <td>${name.secondColumn}</td>
                            <td>${name.thirdColumn}</td>
                            <td>${name.fourthColumn}</td>
                        </tr>
                    </c:forEach>
                </tbody>
        </table>
    </div>
</body>
</html>