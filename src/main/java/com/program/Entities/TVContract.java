package com.program.Entities;

import java.time.LocalDate;
import java.util.Objects;

public class TVContract extends Contract {

    String channelPack;

    public String getChannelPack() {
        return channelPack;
    }

    public void setChannelPack(String channelPack) {
        this.channelPack = channelPack;
    }

    @Override
    public String toString() {
        return "TVContract{" +
                "id=" + id +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", channelPack='" + channelPack + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVContract that = (TVContract) o;
        return id == that.id &&
                Objects.equals(dateStart, that.dateStart) &&
                Objects.equals(dateEnd, that.dateEnd) &&
                Objects.equals(channelPack, that.channelPack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateStart, dateEnd, channelPack);
    }
}
