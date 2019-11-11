/**
 * <p> Copyright (c) 2019-2023 xiaozhameng</p>
 * <p>All Rights Reserved. 保留所有权利. </p>
 */

package com.xiaodai.visual.map.dto.param;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author xiaozhameng
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarGpsDataQuery {

    /** 车牌号 */
    private String licensePlateNo;

    /** GPS采集开始时间-字符串（冗余实现） */
    private String startTimeStr;

    /** GPS采集结束时间-字符串（冗余实现） */
    private String endTimeStr;

    /** GPS采集开始时间 */
    private Date startTime;

    /** GPS采集结束时间 */
    private Date endTime;

    /** 页面大小 */
    private Integer pageSize;

    /** 车辆状态 */
    private Integer carStatus;

    /** 数据状态 */
    private Integer dataStatus;

}
