package pl.usedcardealer.usedcardealer.Report;

import java.time.LocalDate;
import java.time.Year;

public class YearlyReport extends Report {
    private Year yearOfReport;

    public YearlyReport(Year yearOfReport) {
        this.yearOfReport = yearOfReport;
        super.reportGenerationDate = LocalDate.now();
    }

    @Override
    protected void generateReport() { }

    @Override
    public String getReportPeriod() {
        return ("Rok: " + yearOfReport);
    }
}
