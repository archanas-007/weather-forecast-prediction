-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 14, 2017 at 02:45 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `heartdisease`
--
CREATE DATABASE `heartdisease` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `heartdisease`;

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE IF NOT EXISTS `doctor` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `uname` char(50) DEFAULT NULL,
  `passw` char(50) DEFAULT NULL,
  `addr` char(50) DEFAULT NULL,
  `email` char(50) DEFAULT NULL,
  `mobile` char(50) DEFAULT NULL,
  `spl` char(50) DEFAULT NULL,
  `exp1` char(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`id`, `uname`, `passw`, `addr`, `email`, `mobile`, `spl`, `exp1`) VALUES
(1, 'Dkg', '123', 'Delhi', 'dkg@gmail.com', '9911123123', 'Lungs', '5');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `uname` char(50) DEFAULT NULL,
  `passw` char(50) DEFAULT NULL,
  `addr` char(50) DEFAULT NULL,
  `email` char(50) DEFAULT NULL,
  `mobile` char(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `uname`, `passw`, `addr`, `email`, `mobile`) VALUES
(2, 'niro', '123', 'delhi', 'niro@gmail.com', '9911123123'),
(3, 'mohan', '123', 'delhi', 'abc@gmail.com', '9911123123');
