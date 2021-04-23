/*
Navicat MySQL Data Transfer

Source Server         : kkxu
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : gradesign

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2021-04-23 19:17:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for schedule_of_trains
-- ----------------------------
DROP TABLE IF EXISTS `schedule_of_trains`;
CREATE TABLE `schedule_of_trains` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'primary key',
  `tarin_no` varchar(20) NOT NULL COMMENT '列车号',
  `train_number` varchar(10) NOT NULL COMMENT '车次',
  `departure_station` varchar(10) DEFAULT NULL COMMENT '始发站',
  `end_station` varchar(10) DEFAULT NULL COMMENT '终点站',
  `from_station` varchar(10) NOT NULL COMMENT '出发站',
  `to_station` varchar(10) NOT NULL COMMENT '到达站',
  `departure_time` varchar(10) NOT NULL COMMENT '出发时间',
  `arrival_time` varchar(10) NOT NULL COMMENT '到达时间',
  `use_time` varchar(10) NOT NULL COMMENT '历时',
  `business_seat` varchar(10) DEFAULT NULL COMMENT '商务座特等座(A9)',
  `first_class_seats` varchar(10) DEFAULT NULL COMMENT '一等座(M)',
  `second_class_seats` varchar(10) DEFAULT NULL COMMENT '二等座(O)',
  `high_grade_soft_berth` varchar(10) DEFAULT NULL COMMENT '高级软卧(A6)',
  `soft_bed_first_class_bed` varchar(10) DEFAULT NULL COMMENT '软卧一等卧(A4)',
  `motor_train_bed` varchar(10) DEFAULT NULL COMMENT '动卧(F)',
  `hard_second_class_bed` varchar(10) DEFAULT NULL COMMENT '硬卧二等卧(A3)',
  `soft_seats` varchar(10) DEFAULT NULL COMMENT '软座(A2)',
  `hard_seat` varchar(10) DEFAULT NULL COMMENT '硬座(A1)',
  `seatless` varchar(10) DEFAULT NULL COMMENT '无座(WZ)',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tarin_no` (`tarin_no`,`train_number`,`departure_station`,`end_station`,`from_station`,`to_station`,`departure_time`,`arrival_time`,`use_time`)
) ENGINE=InnoDB AUTO_INCREMENT=816952 DEFAULT CHARSET=utf8;
