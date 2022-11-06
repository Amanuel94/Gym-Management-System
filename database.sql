-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: gym_managment_sys
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `branch`
--

DROP TABLE IF EXISTS `branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `branch` (
  `bid` int NOT NULL AUTO_INCREMENT,
  `blocation` varchar(30) NOT NULL,
  `bstart_date` date NOT NULL,
  `mgr_id` int DEFAULT NULL,
  PRIMARY KEY (`bid`),
  UNIQUE KEY `bid_UNIQUE` (`bid`),
  UNIQUE KEY `mgrd_UNIQUE` (`mgr_id`),
  CONSTRAINT `branch_fk` FOREIGN KEY (`mgr_id`) REFERENCES `employee` (`eid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch`
--

LOCK TABLES `branch` WRITE;
/*!40000 ALTER TABLE `branch` DISABLE KEYS */;
INSERT INTO `branch` VALUES (2,'Yeka Abado','2021-09-09',1);
/*!40000 ALTER TABLE `branch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `cfame` varchar(20) NOT NULL,
  `clname` varchar(20) NOT NULL,
  `cdob` date NOT NULL,
  `csex` char(1) NOT NULL,
  `cstart_date` date NOT NULL,
  `ctier` varchar(45) NOT NULL,
  `cphone` varchar(10) NOT NULL,
  `caddress` varchar(50) NOT NULL,
  `cbid` int NOT NULL,
  PRIMARY KEY (`cid`),
  UNIQUE KEY `cid_UNIQUE` (`cid`),
  UNIQUE KEY `cphone_UNIQUE` (`cphone`),
  KEY `bid_idx` (`cbid`),
  CONSTRAINT `cfk` FOREIGN KEY (`cbid`) REFERENCES `branch` (`bid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dob_constraint` CHECK ((`cdob` <= _utf8mb4'2005-01-01'))
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'Amanuel','Tewodros','2002-06-28','M','2022-09-06','Platinum Tier','0939115953','Yeka subcity, Addis Ababa',2),(3,'Franol','Fekadu','2002-12-12','M','2022-09-06','None','0939115944','Arada Subcity, Addis Ababa',2),(4,'Alexander','Kiros','2002-11-04','M','2022-09-06','None','0939115941','Yeka subcity, Addis Ababa',2),(5,'Beimnet','Worku','2001-10-10','M','2022-09-06','None','0939115144','Yeka Subcity, Addis Ababa',2),(6,'Debora','Berihanu','2002-11-10','F','2022-09-06','None','0912115144','Yeka Subcity, Addis Ababa',2),(7,'Ryan','Reyonalds','1980-12-23','M','2021-12-12','Golden Tier','094312313','California, USA',2),(8,'Rick','Grimes','1970-09-10','M','2022-09-01','Golden Tier','23905809','ATL, Georgia, USA',2),(13,'Spongebob','Squarepants','2002-06-07','M','2021-12-12','None','72589386','Bikini Bottoms',2),(15,'Jack','Sparrow','2002-06-07','M','2022-01-01','None','72582386','POTC',2),(31,'Michel','Scott','1980-09-11','M','2022-09-01','Golden Tier','1245232211','Scranton, Penn. USA',2);
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client_programme`
--

DROP TABLE IF EXISTS `client_programme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client_programme` (
  `cid` int NOT NULL,
  `pid` int NOT NULL,
  PRIMARY KEY (`cid`,`pid`),
  KEY `fk2_idx` (`pid`),
  CONSTRAINT `fk1` FOREIGN KEY (`cid`) REFERENCES `client` (`cid`),
  CONSTRAINT `fk2` FOREIGN KEY (`pid`) REFERENCES `programme` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client_programme`
--

