<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Criação de membros</title>
</head>
<body>
    <h1>TRB1: Novo membro </h1>

    <form action="novoMembro.html?id_sede=${id_sede}" method="POST">
        <table>
            <tr>
                <td> <label for="nome_completo">Nome: </label> </td>
                <td> <input type="text" id="nome_completo" name="nome_completo"> </td>
            </tr>
            <tr>
                <td> <label for="funcao">Função: </label> </td>
                <td> <input type="text" id="funcao" name="funcao"> </td>
            </tr>
            <tr>
                <td> <label for="email">Email: </label> </td>
                <td> <input type="text" id="email" name="email"> </td>
            </tr>
            <tr>
                <td> <label for="data_inicio">Data de entrada: </label> </td>
                <td> <input type="date" id="data_inicio" name="data_inicio"> </td>
            </tr>
            <tr>
                <td> <label for="data_fim">Data de saída: </label> </td>
                <td> <input type="date" id="data_fim" name="data_fim"> </td>
            </tr>
            <tr>
                <td> <input type="submit"/> </td>
            </tr>
        </table>
    </form>
    <a href="membros.html?id_sede=${id_sede}">Voltar</a>
</body>
</html>