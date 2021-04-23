/*
Navicat MySQL Data Transfer

Source Server         : kkxu
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : gradesign

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2021-04-23 19:17:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_phone_number` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `user_password` varchar(20) NOT NULL,
  `user_email` varchar(20) NOT NULL,
  `user_real_name` varchar(10) NOT NULL,
  `user_leixing` int(5) NOT NULL,
  `user_id_number` varchar(20) NOT NULL,
  `user_gender` int(2) NOT NULL,
  `user_address` varchar(50) NOT NULL,
  PRIMARY KEY (`user_phone_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
