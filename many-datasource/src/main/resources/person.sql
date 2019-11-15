
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
  `id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '主键',
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '姓名',
  `age` int(10) NULL DEFAULT NULL COMMENT '年龄',
  `create_by` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '更新人',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间 ',
  PRIMARY KEY (`id`(4)) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '测试1', 10, '', '2019-11-03 14:16:00', '', '2019-11-03 14:16:00');
INSERT INTO `person` VALUES ('10', '测试10', 19, '', '2019-11-03 14:16:09', '', '2019-11-03 14:16:09');
INSERT INTO `person` VALUES ('11', '测试11', 20, '', '2019-11-03 14:16:10', '', '2019-11-03 14:16:10');
INSERT INTO `person` VALUES ('12', '测试12', 21, '', '2019-11-03 14:16:11', '', '2019-11-03 14:16:11');
INSERT INTO `person` VALUES ('13', '测试13', 22, '', '2019-11-03 14:16:12', '', '2019-11-03 14:16:12');
INSERT INTO `person` VALUES ('2', '测试2', 11, '', '2019-11-03 14:16:01', '', '2019-11-03 14:16:01');
INSERT INTO `person` VALUES ('3', '测试3', 12, '', '2019-11-03 14:16:02', '', '2019-11-03 14:16:02');
INSERT INTO `person` VALUES ('4', '测试4', 13, '', '2019-11-03 14:16:03', '', '2019-11-03 14:16:03');
INSERT INTO `person` VALUES ('5', '测试5', 14, '', '2019-11-03 14:16:04', '', '2019-11-03 14:16:04');
INSERT INTO `person` VALUES ('6', '测试6', 15, '', '2019-11-03 14:16:05', '', '2019-11-03 14:16:05');
INSERT INTO `person` VALUES ('7', '测试7', 16, '', '2019-11-03 14:16:06', '', '2019-11-03 14:16:06');
INSERT INTO `person` VALUES ('8', '测试8', 17, '', '2019-11-03 14:16:07', '', '2019-11-03 14:16:07');
INSERT INTO `person` VALUES ('9', '测试9', 18, '', '2019-11-03 14:16:08', '', '2019-11-03 14:16:08');

SET FOREIGN_KEY_CHECKS = 1;
