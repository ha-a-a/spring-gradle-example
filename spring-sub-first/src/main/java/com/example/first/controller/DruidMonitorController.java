package com.example.first.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangmengyue
 * @Description
 * @createTime 2023年08月11日 17:01:00
 */
@RestController
public class DruidMonitorController {
    /**
     * druid 监控数据
     *
     * @author Pumpkin
     * @createTime 2023/3/30 20:55
     */
    @GetMapping("/druid/stat")
    public Object druidStat() {
        // DruidStatManagerFacade#getDataSourceStatDataList 该方法可以获取所有数据源的监控数据，
        // 除此之外 DruidStatManagerFacade 还提供了一些其他方法，你可以按需选择使用。
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }
}
