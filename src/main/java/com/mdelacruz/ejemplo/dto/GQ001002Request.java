package com.mdelacruz.ejemplo.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class GQ001002Request {
    private BigDecimal sessionId;
    private String contextFunction;
}
