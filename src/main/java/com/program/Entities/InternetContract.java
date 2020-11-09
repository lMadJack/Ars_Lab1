package com.program.Entities;

import java.time.LocalDate;
import java.util.Objects;
import com.program.Entities.Client;
public class InternetContract extends Contract{
    int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "InternetContract{" +
                "maxSpeed=" + maxSpeed +
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
        InternetContract that = (InternetContract) o;
        return maxSpeed == that.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed);
    }
}
