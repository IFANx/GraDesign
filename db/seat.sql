/*
Navicat MySQL Data Transfer

Source Server         : kkxu
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : gradesign

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2021-04-23 19:17:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for seat
-- ----------------------------
DROP TABLE IF EXISTS `seat`;
CREATE TABLE `seat` (
  `train_no` varchar(20) NOT NULL,
  `carriage_no` varchar(20) NOT NULL,
  `seat_type` varchar(20) NOT NULL,
  `seat_count` int(20) NOT NULL,
  PRIMARY KEY (`train_no`,`carriage_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
