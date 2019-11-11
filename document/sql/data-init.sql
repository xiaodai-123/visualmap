-- 数据表建表语句
CREATE DATABASE `gps_demo` /*!40100 DEFAULT CHARACTER SET latin1 */;

-- 数据表
-- 车程位置数据表
CREATE TABLE `car_gps_data`
(
  `ID`               bigint(20)  not null auto_increment comment '主键',
  `LICENSE_PLATE_NO` varchar(32) not null comment '车牌号',
  `GPS_TIME_START`   datetime    not null comment 'GPS采集开始时间',
  `GPS_TIME_END`     datetime    not null comment 'GPS采集结束时间',
  `LONGITUDE`        varchar(20) not null comment '经度（字符串表示）',
  `LATITUDE`         varchar(20) not null comment '纬度（字符串表示）',
  `HEIGHT`           varchar(20) not null comment '高度（字符串表示）',

  `SPEED`            int         not null default 0 comment '速度',
  `DIRECTION`        int         not null default 0 comment '方向',
  `CAR_STATUS`       int         not null default 0 comment '车辆状态',
  `DATA_STATUS`      int         not null default 0 comment '数据状态',
  PRIMARY KEY (`ID`),
  KEY `IDX_GPS_TIME_START` (`GPS_TIME_START`) USING BTREE,
  KEY `IDX_LICENSE_PLATE_NO` (`LICENSE_PLATE_NO`) USING BTREE
);
