-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.1.12-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para servicio
CREATE DATABASE IF NOT EXISTS `servicio` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `servicio`;


-- Volcando estructura para tabla servicio.alumno
CREATE TABLE IF NOT EXISTS `alumno` (
  `codigoAlumno` varchar(20) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  `edad` int(10) DEFAULT NULL,
  `domicilio` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`codigoAlumno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla servicio.ingles
CREATE TABLE IF NOT EXISTS `ingles` (
  `codigoAlumno` varchar(20) DEFAULT NULL,
  `aprovatorio` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla servicio.login
CREATE TABLE IF NOT EXISTS `login` (
  `codigoAlumno` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla servicio.maestro
CREATE TABLE IF NOT EXISTS `maestro` (
  `codigoMaestro` varchar(20) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`codigoMaestro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla servicio.materia
CREATE TABLE IF NOT EXISTS `materia` (
  `CRN` varchar(10) NOT NULL,
  `nombreAsignatura` varchar(20) DEFAULT NULL,
  `tipoOrientacion` varchar(20) DEFAULT NULL,
  `salon` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`CRN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla servicio.orientacion
CREATE TABLE IF NOT EXISTS `orientacion` (
  `codigoAlumno` varchar(20) DEFAULT NULL,
  `nombreOrientacion` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla servicio.serviciosocial
CREATE TABLE IF NOT EXISTS `serviciosocial` (
  `codigoAlumno` varchar(20) DEFAULT NULL,
  `institucion` varchar(20) DEFAULT NULL,
  `concluido` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla servicio.tipodetitulacion
CREATE TABLE IF NOT EXISTS `tipodetitulacion` (
  `codigoAlumno` varchar(20) DEFAULT NULL,
  `nombreTitulacion` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.


-- Volcando estructura para tabla servicio.turno
CREATE TABLE IF NOT EXISTS `turno` (
  `codigoAlumno` varchar(20) DEFAULT NULL,
  `turnoAlumno` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
