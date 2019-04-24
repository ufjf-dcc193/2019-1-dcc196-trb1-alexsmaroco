<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Sedes</title>
</head>
<body>
    <h1> Sedes </h1>
    <a href="novaSede.html"><button>Registrar nova sede</button></a>

    <h4>Lista de sedes</h4>
    
    <table border="1">
        <tr> 
            <th>Nome</th>
            <th colspan="2">Ações</th>
        </tr>
        <c:forEach items="${sedes}" var="sede">
            

            <tr>
                <td> 
                    ${sede.nome_fantasia}
                </td>
                <td> 
                    <a href="detalhesSede.html?id=${sede.id}"> <button> Detalhes </button> </a> 
                </td>
                <td> 
                    <form action="sedes.html?id=${sede.id}" method="POST">
                        <input type="submit" value="Excluir"/>
                    </form>
                </td>
            </tr>
        </c:forEach>

    </table>
    <p> <a href="relatorio.html"> <button>Ver relátorio de horas por sede</button></a></p>

</body>
</html>