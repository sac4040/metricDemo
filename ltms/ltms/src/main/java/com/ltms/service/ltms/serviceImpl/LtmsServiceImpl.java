package com.ltms.service.ltms.serviceImpl;

import com.ltms.service.ltms.dto.PostRequest;
import com.ltms.service.ltms.dto.ResultDTO;
import com.ltms.service.ltms.entity.MetricInventory;
import com.ltms.service.ltms.entity.MetricThreshold;
import com.ltms.service.ltms.repository.MetricInventoryRepository;
import com.ltms.service.ltms.repository.MetricThresholdRepository;
import com.ltms.service.ltms.service.LtmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class LtmsServiceImpl implements LtmsService {

    Logger logger = LoggerFactory.getLogger(LtmsServiceImpl.class);

    @Autowired
    MetricInventoryRepository metricInventoryRepo;

    @Autowired
    MetricThresholdRepository metricThresholdRepo;


    @Override
    public ResultDTO postAllMetricData(Long metricId) {

        PostRequest postRequestRecord = new PostRequest();

        Optional<MetricInventory> metricInventoryRecord = metricInventoryRepo.findById(metricId);

        MetricThreshold metricThresholdRecord = metricThresholdRepo.findByMetricId(metricId);

        postRequestRecord.setMetricId(metricId);
        postRequestRecord.setMetricName(metricInventoryRecord.get().getMetricName());
        postRequestRecord.setMetricType(metricInventoryRecord.get().getMetricType());
        postRequestRecord.setMeasureType(metricInventoryRecord.get().getMeasureType());
        postRequestRecord.setMeasureUnit(metricInventoryRecord.get().getMeasureUnit());
        postRequestRecord.setMetricStatus(metricInventoryRecord.get().getMetricStatus());
        postRequestRecord.setThresholdName(metricThresholdRecord.getThresholdName());
        postRequestRecord.setThresholdType(metricThresholdRecord.getThresholdType());
        postRequestRecord.setKeyOperator(metricThresholdRecord.getKeyOperator());
        postRequestRecord.setAmberThreshold(metricThresholdRecord.getAmberThreshold());
        postRequestRecord.setGreenThreshold(metricThresholdRecord.getGreenThreshold());
        postRequestRecord.setRedThreshold(metricThresholdRecord.getRedThreshold());
        postRequestRecord.setTimeId(metricThresholdRecord.getTimeID());

        return null;
    }

    @Override
    public ResultDTO postAllMetricData() {
        //Call POST API of ERDL application

        ResultDTO rs = new ResultDTO();
        rs.setMetricId(123456L);
        rs.setResponseCode(200);
        rs.setResponseMessage("Metric details have been sent successfully");
        return rs;
    }

    @Override
    public void getAllMeasures() {

    }

    @Override
    public void getMetricExposure() {

    }


}
