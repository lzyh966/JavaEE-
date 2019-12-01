/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50515
Source Host           : 127.0.0.1:3306
Source Database       : db_homework_demo

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2019-11-04 11:17:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `true_name` varchar(20) NOT NULL COMMENT '真实姓名',
  `password` varchar(20) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '张三', '张三', '123456');
