/*
SQLyog - Free MySQL GUI v5.14
Host - 5.0.77-community-nt : Database - text_summ_login
*********************************************************************
Server version : 5.0.77-community-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `text_summ_login`;

USE `text_summ_login`;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(4) NOT NULL auto_increment,
  `uname` char(50) default NULL,
  `passw` char(50) default NULL,
  `addr` char(50) default NULL,
  `email` char(50) default NULL,
  `mobile` char(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `users` */

SET SQL_MODE=@OLD_SQL_MODE;