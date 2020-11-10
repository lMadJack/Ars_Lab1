package com.program.Entities;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Class InternetContract that extends class Contract is used
 * if we make a contract about providing internet connection
 * and related services.
 * @author Arseniy Volnenko
 */
public class InternetContract extends Contract{
    /**
     * Declared internet connection speed
     */
    int maxSpeed;

    public InternetContract() {
    }

    public InternetContract(int id, LocalDate dateStart, LocalDate dateEnd, Client client, int maxSpeed) {
        super(id, dateStart, dateEnd, client);
        this.maxSpeed = maxSpeed;
    }

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
