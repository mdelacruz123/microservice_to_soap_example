package com.mdelacruz.ejemplo.dto;

import java.math.BigDecimal;

public class GQ001002Request {

    private BigDecimal sessionId;
    private String contextFunction;

    public String getContextFunction() {
        return contextFunction;
    }

    public BigDecimal getSessionId() {
        return sessionId;
    }

    public void setSessionId(BigDecimal sessionId) {
        this.sessionId = sessionId;
    }

    public void setContextFunction(String contextFunction) {
        this.contextFunction = contextFunction;
    }
}
