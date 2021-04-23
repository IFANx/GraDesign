/*
Navicat MySQL Data Transfer

Source Server         : kkxu
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : gradesign

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2021-04-23 19:17:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for train_info
-- ----------------------------
DROP TABLE IF EXISTS `train_info`;
CREATE TABLE `train_info` (
  `train_no` varchar(20) NOT NULL,
  `train_number` varchar(20) NOT NULL,
  `train_type` varchar(10) NOT NULL,
  `train_carriages` int(11) NOT NULL,
  `train_start_station` varchar(20) NOT NULL,
  `train_end_station` varchar(20) NOT NULL,
  `train_start_time` varchar(20) NOT NULL,
  `train_end_time` varchar(20) NOT NULL,
  `train_arrive_day` varchar(20) NOT NULL,
  `train_runing_time` varchar(20) NOT NULL,
  `train_run_type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`train_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