LOCK TABLES `client_programme` WRITE;
/*!40000 ALTER TABLE `client_programme` DISABLE KEYS */;
INSERT INTO `client_programme` VALUES (1,1),(7,1),(1,2),(3,2),(4,2),(31,2);
/*!40000 ALTER TABLE `client_programme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `dept_name` varchar(25) NOT NULL,
  `dept_branch` int NOT NULL,
  `dept_head` int DEFAULT NULL,
  PRIMARY KEY (`dept_name`,`dept_branch`),
  KEY `depfk_idx` (`dept_branch`),
  KEY `depfk2_idx` (`dept_head`),
  CONSTRAINT `depfk1` FOREIGN KEY (`dept_branch`) REFERENCES `branch` (`bid`),
  CONSTRAINT `depfk2` FOREIGN KEY (`dept_head`) REFERENCES `employee` (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES ('Executives and Heads',2,1),('Others',2,2),('Human Resources',2,3),('Health and Paramedics',2,4),('Instructors',2,16);
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `eid` int NOT NULL AUTO_INCREMENT,
  `efname` varchar(20) NOT NULL,
  `elname` varchar(20) NOT NULL,
  `esex` char(1) NOT NULL,
  `edob` date NOT NULL,
  `estart_date` date NOT NULL,
  `ephone` char(10) NOT NULL,
  `eaddress` varchar(50) NOT NULL,
  `edep` varchar(25) NOT NULL,
  `ebranch` int NOT NULL,
  PRIMARY KEY (`eid`),
  UNIQUE KEY `id_UNIQUE` (`eid`),
  KEY `empfk1_idx` (`edep`,`ebranch`),
  CONSTRAINT `empfk1` FOREIGN KEY (`edep`, `ebranch`) REFERENCES `department` (`dept_name`, `dept_branch`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'employeeF1','employeeL1','F','1999-12-10','2021-09-09','0938231210','Yeka Abado, Addis Ababa','Executives and Heads',2),(2,'employeeF2','employeeL2','M','1999-12-11','2021-09-09','0938231211','Yeka Abado, Addis Ababa','Executives and Heads',2),(3,'employeeF3','employeeL3','F','1999-12-12','2021-09-09','0938231212','Yeka Abado, Addis Ababa','Executives and Heads',2),(4,'employeeF4','employeeL4','F','1999-12-13','2021-09-09','0938231213','Yeka Abado, Addis Ababa','Executives and Heads',2),(5,'employeeF5','employeeL5','F','1999-12-14','2021-09-09','0938231214','Yeka Abado, Addis Ababa','Instructors',2),(6,'employeeF6','employeeL6','M','1999-12-15','2021-09-09','0938231215','Yeka Abado, Addis Ababa','Instructors',2),(7,'employeeF7','employeeL7','F','1999-12-16','2021-09-09','0938231216','Yeka Abado, Addis Ababa','Instructors',2),(8,'employeeF8','employeeL8','M','1999-12-17','2021-09-09','0938231217','Yeka Abado, Addis Ababa','Instructors',2),(9,'employeeF9','employeeL9','M','1999-12-18','2021-09-09','0938231218','Yeka Abado, Addis Ababa','Instructors',2),(10,'employeeF10','employeeL10','F','1999-12-19','2021-09-09','0938231219','Yeka Abado, Addis Ababa','Health and Paramedics',2),(11,'employeeF11','employeeL11','M','1999-12-20','2021-09-09','0938231220','Yeka Abado, Addis Ababa','Health and Paramedics',2),(12,'employeeF12','employeeL12','F','1999-12-21','2021-09-09','0938231221','Yeka Abado, Addis Ababa','Health and Paramedics',2),(13,'employeeF13','employeeL13','F','1999-12-22','2021-09-09','0938231222','Yeka Abado, Addis Ababa','Human Resources',2),(14,'employeeF14','employeeL14','F','1999-12-23','2021-09-09','0938231223','Yeka Abado, Addis Ababa','Human Resources',2),(15,'employeeF15','employeeL15','F','1999-12-24','2021-09-09','0938231224','Yeka Abado, Addis Ababa','Others',2),(16,'employeeF16','employeeL16','F','1999-12-10','2021-09-09','0938231277','Yeka Abado, Addis Ababa','Executives and Heads',2);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `programme`
--

DROP TABLE IF EXISTS `programme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `programme` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `prg_name` varchar(45) NOT NULL,
  `pstart_date` date NOT NULL,
  `prg_end_date` date DEFAULT NULL,
  `prg_inst` int NOT NULL,
  PRIMARY KEY (`pid`),
  UNIQUE KEY `pid_UNIQUE` (`pid`),
  KEY `prg_fk_idx` (`prg_inst`),
  CONSTRAINT `prg_fk` FOREIGN KEY (`prg_inst`) REFERENCES `employee` (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `programme`
--

LOCK TABLES `programme` WRITE;
/*!40000 ALTER TABLE `programme` DISABLE KEYS */;
INSERT INTO `programme` VALUES (1,'Weekly Cardio Excersice','2022-09-01',NULL,8),(2,'Daily Aerobics','2022-09-21','2022-12-12',9);
/*!40000 ALTER TABLE `programme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `property`
--

DROP TABLE IF EXISTS `property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `property` (
  `prop_id` int NOT NULL AUTO_INCREMENT,
  `prop_type` varchar(15) NOT NULL,
  `prop_model` varchar(20) NOT NULL,
  `prop_purchase_date` date NOT NULL,
  `number` int NOT NULL,
  `prop_branch` int NOT NULL,
  PRIMARY KEY (`prop_id`),
  UNIQUE KEY `prop_id_UNIQUE` (`prop_id`),
  KEY `prop_fk_idx` (`prop_branch`),
  CONSTRAINT `prop_fk` FOREIGN KEY (`prop_branch`) REFERENCES `branch` (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `property`
--

LOCK TABLES `property` WRITE;
/*!40000 ALTER TABLE `property` DISABLE KEYS */;
INSERT INTO `property` VALUES (1,' Property1','XEty213','2021-09-09',5,2),(2,' Property2','XEty214','2021-09-09',5,2),(3,' Property3','XEty215','2021-09-09',5,2),(4,' Property4','XEty216','2021-09-09',5,2),(5,' Property5','XEty217','2021-09-09',5,2),(6,' Property6','XEty218','2021-09-09',5,2),(7,' Property7','XEty219','2021-09-09',5,2),(8,' Property8','XEty220','2021-09-09',5,2),(9,' Property9','XEty221','2021-09-09',5,2),(10,' Property10','XEty222','2021-09-09',5,2),(11,' Property11','XEty223','2021-09-09',5,2),(12,' Property12','XEty224','2021-09-09',5,2),(13,' Property13','XEty225','2021-09-09',5,2),(14,' Property14','XEty226','2021-09-09',5,2),(15,' Property15','XEty227','2021-09-09',5,2);
/*!40000 ALTER TABLE `property` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-23  9:42:50
