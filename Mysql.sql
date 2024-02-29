-- Crear la base de datos para la librería
CREATE DATABASE IF NOT EXISTS libreria_db;
USE libreria_db;

-- Tabla para almacenar la información de los libros
CREATE TABLE IF NOT EXISTS libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    categoria VARCHAR(50) NOT NULL
);

-- Tabla para almacenar la información de los clientes
CREATE TABLE IF NOT EXISTS clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    mensaje TEXT
);

-- Insertar datos de ejemplo en la tabla de libros (opcional)
INSERT INTO libros (titulo, autor, precio, categoria) VALUES
    ('El nombre del viento', 'Patrick Rothfuss', 25.99, 'Fantasía'),
    ('Cien años de soledad', 'Gabriel García Márquez', 19.99, 'Realismo mágico'),
    ('1984', 'George Orwell', 15.50, 'Ciencia ficción');

-- Verificar la creación de las tablas
SHOW TABLES;