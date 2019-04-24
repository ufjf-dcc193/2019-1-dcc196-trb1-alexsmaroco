<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Detalhes da atividade</title>
</head>
<body>
    <h1> Detalhes da atividade </h1>
    <h5>Edite as informações abaixo e clique em 'editar' para salvá-las</h5>

    <form action="detalhesAtividade.html?id=${atividade.id}" method="POST">
            <table>
                <tr>
                    <td> <label for="fkIdSede">Id da sede: </label> </td>
                    <td> <input disabled type="text" id="fkIdSede" name="fkIdSede" value=${atividade.fkIdSede}> </td>
                </tr>
                <tr>
                    <td> <label for="id">Id da atividade: </label> </td>
                    <td> <input disabled type="text" id="id" name="id" value=${atividade.id}> </td>
                </tr>
                <tr>
                    <td> <label for="titulo">Nome: </label> </td>
                    <td> <input type="text" id="titulo" name="titulo" value=${atividade.titulo}> </td>
                </tr>
                <tr>
                    <td> <label for="descricao">Função: </label> </td>
                    <td> <input type="text" id="descricao" name="descricao" value=${atividade.descricao}> </td>
                </tr>
                <tr>
                    <td> <label for="data_inicio">Data do início: </label> </td>
                    <td> <input type="date" id="data_inicio" name="data_inicio" value=${atividade.data_inicio}> </td>
                </tr>
                <tr>
                    <td> <label for="data_fim">Data do fim: </label> </td>
                    <td> <input type="date" id="data_fim" name="data_fim" value=${atividade.data_fim}> </td>
                </tr>
                <tr>
                    <td> <label for="horas_assistencial">Horas assistenciais: </label> </td>
                    <td> <input type="number" id="horas_assistencial" name="horas_assistencial" value=${atividade.horas_assistencial}> </td>
                </tr>
                <tr>
                    <td> <label for="horas_juridica">Horas jurídicas: </label> </td>
                    <td> <input type="number" id="horas_juridica" name="horas_juridica" value=${atividade.horas_juridica}> </td>
                </tr>
                <tr>
                    <td> <label for="horas_financeira">Horas financeiras: </label> </td>
                    <td> <input type="number" id="horas_financeira" name="horas_financeira" value=${atividade.horas_financeira}> </td>
                </tr>
                <tr>
                    <td> <label for="horas_executiva">Horas executivas: </label> </td>
                    <td> <input type="number" id="horas_executiva" name="horas_executiva" value=${atividade.horas_executiva}> </td>
                </tr>
                <tr>
                    <td> <input type="submit"/> </td>
                </tr>
            </table>
        </form>

    <p><a href="atividades.html?id_sede=${atividade.fkIdSede}"><button>Voltar</button></a></p>

</body>
</html>