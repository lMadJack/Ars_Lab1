package com.program.Entities;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Class Client contains all the inforamation about client entity
 * @author Arseniy Volnenko
 */
public class Client {
    /**
     * ID of client
     */
    int id;
    /**
     * Name of client
     */
    String name;
    /**
     * Date of birth of client
     */
    LocalDate date;
    /**
     * Sex of client
     */
    String sex;
    /**
     * Passport number of client
     */
    String passportNumber;

    public Client() {

    }

    public Client(int id, String name, LocalDate date, String sex, String passportNumber) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.passportNumber = passportNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", sex='" + sex + '\'' +
                ", passportNumber=" + passportNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                Objects.equals(passportNumber, client.passportNumber) &&
                Objects.equals(name, client.name) &&
                Objects.equals(date, client.date) &&
                Objects.equals(sex, client.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, sex, passportNumber);
    }
}
