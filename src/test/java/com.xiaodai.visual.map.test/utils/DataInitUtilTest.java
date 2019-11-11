package com.xiaodai.visual.map.test.utils;

import com.xiaodai.visual.map.util.DataInitUtil;
import org.junit.Test;

import java.io.IOException;

/**
 * 数据处理工具类
 */
public class DataInitUtilTest {

    @Test
    public void testInit() throws IOException {
        DataInitUtil.initSqlData();
    }

}
