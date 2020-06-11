package com.julioluis.limitsservice.beans;

public class LimitConfiguration {
    private int maximun;
    private int minimun;

    public LimitConfiguration(int maximun, int minimun) {
        this.maximun = maximun;
        this.minimun = minimun;
    }

    public int getMaximun() {
        return maximun;
    }

    public int getMinimun() {
        return minimun;
    }
}
