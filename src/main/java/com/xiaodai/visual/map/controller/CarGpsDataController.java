package com.xiaodai.visual.map.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.xiaodai.visual.map.dto.param.CarGpsDataQuery;
import com.xiaodai.visual.map.service.CarGpsDataService;
import com.xiaodai.visual.map.service.mapper.po.CarGpsData;
import com.xiaodai.visual.map.util.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GPS 数据操作控制器
 *
 * @author xiaodai
 */
@Controller
@RequestMapping(value = "/visual/map/gps")
public class CarGpsDataController extends BaseController {

    @Resource
    private CarGpsDataService carGpsDataService;

    /**
     * 获取指定条数的数据
     * <p>
     * 方法没有使用java8高级特性，显得臃肿
     *
     * @return
     */
    @RequestMapping(value = "datalist", method = RequestMethod.POST, produces = "application/json;charset=utf8")
    @ResponseBody
    public String gpsDataList(@RequestBody CarGpsDataQuery query) {
        // 这里先用这种简单的方式实现
        query.setStartTime(DateUtils.getDateFromString(query.getStartTimeStr(), DateUtils.DATE_FORMAT_YYYYMMDDHHMM));
        query.setEndTime(DateUtils.getDateFromString(query.getEndTimeStr(), DateUtils.DATE_FORMAT_YYYYMMDDHHMM));
        // 数据格式校验
        List<CarGpsData> carGpsData = carGpsDataService.selectByQuery(query);

        // 数据按照GPS的经度和纬度分组，获取count值  {"lng":116.418261,"lat":39.921984,"count":50},
        Map<String, Long> countMap = new HashMap<String, Long>();
        for (CarGpsData carGpsDatum : carGpsData) {
            String key = carGpsDatum.getLongitude() + "_" + carGpsDatum.getLatitude();
            Long count = countMap.get(key) == null ? 0 : countMap.get(key);
            countMap.put(key, count + 1);
        }

        JSONArray array = new JSONArray();
        for (CarGpsData carGpsDatum : carGpsData) {
            JSONObject item = new JSONObject();
            item.put("lng", Double.valueOf(carGpsDatum.getLongitude()));
            item.put("lat", Double.valueOf(carGpsDatum.getLatitude()));

            String key = carGpsDatum.getLongitude() + "_" + carGpsDatum.getLatitude();
            item.put("count", countMap.get(key));
            array.add(item);
        }
        return array.toJSONString();
    }

}
