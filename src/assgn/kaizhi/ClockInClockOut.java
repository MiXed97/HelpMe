/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn.kaizhi;

import assgn.DeliveryMen;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author KaiZhi
 */
public class ClockInClockOut {

    private String date;
    private String clock_in = "";
    private String clock_out = "";
    private String worked_hour = "";

    public ClockInClockOut() {
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setClock_in(String clock_in) {
        this.clock_in = clock_in;
    }

    public void setClock_out(String clock_out) {
        this.clock_out = clock_out;
    }

    public void setWorked_hour(String worked_hour) {
        this.worked_hour = worked_hour;
    }

    public String getDate() {
        return date;
    }

    public String getClock_in() {
        return clock_in;
    }

    public String getClock_out() {
        return clock_out;
    }

    public String getWorked_hour() {
        return worked_hour;
    }

    public void clockIn() {
        Date now = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat dateF = new SimpleDateFormat("dd-MM-yyyy");
        clock_in = timeFormat.format(now);
        date = dateF.format(now);

    }

    public void clockOut() {
        Date now = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        clock_out = timeFormat.format(now);
    }

    public boolean noClockIn() {
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String cmp = format.format(now);

        if (cmp.equals(date) && !clock_in.isEmpty()) {
            return false;
            //clock in before
        } else {
            return true;
            // didnt clock in at all
        }
    }

    public boolean noClockOut() {

        if (clock_out.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
