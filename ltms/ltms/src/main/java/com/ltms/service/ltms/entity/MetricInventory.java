package com.ltms.service.ltms.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "METRIC_INVENTORY", schema = "METRICS")
@Getter
@Setter
@NoArgsConstructor
//@ToString
public class MetricInventory {

    @Id
    @Column(name = "METRIC_ID")
    private Long metricId;

    @Column(name = "METRIC_NAME")
    private String metricName;

    @Column(name = "METRIC_DESCRIPTION")
    private String metricDescription;

    @Column(name = "REQUEST_TYPE")
    private String requestType;

    @Column(name = "METRIC_TYPE")
    private String metricType;

    @Column(name = "REPORT_LOCATION")
    private String reportLocation;

    //Data type for Char(1)
    @Column(name = "METRIC_INDICATOR")
    private String metricIndicator;

    @Column(name = "REGULATORY_INDICATOR")
    private String regulatoryIndicator;

    @Column(name = "APPROVAL_DATE")
    private Date approvalDate;

    @Column(name = "RETIRE_DATE")
    private Date retireDate;

    @Column(name = "RETIRE_REASON")
    private String retireReason;

    @Column(name = "REPORTING_FREQUENCY")
    private String reportingFrequency;

    @Column(name = "MONITORING_FREQUENCY")
    private String MonitoringFrequency;

    @Column(name = "GLOBAL_REQUIREMENT_IND")
    private String globalRequirementInd;

    @Column(name = "MEASURE_TYPE")
    private String measureType;

    @Column(name = "MEASURE_UNIT")
    private String measureUnit;

    @Column(name = "METRIC_STATUS")
    private String metricStatus;

    @Column(name = "ACTIVE_IND")
    private String activeInd;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "EFFECTIVE_START_DATE")
    private String effectiveStartDate;

    @Column(name = "EFFECTIVE_END_DATE")
    private String effectiveEndDate;


}

