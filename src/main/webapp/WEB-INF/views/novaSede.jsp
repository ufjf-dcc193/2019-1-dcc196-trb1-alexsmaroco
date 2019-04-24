<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Criação de sedes</title>
</head>
<body>
    <h1> Nova sede </h1>

    <form action="novaSede.html" method="POST">
        <table>
            <tr>
                <td> <label for="nome_fantasia">Nome: </label> </td>
                <td> <input type="text" id="nome_fantasia" name="nome_fantasia"> </td>
            </tr>
            <tr>
                <td> <label for="estado">Estado: </label> </td>
                <td> <input type="text" id="estado" name="estado"> </td>
            </tr>
            <tr>
                <td> <label for="cidade">Cidade: </label> </td>
                <td> <input type="text" id="cidade" name="cidade"> </td>
            </tr>
            <tr>
                <td> <label for="bairro">Bairro: </label> </td>
                <td> <input type="text" id="bairro" name="bairro"> </td>
            </tr>
            <tr>
                <td> <label for="website">Website: </label> </td>
                <td> <input type="text" id="website" name="website"> </td>
            </tr>
            <tr>
                <td> <label for="telefone">Telefone: </label> </td>
                <td> <input type="number" id="telefone" name="telefone"> </td>
            </tr>
            <tr>
                <td> <input type="submit"/> </td>
            </tr>
        </table>
    </form>
    <p><a href="sedes.html"><button>Voltar</button></a></p>
</body>
</html>