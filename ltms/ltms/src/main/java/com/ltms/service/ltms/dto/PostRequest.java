package com.ltms.service.ltms.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class PostRequest implements Serializable {

    private Long metricId;
    private String metricName;
    private String metricType;
    private String measureType;
    private String measureUnit;
    private String metricStatus;
    private String thresholdName;
    private String thresholdType;
    private String keyOperator;
    private Long amberThreshold;
    private Long greenThreshold;
    private Long redThreshold;
    private Long timeId;

}
