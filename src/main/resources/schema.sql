DROP TABLE IF EXISTS TT_USUARIO;
CREATE TABLE TT_USUARIO(
idusuario INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(25),
apellido VARCHAR(25),
correo VARCHAR(25),
fec_nacimiento DATE
);