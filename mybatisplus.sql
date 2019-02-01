/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : mybatisplus

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 01/02/2019 16:58:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(30) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(10) NULL DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `test_column` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Jone', 18, 'test1@baomidou.com', 'test1');
INSERT INTO `user` VALUES (2, 'Jack', 20, 'test2@baomidou.com', 'test2');
INSERT INTO `user` VALUES (3, 'Tom', 28, 'test3@baomidou.com', 'test3');
INSERT INTO `user` VALUES (4, 'Sandy', 21, 'test4@baomidou.com', 'test4');
INSERT INTO `user` VALUES (5, 'Billie', 24, 'test5@baomidou.com', 'test5');

SET FOREIGN_KEY_CHECKS = 1;
