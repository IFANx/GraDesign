/*
Navicat MySQL Data Transfer

Source Server         : kkxu
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : gradesign

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2021-04-23 19:17:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for passenger
-- ----------------------------
DROP TABLE IF EXISTS `passenger`;
CREATE TABLE `passenger` (
  `user_phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `passenger_phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `passenger_real_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `passenger_id_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `passenger_type` int(20) NOT NULL,
  `passenger_address` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`passenger_phone_number`) USING BTREE,
  KEY `passenger_phone_number` (`passenger_phone_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
