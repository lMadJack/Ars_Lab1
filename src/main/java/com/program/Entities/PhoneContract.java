package com.program.Entities;

import java.time.LocalDate;
import java.util.Objects;

public class PhoneContract extends Contract{
    int mins;
    int sms;
    int traffic;

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public int getSms() {
        return sms;
    }

    public void setSms(int sms) {
        this.sms = sms;
    }

    public int getTraffic() {
        return traffic;
    }

    public void setTraffic(int traffic) {
        this.traffic = traffic;
    }

    @Override
    public String toString() {
        return "PhoneContract{" +
                "mins=" + mins +
                ", sms=" + sms +
                ", traffic=" + traffic +
                ", id=" + id +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", client=" + client +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneContract that = (PhoneContract) o;
        return mins == that.mins &&
                sms == that.sms &&
                traffic == that.traffic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mins, sms, traffic);
    }
}
