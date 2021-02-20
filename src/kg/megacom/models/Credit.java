package kg.megacom.models;

import kg.megacom.enums.CreditStatus;

import java.util.Calendar;
import java.util.Date;

public class Credit {

    private double id;
    private Date startDate;
    private Date endDate;
    private Date naviDate;
    private double summ;
    private int  percent;
    private double penalty;
    private CreditStatus status;
    private int days;

    public Credit(double summ, int percent, int days) {
        Calendar calendar = Calendar.getInstance();

        this.id = Math.random();
        this.startDate = calendar.getTime();
        this.naviDate = calendar.getTime();
        this.summ = summ;
        this.percent = percent;

        calendar.add(Calendar.DAY_OF_YEAR, days);
        this.endDate = calendar.getTime();
        this.status = CreditStatus.OPEN;
    }

    public double getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getNaviDate() {
        return naviDate;
    }

    public void setNaviDate(Date naviDate) {
        this.naviDate = naviDate;
    }

    public double getSumm() {
        return summ;
    }

    public void setSumm(double summ) {
        this.summ = summ;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public CreditStatus getStatus() {
        return status;
    }

    public void setStatus(CreditStatus status) {
        this.status = status;
    }
}
