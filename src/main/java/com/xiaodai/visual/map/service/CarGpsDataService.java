/**
 * <p> Copyright (c) 2019-2023 xiaozhameng</p>
 * <p>All Rights Reserved. 保留所有权利. </p>
 */

package com.xiaodai.visual.map.service;

import com.xiaodai.visual.map.dto.param.CarGpsDataQuery;
import com.xiaodai.visual.map.service.mapper.CarGpsDataDao;
import com.xiaodai.visual.map.service.mapper.po.CarGpsData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaozhameng
 */
@Service
public class CarGpsDataService {

    @Resource
    private CarGpsDataDao carGpsDataDao;


    /**
     * @param query 查询参数
     * @return
     */
    public List<CarGpsData> selectByQuery(CarGpsDataQuery query) {
        return carGpsDataDao.selectByQuery(query);
    }
}
