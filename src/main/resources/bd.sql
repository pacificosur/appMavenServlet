DROP DATABASE IF EXIST unsis;
CREATE DATABASE unsis;

USE unsis;

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `usuario` VALUES (1,'admin','root'),(2,'root','root'),(3,'admin','admin'),(8,'guess','guess');
