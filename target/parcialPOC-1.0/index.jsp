<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesión</title>
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
                <h1>Login</h1>
                <div>Por favor ingresa tus datos</div>
            </div>
            <form class="card-form" action="control" method="POST">
                <div class="form-item">
                    <span class="form-item-icon material-symbols-rounded">mail</span>
                    <input type="email" name="txt_correo" placeholder="Ingresa tu correo" required autofocus>
                </div>
                <div class="form-item">
                    <span class="form-item-icon material-symbols-rounded">lock</span>
                    <input type="password" name="txt_contrasena" placeholder="Ingresa tu contraseña" required autofocus>
                </div>
                <button type="submit" name="btnRegistrar" value="Registrar">Ingresar</button>
                <div class="form-item">
                    <a href="registro.jsp" target="_blank">¿No estás registrado? Regístrate</a>
                </div>
                <div class="form-item">
                    <a href="registro.jsp" target="_blank">¿Olvidaste tu contraseña?</a>
                </div>
            </form>
        </div>
    </body>
</html>
