package com.xiaodai.visual.map.test.service;

import com.alibaba.fastjson.JSONObject;
import com.xiaodai.visual.map.dto.param.CarGpsDataQuery;
import com.xiaodai.visual.map.service.CarGpsDataService;
import com.xiaodai.visual.map.service.mapper.po.CarGpsData;
import com.xiaodai.visual.map.util.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:Test-applicationContext.xml")
public class CarGpsDataServiceTest {

    @Resource
    private CarGpsDataService carGpsDataService;

    @Test
    public void selectByLimit() {
        CarGpsDataQuery query = CarGpsDataQuery.builder()
//                .startTime(DateUtils.getDateFromString("201403242055",DateUtils.DATE_FORMAT_YYYYMMDDHHMM))
//                .endTime(DateUtils.getDateFromString("201403252055",DateUtils.DATE_FORMAT_YYYYMMDDHHMM))
                .pageSize(100)
                .build();
        List<CarGpsData> data = carGpsDataService.selectByQuery(query);
        System.out.println(JSONObject.toJSONString(data));
    }

}