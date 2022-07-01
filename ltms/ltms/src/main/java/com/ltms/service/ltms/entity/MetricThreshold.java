package com.ltms.service.ltms.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "METRIC_THRESHOLD", schema = "METRICS")
@Getter
@Setter
@NoArgsConstructor
public class MetricThreshold {

    @Id
    @Column(name = "THRESHOLD_ID")
    private Long thresholdId;

    @Column(name = "METRIC_ID")
    private Long metricId;

    @Column(name = "THRESHOLD_NAME")
    private String thresholdName;

    @Column(name = "THRESHOLD_TYPE")
    private String thresholdType;

    @Column(name = "KEY_OPERATOR")
    private String keyOperator;

    @Column(name = "AMBER_THRESHOLD")
    private Long amberThreshold;

    @Column(name = "GREEN_THRESHOLD")
    private Long greenThreshold;

    @Column(name = "TIME_ID")
    private Long timeID;

    @Column(name = "RED_THRESHOLD")
    private Long redThreshold;

}
