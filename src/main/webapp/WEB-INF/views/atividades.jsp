<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Atividades</title>
</head>
<body>
    <h1> Atividades da sede </h1>
    <a href="novaAtividade.html?id_sede=${id_sede}"><button>Registrar nova atividade</button></a>

    <h4>Lista de atividades</h4>
    
    <table border="1">
        <tr> 
            <th>Nome</th>
            <th colspan="2">Ações</th>
        </tr>
        <c:forEach items="${atividades}" var="ativ">
            <tr>
                <td> 
                    ${ativ.titulo}
                </td>
                <td> 
                    <a href="detalhesAtividade.html?id=${ativ.id}"> <button>Editar</button> </a> 
                </td>
                <td> 
                    <form action="atividades.html?id_ativ=${ativ.id}&id_sede=${id_sede}" method="POST">
                        <input type="submit" value="Excluir"/>
                    </form>
                </td>
            </tr>
        </c:forEach>

    </table>
    <p><a href="detalhesSede.html?id=${id_sede}"><button>Voltar</button></a></p>
</body>
</html>