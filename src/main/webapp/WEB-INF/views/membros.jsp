<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Membros</title>
</head>
<body>
    <h1> Membros da sede </h1>
    <a href="novoMembro.html?id_sede=${id_sede}">Registrar novo membro</a>

    <h4>Lista de membros</h4>
    
    <table border="1">
        <tr> 
            <th>Nome</th>
            <th colspan="2">Ações</th>
        </tr>
        <c:forEach items="${membros}" var="membro">
            <tr>
                <td> 
                    ${membro.nome_completo}
                </td>
                <td> 
                    <a href="detalhesMembro.html?id=${membro.id}"> <button>Editar</button> </a> 
                </td>
                <td> 
                    <form action="membros.html?id_membro=${membro.id}&id_sede=${id_sede}" method="POST">
                        <input type="submit" value="Excluir"/>
                    </form>
                </td>
            </tr>
        </c:forEach>

    </table>
    <a href="detalhesSede.html?id=${id_sede}">Voltar</a>
</body>
</html>