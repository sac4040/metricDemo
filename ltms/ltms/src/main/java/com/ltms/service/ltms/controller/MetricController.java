package com.ltms.service.ltms.controller;

import com.ltms.service.ltms.dto.ResultDTO;
import com.ltms.service.ltms.service.LtmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/metric")
public class MetricController {

    @Autowired
    private LtmsService service;

    @GetMapping("/health")
    public ResponseEntity<?> getHealth() {
        return new ResponseEntity<>("I am Ok!", HttpStatus.OK);
    }

    @PostMapping("postMetricData/{metricId}")
    public ResponseEntity<?> publishMetric(@RequestParam ("metricData") Long metricData) {
        ResultDTO result = service.postAllMetricData(metricId);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
