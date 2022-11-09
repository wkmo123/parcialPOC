<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link rel="stylesheet" href="estilos.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"/>
    </head>
    <body>
        <div class="conteiner-card">
            <div class="card">
                <div class="logo">
                    <img src="recursos\logo.png" alt="logo">
                </div>
            </div>
            <div class="header-card">
                <h1>Registro</h1>
                <div>Por favor ingresa tus datos</div>
            </div>
            <form class="card-form" action="control" method="POST">
                <div class="form-item">
                    <span class="form-item-icon material-symbols-rounded">person</span>
                    <input type="text" name="txt_nombres" placeholder="Ingresa tu nombre" required autofocus>
                </div>
                <div class="form-item">
                    <span class="form-item-icon material-symbols-rounded">badge</span>
                    <input type="text" name="txt_apellidos" placeholder="Ingresa tu apellido" required autofocus>
                </div>
                <div class="form-item">
                    <span class="form-item-icon material-symbols-rounded">mail</span>
                    <input type="email" name="txt_correo" placeholder="Ingresa tu correo" required autofocus>
                </div>
                <div class="form-item">
                    <span class="form-item-icon material-symbols-rounded">keyboard</span>
                    <input type="number" name="txt_telefono" placeholder="Ingresa tu número telefónico" required autofocus>
                </div>
                <div class="form-item">
                    <span class="form-item-icon material-symbols-rounded">lock</span>
                    <input type="password" name="txt_contrasena" placeholder="Ingresa tu contraseña" required autofocus>
                </div>
                <button type="submit" name="btnRegistrar" value="Registrar">Registrar</button>
            </form>
        </div>
    </body>
</html>
