package br.mateus.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.DoubleSummaryStatistics;

public class StatisticsDTO {

    @Schema(description = "Quantidade de transações", example = "10")
    private long count;

    @Schema(description = "Soma total das transações", example = "1000.0")
    private double sum;

    @Schema(description = "Média das transações", example = "100.0")
    private double avg;

    @Schema(description = "Valor mínimo das transações", example = "50.0")
    private double min;

    @Schema(description = "Valor máximo das transações", example = "200.0")
    private double max;

    public long getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public StatisticsDTO(DoubleSummaryStatistics statistics) {
        this.count = statistics.getCount();
        this.sum = statistics.getSum();
        this.avg = statistics.getAverage();
        this.min = statistics.getMin();
        this.max = statistics.getMax();
    }

}
