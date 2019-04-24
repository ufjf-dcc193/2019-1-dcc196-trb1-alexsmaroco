<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Relatório</title>
</head>
<body>
    <h1>TRB1: Relatório </h1>
   
    <table border="1">
        <tr> 
            <th>Nome</th>
            <th>Horas assistenciais</th>
            <th>Horas jurídicas</th>
            <th>Horas financeiras</th>
            <th>Horas executivas</th>
        </tr>
        <c:forEach items="${dados}" var="dado">
            <tr>
                <td> 
                    ${dado[0]}
                </td>
                <td> 
                    ${dado[1]}
                </td>
                <td> 
                    ${dado[2]}
                </td>
                <td> 
                    ${dado[3]}
                </td>
                <td> 
                    ${dado[4]}
                </td>
            </tr>
        </c:forEach>

    </table>
    <p> <a href="sedes.html"> Voltar </a></p>

</body>
</html>