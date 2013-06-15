-- MySQL dump 10.13  Distrib 5.5.28, for Win32 (x86)
--
-- Host: localhost    Database: restaurant
-- ------------------------------------------------------
-- Server version	5.5.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dinner_area`
--

DROP TABLE IF EXISTS `dinner_area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dinner_area` (
  `id` char(36) NOT NULL,
  `code` varchar(20) NOT NULL COMMENT '餐厅区域编号',
  `display_area` varchar(20) NOT NULL COMMENT '餐厅区域名称',
  PRIMARY KEY (`id`),
  UNIQUE KEY `code` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dinner_area`
--

LOCK TABLES `dinner_area` WRITE;
/*!40000 ALTER TABLE `dinner_area` DISABLE KEYS */;
/*!40000 ALTER TABLE `dinner_area` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dinner_room`
--

DROP TABLE IF EXISTS `dinner_room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dinner_room` (
  `id` char(36) NOT NULL,
  `code` varchar(20) NOT NULL COMMENT '包房编号',
  `display_name` varchar(20) NOT NULL COMMENT '包房名称',
  PRIMARY KEY (`id`),
  UNIQUE KEY `code` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dinner_room`
--

LOCK TABLES `dinner_room` WRITE;
/*!40000 ALTER TABLE `dinner_room` DISABLE KEYS */;
/*!40000 ALTER TABLE `dinner_room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dinner_table`
--

DROP TABLE IF EXISTS `dinner_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dinner_table` (
  `id` char(36) NOT NULL,
  `code` varchar(20) NOT NULL COMMENT '桌位编号',
  `display_name` varchar(20) NOT NULL COMMENT '桌位名称',
  PRIMARY KEY (`id`),
  UNIQUE KEY `code` (`code`),
  UNIQUE KEY `code_2` (`code`),
  UNIQUE KEY `code_3` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dinner_table`
--

LOCK TABLES `dinner_table` WRITE;
/*!40000 ALTER TABLE `dinner_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `dinner_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dish`
--

DROP TABLE IF EXISTS `dish`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dish` (
  `id` char(36) NOT NULL COMMENT '菜品id',
  `dish_group_id` char(36) NOT NULL COMMENT '菜品分类id',
  `dish_style_id` char(36) DEFAULT NULL COMMENT '所属菜系id',
  `code` varchar(20) NOT NULL COMMENT '菜品编号',
  `display_name` varchar(30) NOT NULL COMMENT '菜品名称',
  `taste` varchar(50) DEFAULT NULL COMMENT '口味描述',
  `description` varchar(500) DEFAULT NULL COMMENT '菜品简介',
  `suitable_for_people` varchar(50) DEFAULT NULL COMMENT '适宜人群',
  `nutrient_level` smallint(1) DEFAULT NULL COMMENT '营养指数',
  `recommended_level` smallint(1) DEFAULT NULL COMMENT '推荐指数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `code` (`code`),
  UNIQUE KEY `code_2` (`code`),
  UNIQUE KEY `name` (`display_name`),
  UNIQUE KEY `display_name` (`display_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dish`
--

LOCK TABLES `dish` WRITE;
/*!40000 ALTER TABLE `dish` DISABLE KEYS */;
INSERT INTO `dish` VALUES ('13415','32412341','14312341','fdas45','afdas54342','3424523','43252','324523dsfg',127,NULL);
/*!40000 ALTER TABLE `dish` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'me',18),(2,'you',19);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-06-15 19:52:40
