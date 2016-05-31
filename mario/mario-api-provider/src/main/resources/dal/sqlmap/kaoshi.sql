/*
MySQL Data Transfer

Source Server         : local
Source Server Version : 50529
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50529
File Encoding         : 65001

Author: yuanhong.li
Date: 2016-05-27 09:44:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bg_university
-- ----------------------------
DROP TABLE IF EXISTS `bg_university`;
CREATE TABLE `bg_university` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `name` varchar(64) DEFAULT NULL COMMENT '学校名称',
  `province` varchar(64) DEFAULT NULL COMMENT '所属省份',
  `detail_address` varchar(128) DEFAULT NULL COMMENT '详细地址',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0正常，1暂停，-1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学校';

-- ----------------------------
-- Table structure for bg_institute
-- ----------------------------
DROP TABLE IF EXISTS `bg_institute`;
CREATE TABLE `bg_institute` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `name` varchar(64) DEFAULT NULL COMMENT '专业名称',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0正常，1暂停，-1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学院专业+通用';

-- ----------------------------
-- Table structure for bg_course
-- ----------------------------
DROP TABLE IF EXISTS `bg_course`;
CREATE TABLE `bg_course` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `name` varchar(64) DEFAULT NULL COMMENT '课程名称',
  `institute_id` bigint(20) unsigned NOT NULL COMMENT '所属的专业ID',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0正常，1暂停，-1删除',
  PRIMARY KEY (`id`),
  KEY `idx_institute_id` (`institute_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学院专业';

-- ----------------------------
-- Table structure for bg_province
-- ----------------------------
DROP TABLE IF EXISTS `bg_province`;
CREATE TABLE `bg_province` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `name` varchar(64) DEFAULT NULL COMMENT '省份名称',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0正常，-1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='省份';

-- ----------------------------
-- Table structure for bg_spu
-- ----------------------------
DROP TABLE IF EXISTS `bg_spu`;
CREATE TABLE `bg_spu` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `category_id` bigint(20) unsigned NOT NULL COMMENT '类目Id',
  `university_id` bigint(20) unsigned NOT NULL COMMENT '学校Id',
  `institute_id` bigint(20) unsigned NOT NULL COMMENT '所属的专业ID',
  `course_id` bigint(20) unsigned NOT NULL COMMENT '课程Id',
  `name` varchar(64) DEFAULT NULL COMMENT '商品名称',
  `market_price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '市场价',
  `sale_price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '销售价',
  `pic_path` varchar(128) DEFAULT NULL COMMENT '商品图片地址',
  `inner_html` varchar(256) DEFAULT NULL COMMENT '内嵌html内容',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0正常，-1删除',
  PRIMARY KEY (`id`),
  KEY `idx_category_id` (`category_id`),
  KEY `idx_university_id` (`university_id`),
  KEY `idx_institute_id` (`institute_id`),
  KEY `idx_course_id` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品SPU';

-- ----------------------------
-- Table structure for bg_sku
-- ----------------------------
DROP TABLE IF EXISTS `bg_sku`;
CREATE TABLE `bg_sku` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `spu_id` bigint(20) unsigned NOT NULL COMMENT '商品ID',
  `bar_code` varchar(64) NOT NULL COMMENT '商品唯一标示',
  `exam_time` datetime DEFAULT NULL COMMENT '文档曾经考试时间',
  `has_answer` int(10) NOT NULL DEFAULT '0' COMMENT '是否有答案，0没有，1有',
  `sale_price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '销售价',
  `inventory` int(10) NOT NULL DEFAULT '0' COMMENT '库存数量',
  `disk_path` varchar(128) DEFAULT NULL COMMENT '文件存储位置',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0上架，1下架，-1删除',
  PRIMARY KEY (`id`),
  KEY `idx_spu_id` (`spu_id`),
  KEY `idx_bar_code` (`bar_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品SKU';

-- ----------------------------
-- Table structure for bg_order
-- ----------------------------
DROP TABLE IF EXISTS `bg_order`;
CREATE TABLE `bg_order` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `plan_total` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '应付总金额',
  `payment_total` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '实际支付金额',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '买家Id',
  `pay_time` datetime NOT NULL COMMENT '支付时间',
  `ship_address_id` bigint(20) unsigned NOT NULL COMMENT '收获地址关联Id',
  `order_status` int(10) NOT NULL DEFAULT '0' COMMENT '待完善',
  `sale_price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '销售价',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0正常，-1删除',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`),
  KEY `idx_order_status` (`order_status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单';

-- ----------------------------
-- Table structure for bg_order_item
-- ----------------------------
DROP TABLE IF EXISTS `bg_order_item`;
CREATE TABLE `bg_order_item` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `order_id` bigint(20) unsigned NOT NULL COMMENT '订单ID',
  `sku_id` bigint(20) unsigned NOT NULL COMMENT '商品SKUID',
  `bar_code` varchar(64) NOT NULL COMMENT '商品唯一标示',
  `sale_price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '销售价',
  `quantity` int(10) NOT NULL DEFAULT '0' COMMENT '购买数量',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0上架，1下架，-1删除',
  PRIMARY KEY (`id`),
  KEY `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单商品';

-- ----------------------------
-- Table structure for bg_order_log
-- ----------------------------
DROP TABLE IF EXISTS `bg_order_log`;
CREATE TABLE `bg_order_log` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `order_id` bigint(20) unsigned NOT NULL COMMENT '订单ID',
  `las` int(10) NOT NULL DEFAULT '0' COMMENT '之前状态',
  `cur` int(10) NOT NULL DEFAULT '0' COMMENT '当前状态',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0正常，-1删除',
  PRIMARY KEY (`id`),
  KEY `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单流水';

-- ----------------------------
-- Table structure for bg_cart_item
-- ----------------------------
DROP TABLE IF EXISTS `bg_cart_item`;
CREATE TABLE `bg_cart_item` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户ID',
  `sku_id` bigint(20) unsigned NOT NULL COMMENT '商品skuId',
  `sale_price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '销售价',
  `amount` int(10) NOT NULL DEFAULT '0' COMMENT '购买数量',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0正常，-1删除',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`),
  KEY `idx_sku_id` (`sku_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车';

-- ----------------------------
-- Table structure for bg_pay_record
-- ----------------------------
DROP TABLE IF EXISTS `bg_pay_record`;
CREATE TABLE `bg_pay_record` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户ID',
  `order_id` bigint(20) unsigned NOT NULL COMMENT '订单ID',
  `pay_method` varchar(32) DEFAULT NULL COMMENT '支付方式',
  `pay_total` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '支付金额',
  `pay_status` int(10) NOT NULL DEFAULT '0' COMMENT '待定',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0正常，-1删除',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`),
  KEY `idx_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付明细';

-- ----------------------------
-- Table structure for bg_user
-- ----------------------------
DROP TABLE IF EXISTS `bg_user`;
CREATE TABLE `bg_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `name` varchar(64) DEFAULT NULL COMMENT '用户名',
  `email` varchar(64) DEFAULT  NULL COMMENT '邮箱',
  `mobile` varchar(64) DEFAULT  NULL COMMENT '手机',
  `head_imge` varchar(256) DEFAULT  NULL COMMENT '用户头像',
  `nick_name` varchar(64) DEFAULT  NULL COMMENT '用户昵称',
  `gender` int(10) NOT NULL DEFAULT '0' COMMENT '性别0男1女',
  `account_type` int(10) NOT NULL DEFAULT '0' COMMENT '账号类型',
  `login_time` datetime  COMMENT '登录时间',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0正常，-1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';

-- ----------------------------
-- Table structure for bg_ship_address
-- ----------------------------
DROP TABLE IF EXISTS `bg_ship_address`;
CREATE TABLE `bg_ship_address` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户ID',
  `email` varchar(64) NOT NULL COMMENT '邮箱',
  `default_use` int(10) NOT NULL DEFAULT '0' COMMENT '是否默认0否，1是',
  `status` int(10) NOT NULL DEFAULT '0' COMMENT '0正常，-1删除',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户收获地';