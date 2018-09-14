/*
Navicat MySQL Data Transfer

Source Server         : wzzy
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : memo

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-09-14 11:41:56
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `dept`
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` int(11) NOT NULL,
  `dname` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '事业部');
INSERT INTO `dept` VALUES ('2', '销售部');
INSERT INTO `dept` VALUES ('3', '技术部');

-- ----------------------------
-- Table structure for `emp`
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `empno` int(11) NOT NULL AUTO_INCREMENT,
  `ename` varchar(10) DEFAULT NULL,
  `job` varchar(10) DEFAULT NULL,
  `mgr` varchar(10) DEFAULT NULL,
  `sal` int(11) DEFAULT NULL,
  `deptno` int(11) DEFAULT NULL,
  PRIMARY KEY (`empno`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('1', 'jacky', 'clerk', 'tom', '1000', '1');
INSERT INTO `emp` VALUES ('2', 'tom', 'clerk', 'null', '2000', '1');
INSERT INTO `emp` VALUES ('3', 'jenny', 'sales', 'pretty', '600', '2');
INSERT INTO `emp` VALUES ('4', 'pretty', 'sales', 'null', '800', '2');
INSERT INTO `emp` VALUES ('5', 'buddy', 'jishu', 'canndy', '1000', '3');
INSERT INTO `emp` VALUES ('6', 'canndy', 'jishu', 'null', '1500', '3');
INSERT INTO `emp` VALUES ('7', 'biddy', 'clerk', 'null', '2000', '1');
