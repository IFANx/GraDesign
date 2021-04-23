/*
Navicat MySQL Data Transfer

Source Server         : kkxu
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : gradesign

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2021-04-23 19:16:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order_list
-- ----------------------------
DROP TABLE IF EXISTS `order_list`;
CREATE TABLE `order_list` (
  `order_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `passenger_phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `passenger_id_number` varchar(20) NOT NULL,
  `train_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `start_station_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `start_station_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `end_station_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `end_station_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `carriage_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `seat_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `order_money` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `order_create_time` datetime DEFAULT NULL,
  `order_status` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `train_start_date` datetime DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `start_station_no` (`start_station_no`) USING BTREE,
  KEY `end_station_no` (`end_station_no`) USING BTREE,
  KEY `train_no` (`train_no`) USING BTREE,
  KEY `train_start_date` (`train_start_date`) USING BTREE,
  KEY `order_status` (`order_status`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=469 DEFAULT CHARSET=utf8;
