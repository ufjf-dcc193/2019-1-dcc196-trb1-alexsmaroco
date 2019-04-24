<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Criação de atividades</title>
</head>
<body>
    <h1>TRB1: Nova atividade </h1>

    <form action="novaAtividade.html?id_sede=${id_sede}" method="POST">
        <table>
            <tr>
                <td> <label for="titulo">Título: </label> </td>
                <td> <input type="text" id="titulo" name="titulo"> </td>
            </tr>
            <tr>
                <td> <label for="descricao">Descrição: </label> </td>
                <td> <input type="text" id="descricao" name="descricao"> </td>
            </tr>
            <tr>
                <td> <label for="data_inicio">Data do início: </label> </td>
                <td> <input type="date" id="data_inicio" name="data_inicio"> </td>
            </tr>
            <tr>
                <td> <label for="data_fim">Data do fim: </label> </td>
                <td> <input type="date" id="data_fim" name="data_fim"> </td>
            </tr>
            <tr>
                <td> <label for="horas_assistencial">Horas assistenciais: </label> </td>
                <td> <input type="number" id="horas_assistencial" name="horas_assistencial"> </td>
            </tr>
            <tr>
                <td> <label for="horas_juridica">Horas jurídicas: </label> </td>
                <td> <input type="number" id="horas_juridica" name="horas_juridica"> </td>
            </tr>
            <tr>
                <td> <label for="horas_financeira">Horas financeiras: </label> </td>
                <td> <input type="number" id="horas_financeira" name="horas_financeira"> </td>
            </tr>
            <tr>
                <td> <label for="horas_executiva">Horas executivas: </label> </td>
                <td> <input type="number" id="horas_executiva" name="horas_executiva"> </td>
            </tr>
            <tr>
                <td> <input type="submit"/> </td>
            </tr>
        </table>
    </form>
    <a href="atividades.html?id_sede=${id_sede}">Voltar</a>
</body>
</html>