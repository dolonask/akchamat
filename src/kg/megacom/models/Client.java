package kg.megacom.models;

import kg.megacom.enums.CreditStatus;

import java.util.ArrayList;
import java.util.Calendar;

public class Client {

    private double id;
    private String phone;
    private String idCard;
    private boolean isBlocked;
    private ArrayList<Credit> credits;

    public Client(String phone, String idCard) {
        this.id = Math.random();
        this.phone = phone;
        this.idCard = idCard;
        this.isBlocked = false;
        credits = new ArrayList<>();
    }

    public double getId() {
        return id;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public ArrayList<Credit> getCredits() {
        return credits;
    }

    public boolean hasOpenedCredit(){
        for (Credit credit : credits){
            if (credit.getStatus().equals(CreditStatus.OPEN)){
                return true;
            }
        }

        return false;
    }

    public int getCreditCountByStatusAndPeriod(CreditStatus creditStatus, int months){

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, months * (-1));
        int counter = 0;

        for (Credit credit: credits
             ) {
            if (credit.getStatus().equals(creditStatus) && credit.getStartDate().after(calendar.getTime())){
                counter++;
            }
        }

        return counter;
    }

}
