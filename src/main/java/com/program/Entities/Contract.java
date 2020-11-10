package com.program.Entities;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Class Contract contains base information of any contract. Contract is superclass for InternetContract, TVContract and PhoneContract.
 * @author Arseniy Volnenko
 */
public class Contract {
    /**
     * ID of contract
     */
    int id;
    /**
     * When contract started
     */
    LocalDate dateStart;
    /**
     * When contract is going to be finished
     */
    LocalDate dateEnd;
    /**
     * Object of client that uses certain contract
     */
    public Client client;

    public Contract() {

    }

    public Contract(int id, LocalDate dateStart, LocalDate dateEnd, Client client) {
        this.id = id;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", client=" + client +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return id == contract.id &&
                Objects.equals(dateStart, contract.dateStart) &&
                Objects.equals(dateEnd, contract.dateEnd) &&
                Objects.equals(client, contract.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateStart, dateEnd, client);
    }
}
