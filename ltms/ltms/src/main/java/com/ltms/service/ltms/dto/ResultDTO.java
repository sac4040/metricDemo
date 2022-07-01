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
public class ResultDTO implements Serializable {
    private Long metricId;
    private int responseCode;
    private String responseMessage;
}
