-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-06-2022 a las 06:37:33
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nave_espacial`
--

CREATE TABLE `nave_espacial` (
  `codigonave` varchar(20) NOT NULL,
  `nombrenave` varchar(30) NOT NULL,
  `tiponave` varchar(30) NOT NULL,
  `empuje` double NOT NULL,
  `velocidad` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `nave_espacial`
--

INSERT INTO `nave_espacial` (`codigonave`, `nombrenave`, `tiponave`, `empuje`, `velocidad`) VALUES
('1', 'Apolo', 'Lanzadera', 1000, 12000),
('10', 'Apolo IV', 'Lanzadera', 2500, 15000),
('2', 'Apolo II', 'Lanzadera', 0.6, 2300),
('3', 'Apolo III', 'Lanzadera', 2000, 13000),
('4', 'Solaris', 'Tripulada', 1, 8000),
('5', 'Solaris II', 'Tripulada', 1.2, 8500),
('6', 'Solaris III', 'Tripulada', 2, 9700),
('7', 'Unix', 'No Tripulada', 0.7, 7400),
('8', 'Unix 2.0', 'No Tripulada', 0.9, 7800),
('9', 'Unix Z', 'No Tripulada', 1.2, 8900);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `nave_espacial`
--
ALTER TABLE `nave_espacial`
  ADD PRIMARY KEY (`codigonave`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
