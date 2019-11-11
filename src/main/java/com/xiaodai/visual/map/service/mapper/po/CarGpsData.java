/**    
 * <p> Copyright (c) 2019-2023 xiaozhameng</p>
 * <p>All Rights Reserved. 保留所有权利. </p>
 */

package com.xiaodai.visual.map.service.mapper.po;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xiaozhameng
 */
@Data
public class CarGpsData {

    /** 主键 */
    private Long id;

    /** 车牌号 */
    private String licensePlateNo;

    /** GPS采集开始时间 */
    private Date gpsTimeStart;

    /** GPS采集结束时间 */
    private Date gpsTimeEnd;

    /** 经度（字符串表示） */
    private String longitude;

    /** 纬度（字符串表示） */
    private String latitude;

    /** 高度（字符串表示） */
    private String height;

    /** 速度 */
    private Integer speed;

    /** 方向 */
    private Integer direction;

    /** 车辆状态 */
    private Integer carStatus;

    /** 数据状态 */
    private Integer dataStatus;

}
