package br.mateus.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticsDTO {

    private long count;
    private double sum;
    private double avg;
    private double min;
    private double max;

    public StatisticsDTO(DoubleSummaryStatistics statistics) {
        this.count = statistics.getCount();
        this.sum = statistics.getSum();
        this.avg = statistics.getAverage();
        this.min = statistics.getMin();
        this.max = statistics.getMax();
    }

}
