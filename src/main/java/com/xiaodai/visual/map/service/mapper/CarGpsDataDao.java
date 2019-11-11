/**
 * <p> Copyright (c) 2019-2023 xiaozhameng</p>
 * <p>All Rights Reserved. 保留所有权利. </p>
 */

package com.xiaodai.visual.map.service.mapper;


import com.xiaodai.visual.map.dto.param.CarGpsDataQuery;
import com.xiaodai.visual.map.service.mapper.po.CarGpsData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xiaozhameng
 */
public interface CarGpsDataDao {

    /**
     * 查询全部的数据，当然这个只是demo程序才会这么干的事情
     *
     * @param query 查询请求参数
     *
     * @return
     */
    List<CarGpsData> selectByQuery(CarGpsDataQuery query);
}