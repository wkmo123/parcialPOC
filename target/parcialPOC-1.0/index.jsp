<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Parcial POC</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <form action="control" method="POST">
            <ul>
                <li>
                    <label>Nombres: </label>
                    <input type="text" name="txt_nombres" required="true">
                </li>
                <li>
                    <label>Apellidos: </label>           
                    <input type="text" name="txt_apellidos" required="true">
                </li>
                <li>
                    <label>Correo:</label>
                    <input type="email" name="txt_correo" required="true">
                </li>
                <li>
                    <label>Telefono:</label>
                    <input type="number" name="txt_numero" required="true">
                </li>
            </ul>
            </br>
            <center>
                <button type="submit" name="btnRegistrar" value="Registrar">Registrar</button>
            </center>
        </form>
    </body>
</html>
