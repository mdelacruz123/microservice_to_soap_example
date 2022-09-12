package com.mdelacruz.ejemplo.dto;

public class GR091001Response {
    private String signOnId;
    private String signOnDate;
    private String sessionType;
    private String clientNetworkAddress;

    public String getSignOnId() {
        return signOnId;
    }

    public void setSignOnId(String signOnId) {
        this.signOnId = signOnId;
    }

    public String getSignOnDate() {
        return signOnDate;
    }

    public void setSignOnDate(String signOnDate) {
        this.signOnDate = signOnDate;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public String getClientNetworkAddress() {
        return clientNetworkAddress;
    }

    public void setClientNetworkAddress(String clientNetworkAddress) {
        this.clientNetworkAddress = clientNetworkAddress;
    }
}
