package pl.usedcardealer.usedcardealer.Report;

import java.time.LocalDate;

public abstract class Report {
    protected LocalDate reportGenerationDate;
    protected int numberOfReport;
    protected int income;
    protected int costs;
    protected int profit;

    protected abstract void generateReport();

    public abstract String getReportPeriod();

    public LocalDate getReportGenerationDate() {
        return reportGenerationDate;
    }

    public int getNumberOfReport() {
        return numberOfReport;
    }

    public int getIncome() {
        return income;
    }

    public int getCosts() {
        return costs;
    }

    public int getProfit() {
        return profit;
    }
}