/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all.model;

/**
 *
 * @author acer
 */
public class Date {
    private String day;
    private Date d;
    private String dS;

    public Date() {
    }

    public Date(String day, Date d, String dS) {
        this.day = day;
        this.d = d;
        this.dS = dS;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public String getdS() {
        return dS;
    }

    public void setdS(String dS) {
        this.dS = dS;
    }
    
    
}
