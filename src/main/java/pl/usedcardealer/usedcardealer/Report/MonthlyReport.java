package pl.usedcardealer.usedcardealer.Report;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class MonthlyReport extends Report {
    private Year yearOfReport;
    private Month monthOfReport;

    public MonthlyReport(Year yearOfReport, Month monthOfReport) {
        this.yearOfReport = yearOfReport;
        this.monthOfReport = monthOfReport;
        super.reportGenerationDate = LocalDate.now();
    }

    @Override
    protected void generateReport() { }

    @Override
    public String getReportPeriod() { return ("Rok: " + yearOfReport + " | Miesiac: " + monthOfReport); }
}
