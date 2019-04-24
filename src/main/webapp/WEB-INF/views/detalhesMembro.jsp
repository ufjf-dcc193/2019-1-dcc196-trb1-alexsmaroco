<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Detalhes do membro</title>
</head>
<body>
    <h1> Detalhes do membro </h1>
    <h5>Edite as informações abaixo e clique em 'editar' para salvá-las</h5>

    <form action="detalhesMembro.html?id=${membro.id}" method="POST">
            <table>
                <tr>
                    <td> <label for="fkIdSede">Id da sede: </label> </td>
                    <td> <input disabled type="text" id="fkIdSede" name="fkIdSede" value=${membro.fkIdSede}> </td>
                </tr>
                <tr>
                    <td> <label for="id">Id do membro: </label> </td>
                    <td> <input disabled type="text" id="id" name="id" value=${membro.id}> </td>
                </tr>
                <tr>
                    <td> <label for="nome_completo">Nome: </label> </td>
                    <td> <input type="text" id="nome_completo" name="nome_completo" value=${membro.nome_completo}> </td>
                </tr>
                <tr>
                    <td> <label for="funcao">Função: </label> </td>
                    <td> <input type="text" id="funcao" name="funcao" value=${membro.funcao}> </td>
                </tr>
                <tr>
                    <td> <label for="email">Email: </label> </td>
                    <td> <input type="text" id="email" name="email" value=${membro.email}> </td>
                </tr>
                <tr>
                    <td> <label for="data_inicio">Data de entrada: </label> </td>
                    <td> <input type="date" id="data_inicio" name="data_inicio" value=${membro.data_inicio}> </td>
                </tr>
                <tr>
                    <td> <label for="data_fim">Data de saída: </label> </td>
                    <td> <input type="date" id="data_fim" name="data_fim" value=${membro.data_fim}> </td>
                </tr>
                <tr>
                    <td> <input type="submit"/> </td>
                </tr>
            </table>
        </form>

    <p><a href="membros.html?id_sede=${membro.fkIdSede}"><button>Voltar</button></a></p>

</body>
</html>