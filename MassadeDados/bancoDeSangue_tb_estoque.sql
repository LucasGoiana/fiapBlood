-- MySQL dump 10.13  Distrib 8.0.25, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: bancoDeSangue
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Dumping data for table `tb_estoque`
--

LOCK TABLES `tb_estoque` WRITE;
/*!40000 ALTER TABLE `tb_estoque` DISABLE KEYS */;
INSERT INTO `tb_estoque` VALUES (1,41,100,1,1),(2,88,100,1,2),(3,16,100,1,3),(4,20,100,1,4),(5,51,100,1,5),(6,93,100,1,6),(7,12,100,1,7),(8,85,100,1,8),(16,41,100,2,1),(17,88,100,2,2),(18,16,100,2,3),(19,20,100,2,4),(20,51,100,2,5),(21,93,100,2,6),(22,12,100,2,7),(23,85,100,2,8),(31,41,100,3,1),(32,88,100,3,2),(33,16,100,3,3),(34,20,100,3,4),(35,51,100,3,5),(36,93,100,3,6),(37,12,100,3,7),(38,85,100,3,8),(46,41,100,4,1),(47,88,100,4,2),(48,16,100,4,3),(49,20,100,4,4),(50,51,100,4,5),(51,93,100,4,6),(52,12,100,4,7),(53,85,100,4,8),(61,41,100,5,1),(62,88,100,5,2),(63,16,100,5,3),(64,20,100,5,4),(65,51,100,5,5),(66,93,100,5,6),(67,12,100,5,7),(68,85,100,5,8),(76,41,100,6,1),(77,88,100,6,2),(78,16,100,6,3),(79,20,100,6,4),(80,51,100,6,5),(81,93,100,6,6),(82,12,100,6,7),(83,85,100,6,8),(91,41,100,7,1),(92,88,100,7,2),(93,16,100,7,3),(94,20,100,7,4),(95,51,100,7,5),(96,93,100,7,6),(97,12,100,7,7),(98,85,100,7,8),(106,41,100,8,1),(107,88,100,8,2),(108,16,100,8,3),(109,20,100,8,4),(110,51,100,8,5),(111,93,100,8,6),(112,12,100,8,7),(113,85,100,8,8),(121,41,100,9,1),(122,88,100,9,2),(123,16,100,9,3),(124,20,100,9,4),(125,51,100,9,5),(126,93,100,9,6),(127,12,100,9,7),(128,85,100,9,8),(136,41,100,10,1),(137,88,100,10,2),(138,16,100,10,3),(139,20,100,10,4),(140,51,100,10,5),(141,93,100,10,6),(142,12,100,10,7),(143,85,100,10,8),(151,41,100,11,1),(152,88,100,11,2),(153,16,100,11,3),(154,20,100,11,4),(155,51,100,11,5),(156,93,100,11,6),(157,12,100,11,7),(158,85,100,11,8),(166,41,100,12,1),(167,88,100,12,2),(168,16,100,12,3),(169,20,100,12,4),(170,51,100,12,5),(171,93,100,12,6),(172,12,100,12,7),(173,85,100,12,8),(181,41,100,13,1),(182,88,100,13,2),(183,16,100,13,3),(184,20,100,13,4),(185,51,100,13,5),(186,93,100,13,6),(187,12,100,13,7),(188,85,100,13,8),(196,41,100,14,1),(197,88,100,14,2),(198,16,100,14,3),(199,20,100,14,4),(200,51,100,14,5),(201,93,100,14,6),(202,12,100,14,7),(203,85,100,14,8),(211,41,100,15,1),(212,88,100,15,2),(213,16,100,15,3),(214,20,100,15,4),(215,51,100,15,5),(216,93,100,15,6),(217,12,100,15,7),(218,85,100,15,8),(226,41,100,16,1),(227,88,100,16,2),(228,16,100,16,3),(229,20,100,16,4),(230,51,100,16,5),(231,93,100,16,6),(232,12,100,16,7),(233,85,100,16,8),(241,41,100,17,1),(242,88,100,17,2),(243,16,100,17,3),(244,20,100,17,4),(245,51,100,17,5),(246,93,100,17,6),(247,12,100,17,7),(248,85,100,17,8),(256,41,100,18,1),(257,88,100,18,2),(258,16,100,18,3),(259,20,100,18,4),(260,51,100,18,5),(261,93,100,18,6),(262,12,100,18,7),(263,85,100,18,8),(271,41,100,19,1),(272,88,100,19,2),(273,16,100,19,3),(274,20,100,19,4),(275,51,100,19,5),(276,93,100,19,6),(277,12,100,19,7),(278,85,100,19,8),(286,41,100,20,1),(287,88,100,20,2),(288,16,100,20,3),(289,20,100,20,4),(290,51,100,20,5),(291,93,100,20,6),(292,12,100,20,7),(293,85,100,20,8),(301,41,100,21,1),(302,88,100,21,2),(303,16,100,21,3),(304,20,100,21,4),(305,51,100,21,5),(306,93,100,21,6),(307,12,100,21,7),(308,85,100,21,8),(316,41,100,22,1),(317,88,100,22,2),(318,16,100,22,3),(319,20,100,22,4),(320,51,100,22,5),(321,93,100,22,6),(322,12,100,22,7),(323,85,100,22,8),(331,41,100,23,1),(332,88,100,23,2),(333,16,100,23,3),(334,20,100,23,4),(335,51,100,23,5),(336,93,100,23,6),(337,12,100,23,7),(338,85,100,23,8),(346,41,100,24,1),(347,88,100,24,2),(348,16,100,24,3),(349,20,100,24,4),(350,51,100,24,5),(351,93,100,24,6),(352,12,100,24,7),(353,85,100,24,8),(361,41,100,25,1),(362,88,100,25,2),(363,16,100,25,3),(364,20,100,25,4),(365,51,100,25,5),(366,93,100,25,6),(367,12,100,25,7),(368,85,100,25,8),(376,41,100,26,1),(377,88,100,26,2),(378,16,100,26,3),(379,20,100,26,4),(380,51,100,26,5),(381,93,100,26,6),(382,12,100,26,7),(383,85,100,26,8),(391,41,100,27,1),(392,88,100,27,2),(393,16,100,27,3),(394,20,100,27,4),(395,51,100,27,5),(396,93,100,27,6),(397,12,100,27,7),(398,85,100,27,8),(406,41,100,28,1),(407,88,100,28,2),(408,16,100,28,3),(409,20,100,28,4),(410,51,100,28,5),(411,93,100,28,6),(412,12,100,28,7),(413,85,100,28,8),(421,41,100,29,1),(422,88,100,29,2),(423,16,100,29,3),(424,20,100,29,4),(425,51,100,29,5),(426,93,100,29,6),(427,12,100,29,7),(428,85,100,29,8),(436,41,100,30,1),(437,88,100,30,2),(438,16,100,30,3),(439,20,100,30,4),(440,51,100,30,5),(441,93,100,30,6),(442,12,100,30,7),(443,85,100,30,8),(451,41,100,31,1),(452,88,100,31,2),(453,16,100,31,3),(454,20,100,31,4),(455,51,100,31,5),(456,93,100,31,6),(457,12,100,31,7),(458,85,100,31,8),(466,41,100,32,1),(467,88,100,32,2),(468,16,100,32,3),(469,20,100,32,4),(470,51,100,32,5),(471,93,100,32,6),(472,12,100,32,7),(473,85,100,32,8),(481,41,100,33,1),(482,88,100,33,2),(483,16,100,33,3),(484,20,100,33,4),(485,51,100,33,5),(486,93,100,33,6),(487,12,100,33,7),(488,85,100,33,8),(496,41,100,34,1),(497,88,100,34,2),(498,16,100,34,3),(499,20,100,34,4),(500,51,100,34,5),(501,93,100,34,6),(502,12,100,34,7),(503,85,100,34,8),(511,41,100,35,1),(512,88,100,35,2),(513,16,100,35,3),(514,20,100,35,4),(515,51,100,35,5),(516,93,100,35,6),(517,12,100,35,7),(518,85,100,35,8),(526,41,100,36,1),(527,88,100,36,2),(528,16,100,36,3),(529,20,100,36,4),(530,51,100,36,5),(531,93,100,36,6),(532,12,100,36,7),(533,85,100,36,8),(541,41,100,37,1),(542,88,100,37,2),(543,16,100,37,3),(544,20,100,37,4),(545,51,100,37,5),(546,93,100,37,6),(547,12,100,37,7),(548,85,100,37,8),(556,41,100,38,1),(557,88,100,38,2),(558,16,100,38,3),(559,20,100,38,4),(560,51,100,38,5),(561,93,100,38,6),(562,12,100,38,7),(563,85,100,38,8),(571,41,100,39,1),(572,88,100,39,2),(573,16,100,39,3),(574,20,100,39,4),(575,51,100,39,5),(576,93,100,39,6),(577,12,100,39,7),(578,85,100,39,8),(586,41,100,40,1),(587,88,100,40,2),(588,16,100,40,3),(589,20,100,40,4),(590,51,100,40,5),(591,93,100,40,6),(592,12,100,40,7),(593,85,100,40,8),(601,41,100,41,1),(602,88,100,41,2),(603,16,100,41,3),(604,20,100,41,4),(605,51,100,41,5),(606,93,100,41,6),(607,12,100,41,7),(608,85,100,41,8),(616,41,100,42,1),(617,88,100,42,2),(618,16,100,42,3),(619,20,100,42,4),(620,51,100,42,5),(621,93,100,42,6),(622,12,100,42,7),(623,85,100,42,8),(631,41,100,43,1),(632,88,100,43,2),(633,16,100,43,3),(634,20,100,43,4),(635,51,100,43,5),(636,93,100,43,6),(637,12,100,43,7),(638,85,100,43,8),(646,41,100,44,1),(647,88,100,44,2),(648,16,100,44,3),(649,20,100,44,4),(650,51,100,44,5),(651,93,100,44,6),(652,12,100,44,7),(653,85,100,44,8),(661,41,100,45,1),(662,88,100,45,2),(663,16,100,45,3),(664,20,100,45,4),(665,51,100,45,5),(666,93,100,45,6),(667,12,100,45,7),(668,85,100,45,8),(676,41,100,46,1),(677,88,100,46,2),(678,16,100,46,3),(679,20,100,46,4),(680,51,100,46,5),(681,93,100,46,6),(682,12,100,46,7),(683,85,100,46,8),(691,41,100,47,1),(692,88,100,47,2),(693,16,100,47,3),(694,20,100,47,4),(695,51,100,47,5),(696,93,100,47,6),(697,12,100,47,7),(698,85,100,47,8),(706,41,100,48,1),(707,88,100,48,2),(708,16,100,48,3),(709,20,100,48,4),(710,51,100,48,5),(711,93,100,48,6),(712,12,100,48,7),(713,85,100,48,8),(721,41,100,49,1),(722,88,100,49,2),(723,16,100,49,3),(724,20,100,49,4),(725,51,100,49,5),(726,93,100,49,6),(727,12,100,49,7),(728,85,100,49,8),(736,41,100,50,1),(737,88,100,50,2),(738,16,100,50,3),(739,20,100,50,4),(740,51,100,50,5),(741,93,100,50,6),(742,12,100,50,7),(743,85,100,50,8),(751,41,100,51,1),(752,88,100,51,2),(753,16,100,51,3),(754,20,100,51,4),(755,51,100,51,5),(756,93,100,51,6),(757,12,100,51,7),(758,85,100,51,8),(766,41,100,52,1),(767,88,100,52,2),(768,16,100,52,3),(769,20,100,52,4),(770,51,100,52,5),(771,93,100,52,6),(772,12,100,52,7),(773,85,100,52,8),(781,41,100,53,1),(782,88,100,53,2),(783,16,100,53,3),(784,20,100,53,4),(785,51,100,53,5),(786,93,100,53,6),(787,12,100,53,7),(788,85,100,53,8),(796,41,100,54,1),(797,88,100,54,2),(798,16,100,54,3),(799,20,100,54,4),(800,51,100,54,5),(801,93,100,54,6),(802,12,100,54,7),(803,85,100,54,8),(811,41,100,55,1),(812,88,100,55,2),(813,16,100,55,3),(814,20,100,55,4),(815,51,100,55,5),(816,93,100,55,6),(817,12,100,55,7),(818,85,100,55,8),(826,41,100,56,1),(827,88,100,56,2),(828,16,100,56,3),(829,20,100,56,4),(830,51,100,56,5),(831,93,100,56,6),(832,12,100,56,7),(833,85,100,56,8),(841,41,100,57,1),(842,88,100,57,2),(843,16,100,57,3),(844,20,100,57,4),(845,51,100,57,5),(846,93,100,57,6),(847,12,100,57,7),(848,85,100,57,8),(856,41,100,58,1),(857,88,100,58,2),(858,16,100,58,3),(859,20,100,58,4),(860,51,100,58,5),(861,93,100,58,6),(862,12,100,58,7),(863,85,100,58,8),(871,41,100,59,1),(872,88,100,59,2),(873,16,100,59,3),(874,20,100,59,4),(875,51,100,59,5),(876,93,100,59,6),(877,12,100,59,7),(878,85,100,59,8),(886,41,100,60,1),(887,88,100,60,2),(888,16,100,60,3),(889,20,100,60,4),(890,51,100,60,5),(891,93,100,60,6),(892,12,100,60,7),(893,85,100,60,8),(901,41,100,61,1),(902,88,100,61,2),(903,16,100,61,3),(904,20,100,61,4),(905,51,100,61,5),(906,93,100,61,6),(907,12,100,61,7),(908,85,100,61,8),(916,41,100,62,1),(917,88,100,62,2),(918,16,100,62,3),(919,20,100,62,4),(920,51,100,62,5),(921,93,100,62,6),(922,12,100,62,7),(923,85,100,62,8),(931,41,100,63,1),(932,88,100,63,2),(933,16,100,63,3),(934,20,100,63,4),(935,51,100,63,5),(936,93,100,63,6),(937,12,100,63,7),(938,85,100,63,8),(946,41,100,64,1),(947,88,100,64,2),(948,16,100,64,3),(949,20,100,64,4),(950,51,100,64,5),(951,93,100,64,6),(952,12,100,64,7),(953,85,100,64,8),(961,41,100,65,1),(962,88,100,65,2),(963,16,100,65,3),(964,20,100,65,4),(965,51,100,65,5),(966,93,100,65,6),(967,12,100,65,7),(968,85,100,65,8),(976,41,100,66,1),(977,88,100,66,2),(978,16,100,66,3),(979,20,100,66,4),(980,51,100,66,5),(981,93,100,66,6),(982,12,100,66,7),(983,85,100,66,8),(991,41,100,67,1),(992,88,100,67,2),(993,16,100,67,3),(994,20,100,67,4),(995,51,100,67,5),(996,93,100,67,6),(997,12,100,67,7),(998,85,100,67,8),(1006,41,100,68,1),(1007,88,100,68,2),(1008,16,100,68,3),(1009,20,100,68,4),(1010,51,100,68,5),(1011,93,100,68,6),(1012,12,100,68,7),(1013,85,100,68,8),(1021,41,100,69,1),(1022,88,100,69,2),(1023,16,100,69,3),(1024,20,100,69,4),(1025,51,100,69,5),(1026,93,100,69,6),(1027,12,100,69,7),(1028,85,100,69,8),(1036,41,100,70,1),(1037,88,100,70,2),(1038,16,100,70,3),(1039,20,100,70,4),(1040,51,100,70,5),(1041,93,100,70,6),(1042,12,100,70,7),(1043,85,100,70,8),(1051,41,100,71,1),(1052,88,100,71,2),(1053,16,100,71,3),(1054,20,100,71,4),(1055,51,100,71,5),(1056,93,100,71,6),(1057,12,100,71,7),(1058,85,100,71,8),(1066,41,100,72,1),(1067,88,100,72,2),(1068,16,100,72,3),(1069,20,100,72,4),(1070,51,100,72,5),(1071,93,100,72,6),(1072,12,100,72,7),(1073,85,100,72,8),(1081,41,100,73,1),(1082,88,100,73,2),(1083,16,100,73,3),(1084,20,100,73,4),(1085,51,100,73,5),(1086,93,100,73,6),(1087,12,100,73,7),(1088,85,100,73,8),(1096,41,100,74,1),(1097,88,100,74,2),(1098,16,100,74,3),(1099,20,100,74,4),(1100,51,100,74,5),(1101,93,100,74,6),(1102,12,100,74,7),(1103,85,100,74,8),(1111,41,100,75,1),(1112,88,100,75,2),(1113,16,100,75,3),(1114,20,100,75,4),(1115,51,100,75,5),(1116,93,100,75,6),(1117,12,100,75,7),(1118,85,100,75,8),(1126,41,100,76,1),(1127,88,100,76,2),(1128,16,100,76,3),(1129,20,100,76,4),(1130,51,100,76,5),(1131,93,100,76,6),(1132,12,100,76,7),(1133,85,100,76,8),(1141,41,100,77,1),(1142,88,100,77,2),(1143,16,100,77,3),(1144,20,100,77,4),(1145,51,100,77,5),(1146,93,100,77,6),(1147,12,100,77,7),(1148,85,100,77,8),(1156,41,100,78,1),(1157,88,100,78,2),(1158,16,100,78,3),(1159,20,100,78,4),(1160,51,100,78,5),(1161,93,100,78,6),(1162,12,100,78,7),(1163,85,100,78,8),(1171,41,100,79,1),(1172,88,100,79,2),(1173,16,100,79,3),(1174,20,100,79,4),(1175,51,100,79,5),(1176,93,100,79,6),(1177,12,100,79,7),(1178,85,100,79,8),(1186,41,100,80,1),(1187,88,100,80,2),(1188,16,100,80,3),(1189,20,100,80,4),(1190,51,100,80,5),(1191,93,100,80,6),(1192,12,100,80,7),(1193,85,100,80,8),(1201,41,100,81,1),(1202,88,100,81,2),(1203,16,100,81,3),(1204,20,100,81,4),(1205,51,100,81,5),(1206,93,100,81,6),(1207,12,100,81,7),(1208,85,100,81,8),(1216,41,100,82,1),(1217,88,100,82,2),(1218,16,100,82,3),(1219,20,100,82,4),(1220,51,100,82,5),(1221,93,100,82,6),(1222,12,100,82,7),(1223,85,100,82,8),(1231,41,100,83,1),(1232,88,100,83,2),(1233,16,100,83,3),(1234,20,100,83,4),(1235,51,100,83,5),(1236,93,100,83,6),(1237,12,100,83,7),(1238,85,100,83,8),(1246,41,100,84,1),(1247,88,100,84,2),(1248,16,100,84,3),(1249,20,100,84,4),(1250,51,100,84,5),(1251,93,100,84,6),(1252,12,100,84,7),(1253,85,100,84,8),(1261,41,100,85,1),(1262,88,100,85,2),(1263,16,100,85,3),(1264,20,100,85,4),(1265,51,100,85,5),(1266,93,100,85,6),(1267,12,100,85,7),(1268,85,100,85,8),(1276,41,100,86,1),(1277,88,100,86,2),(1278,16,100,86,3),(1279,20,100,86,4),(1280,51,100,86,5),(1281,93,100,86,6),(1282,12,100,86,7),(1283,85,100,86,8),(1291,41,100,87,1),(1292,88,100,87,2),(1293,16,100,87,3),(1294,20,100,87,4),(1295,51,100,87,5),(1296,93,100,87,6),(1297,12,100,87,7),(1298,85,100,87,8),(1306,41,100,88,1),(1307,88,100,88,2),(1308,16,100,88,3),(1309,20,100,88,4),(1310,51,100,88,5),(1311,93,100,88,6),(1312,12,100,88,7),(1313,85,100,88,8),(1321,41,100,89,1),(1322,88,100,89,2),(1323,16,100,89,3),(1324,20,100,89,4),(1325,51,100,89,5),(1326,93,100,89,6),(1327,12,100,89,7),(1328,85,100,89,8);
/*!40000 ALTER TABLE `tb_estoque` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-23 18:43:34
