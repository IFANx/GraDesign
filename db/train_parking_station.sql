/*
Navicat MySQL Data Transfer

Source Server         : kkxu
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : gradesign

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2021-04-23 19:17:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for train_parking_station
-- ----------------------------
DROP TABLE IF EXISTS `train_parking_station`;
CREATE TABLE `train_parking_station` (
  `train_no` varchar(20) NOT NULL,
  `train_number` varchar(20) NOT NULL,
  `arrive_day_str` varchar(20) NOT NULL,
  `arrive_time` varchar(20) NOT NULL,
  `start_time` varchar(20) NOT NULL,
  `running_time` varchar(20) NOT NULL,
  `station_no` varchar(20) NOT NULL,
  `station_name` varchar(20) NOT NULL,
  PRIMARY KEY (`train_no`,`station_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
