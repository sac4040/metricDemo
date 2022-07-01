package com.ltms.service.ltms.repository;

import com.ltms.service.ltms.entity.MetricThreshold;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MetricThresholdRepository extends JpaRepository<MetricThreshold, Long> {
    MetricThreshold findByMetricId(Long metricId);
}
