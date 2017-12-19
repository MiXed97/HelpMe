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

    private DeliveryMen Deliverymen;
    private String date;
    private String clock_in;
    private String clock_out;

    public ClockInClockOut(DeliveryMen Deliverymen, String date) {
        this.Deliverymen = Deliverymen;
        this.date = date;
        this.clock_in = "";
        this.clock_out = "";
    }

    public void setDeliverymen(DeliveryMen Deliverymen) {
        this.Deliverymen = Deliverymen;
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

    public DeliveryMen getDeliverymen() {
        return Deliverymen;
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

    public boolean noClockIn() {
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String cmp = format.format(now);
        if (cmp.equals(date)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean noClockOut() {

        if (!clock_out.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
