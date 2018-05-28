/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Gonzalo
 * Created: 28-may-2018
 */

CREATE DATABASE Prueba_2;
 
USE Prueba_2;

/*
drop database Prueba_2;
*/

CREATE TABLE tipoUsuario(
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(30)
); -- SELECT * FROM tipoUsuario;

INSERT INTO tipoUsuario VALUES(NULL,'admin');
INSERT INTO tipoUsuario VALUES(NULL,'vendedor');
CREATE TABLE tipoVivienda(
    id INT PRIMARY KEY AUTO_INCREMENT,
    tipo NVARCHAR(30)
); -- SELECT * FROM tipoVivienda;+

INSERT INTO tipoVivienda VALUES(NULL,'Departamento');
INSERT INTO tipoVivienda VALUES(NULL,'Casa');

CREATE TABLE usuario(
    id INT AUTO_INCREMENT PRIMARY KEY,
    run NVARCHAR(30),
    nombre NVARCHAR(30),
    fk_tipoUsu INT,
    FOREIGN KEY(fk_tipoUsu) REFERENCES tipoUsuario(id),
    fechaReg DATETIME DEFAULT NOW()
); -- SELECT * FROM usuario;
 
/*SELECT COUNT(*) FROM usuario WHERE run = '11-2';*/

INSERT INTO usuario VALUES(NULL,'11-1','Administrador',1,DEFAULT);
INSERT INTO usuario VALUES(NULL,'22-2','Vendedor',2,DEFAULT);
 
CREATE TABLE vivienda(
    num_rol NVARCHAR(30) PRIMARY KEY,
    direccion NVARCHAR(50),
    cantPiezas INT,
    cantBaNos INT,
    fk_tipoVivienda INT REFERENCES tipoVivienda(id),
    precio INT,
    nueva BOOLEAN,
    fechaReg DATETIME DEFAULT NOW()
); -- SELECT * FROM vivienda;

CREATE TABLE cliente(
    run NVARCHAR(30) PRIMARY KEY,
    nombre NVARCHAR(50),
    sueldo INT,
    fechaReg DATETIME DEFAULT NOW()
); -- SELECT * FROM cliente;
 
CREATE TABLE venta(
    id INT AUTO_INCREMENT PRIMARY KEY,
    fk_vivienda NVARCHAR(30),
    fk_cliente NVARCHAR(30),
    fk_usuario INT,
    FOREIGN KEY(fk_vivienda)REFERENCES vivienda(num_rol) ON DELETE CASCADE,
    FOREIGN KEY(fk_cliente) REFERENCES cliente(run) ON DELETE CASCADE,
    FOREIGN KEY(fk_usuario) REFERENCES usuario(id) ON DELETE CASCADE,
    fecha DATETIME DEFAULT NOW()
); -- SELECT * FROM venta;
 
CREATE TABLE restauracion(
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATETIME DEFAULT NOW()
);
INSERT INTO restauracion VALUES(NULL,DEFAULT);

CREATE TABLE actividadVendedor(
    ID INT PRIMARY KEY AUTO_INCREMENT,
    fk_usuario INT REFERENCES usuario(id),
    actividad VARCHAR(100),
    fecha DATETIME DEFAULT NOW()
);

DELIMITER //
CREATE PROCEDURE pr_restaurar (IN fechaRest DATETIME)
BEGIN
	DELETE FROM venta WHERE fecha BETWEEN fechaRest AND NOW();
    DELETE FROM vivienda WHERE fechaReg BETWEEN fechaRest AND NOW();
    DELETE FROM usuario WHERE fechaReg BETWEEN fechaRest AND NOW();
	DELETE FROM cliente WHERE fechaReg BETWEEN fechaRest AND NOW();
	DELETE FROM restauracion WHERE fecha BETWEEN fechaRest AND NOW();
	-- DELETE FROM  WHERE fecha BETWEEN fechaRestcv AND NOW();
	
END