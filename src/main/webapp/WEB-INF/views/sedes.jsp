<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Sedes</title>
</head>
<body>
    <h1>TRB1: Sedes </h1>
    <a href="novaSede.html">Registrar nova sede</a>

    <h4>Lista de sedes(clique para ver detalhes)</h4>
    
    <table>

        <c:forEach items="${sedes}" var="sede">
            <tr> <td> <a href="detalhesSede.html?id=${sede.id}">${sede.nome_fantasia} </a> </td> </tr>
        </c:forEach>

    </table>

</body>
</html>