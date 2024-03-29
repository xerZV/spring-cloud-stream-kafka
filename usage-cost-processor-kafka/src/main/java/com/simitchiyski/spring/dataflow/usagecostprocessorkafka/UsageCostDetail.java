package com.simitchiyski.spring.dataflow.usagecostprocessorkafka;

public class UsageCostDetail {
    private String userId;
    private double callCost;
    private double dataCost;

    public UsageCostDetail() {
    }

    public UsageCostDetail(String userId, int callCost, int dataCost) {
        this.userId = userId;
        this.callCost = callCost;
        this.dataCost = dataCost;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getCallCost() {
        return callCost;
    }

    public void setCallCost(double callCost) {
        this.callCost = callCost;
    }

    public double getDataCost() {
        return dataCost;
    }

    public void setDataCost(double dataCost) {
        this.dataCost = dataCost;
    }
}
