package com.ltms.service.ltms.service;

import com.ltms.service.ltms.dto.ResultDTO;

public interface LtmsService {
    public ResultDTO postAllMetricData(Long metricId);

    ResultDTO postAllMetricData();

    public void getAllMeasures();

    void getMetricExposure();
}
