-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 07-02-2017 a las 02:22:28
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `servicio`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `codigoAlumno` varchar(20) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  `edad` int(10) DEFAULT NULL,
  `domicilio` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`codigoAlumno`, `nombre`, `apellido`, `edad`, `domicilio`) VALUES
('210030412', 'aguayo', 'aguayo', 23, 'avila camacho 192'),
('210030413', 'jose', 'gonzales', 22, 'tonala 32'),
('210040412', 'godinez', 'godinez', 22, 'cerro del 4 ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingles`
--

CREATE TABLE `ingles` (
  `codigoAlumno` varchar(20) DEFAULT NULL,
  `aprovatorio` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ingles`
--

INSERT INTO `ingles` (`codigoAlumno`, `aprovatorio`) VALUES
('210030412', 'aprovatorio'),
('210030413', 'aprovatorio'),
('210040412', 'no aprovatorio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `codigoAlumno` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `maestro`
--

CREATE TABLE `maestro` (
  `codigoMaestro` varchar(20) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `CRN` varchar(10) NOT NULL,
  `nombreAsignatura` varchar(20) DEFAULT NULL,
  `tipoOrientacion` varchar(20) DEFAULT NULL,
  `salon` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mensajes`
--

CREATE TABLE `mensajes` (
  `folio` int(10) NOT NULL,
  `mensage` varchar(244) NOT NULL,
  `codigoAlumno` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mensajes`
--

INSERT INTO `mensajes` (`folio`, `mensage`, `codigoAlumno`) VALUES
(1, 'hola maestra solo queria ver si me podria dar de baja la materia por que asi y asa', '210030412'),
(2, 'hola que tal queria ver si me modificaban una materia la tengo mal registrada', '210030412');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `orientacion`
--

CREATE TABLE `orientacion` (
  `codigoAlumno` varchar(20) DEFAULT NULL,
  `nombreOrientacion` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `orientacion`
--

INSERT INTO `orientacion` (`codigoAlumno`, `nombreOrientacion`) VALUES
('210030412', 'base de datos'),
('210030413', 'programacion'),
('210040412', 'programacion');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `serviciosocial`
--

CREATE TABLE `serviciosocial` (
  `codigoAlumno` varchar(20) DEFAULT NULL,
  `institucion` varchar(20) DEFAULT NULL,
  `concluido` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `serviciosocial`
--

INSERT INTO `serviciosocial` (`codigoAlumno`, `institucion`, `concluido`) VALUES
('210030412', 'concluido', 'udg'),
('210030413', 'concluido', 'udh'),
('210040412', 'no concluido', 'null');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodetitulacion`
--

CREATE TABLE `tipodetitulacion` (
  `codigoAlumno` varchar(20) DEFAULT NULL,
  `nombreTitulacion` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipodetitulacion`
--

INSERT INTO `tipodetitulacion` (`codigoAlumno`, `nombreTitulacion`) VALUES
('210030412', 'se desconoce'),
('210030413', 'se desconoce'),
('210040412', 'se desconoce');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turno`
--

CREATE TABLE `turno` (
  `codigoAlumno` varchar(20) DEFAULT NULL,
  `turnoAlumno` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `turno`
--

INSERT INTO `turno` (`codigoAlumno`, `turnoAlumno`) VALUES
('210030412', 'matutino'),
('210030413', 'verpertino'),
('210040412', 'verpertino');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`codigoAlumno`);

--
-- Indices de la tabla `maestro`
--
ALTER TABLE `maestro`
  ADD PRIMARY KEY (`codigoMaestro`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`CRN`);

--
-- Indices de la tabla `mensajes`
--
ALTER TABLE `mensajes`
  ADD PRIMARY KEY (`folio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `mensajes`
--
ALTER TABLE `mensajes`
  MODIFY `folio` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
