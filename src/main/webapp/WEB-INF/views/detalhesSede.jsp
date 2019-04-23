<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Detalhes da sede</title>
</head>
<body>
    <h1>TRB1: Detalhes sede </h1>

    <form action="detalhesSede.html?id=${sede.id}" method="POST">
        <table>
            <tr>
                <td> <label for="nome_fantasia">Nome: </label> </td>
                <td> <input type="text" id="nome_fantasia" name="nome_fantasia" value=${sede.nome_fantasia}> </td>
            </tr>
            <tr>
                <td> <label for="estado">Estado: </label> </td>
                <td> <input type="text" id="estado" name="estado" value=${sede.estado}> </td>
            </tr>
            <tr>
                <td> <label for="cidade">Cidade: </label> </td>
                <td> <input type="text" id="cidade" name="cidade" value=${sede.cidade}> </td>
            </tr>
            <tr>
                <td> <label for="bairro">Bairro: </label> </td>
                <td> <input type="text" id="bairro" name="bairro" value=${sede.bairro}> </td>
            </tr>
            <tr>
                <td> <label for="website">Website: </label> </td>
                <td> <input type="text" id="website" name="website" value=${sede.website}> </td>
            </tr>
            <tr>
                <td> <label for="telefone">Telefone: </label> </td>
                <td> <input type="number" id="telefone" name="telefone" value=${sede.telefone}> </td>
            </tr>
            <tr>
                <td> <input type="submit" name="Editar"/> </td>
            </tr>
        </table>
    </form>
    <a href="sedes.html">Voltar</a>
</body>
</html>