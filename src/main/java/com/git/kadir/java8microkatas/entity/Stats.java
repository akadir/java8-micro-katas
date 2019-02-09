package com.git.kadir.java8microkatas.entity;

/**
 * @author akadir
 * Date: 09/02/2019
 * Time: 11:25
 */
public class Stats {
    private int count;
    private long sum;
    private int max;
    private int min;

    public Stats(int count, long sum, int min, int max) {
        this.sum = sum;
        this.count = count;
        this.max = max;
        this.min = min;
    }

    public int getCount() {
        return count;
    }

    public long getSum() {
        return sum;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public double getAverage() {
        return (double) sum / count;
    }
}
