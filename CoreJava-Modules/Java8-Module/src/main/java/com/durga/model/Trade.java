package com.durga.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * @created 16/03/2025 - 11:42
 * @author DurgaNaresh
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success
 */
@Setter
@Getter
@ToString
public class Trade {
    private AtomicInteger tradeId = new AtomicInteger();
    private int id = 0;
    private String instrument = null;
    private String status = null;
    private int quantity = 0;

    public Trade(int id){
        setId(tradeId.getAndIncrement());
    }
    public Trade(String instrument, int quantity, String status) {
        setId(tradeId.getAndIncrement());
        setQuantity(quantity);
        setStatus(status);
        setInstrument(instrument);
    }

    public Trade(int id, String instrument, int quantity, String status) {
        setId(id);
        setQuantity(quantity);
        setStatus(status);
        setInstrument(instrument);
    }

    public Trade() {
        tradeId.getAndIncrement();
    }

    public boolean isOpen() {
        return true;
    }

    public boolean isBigTrade() {
        return getQuantity() > 1000000;
    }

    public boolean isNew() {
        return getStatus().equals("NEW");
    }

    public boolean isPending() {
        return getStatus().equals("PENDING");
    }

    public boolean isCancelledTrade() {
        return getStatus().equals("CANCEL") ;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((instrument == null) ? 0 : instrument.hashCode());
        result = prime * result + quantity;
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + ((tradeId == null) ? 0 : tradeId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Trade other = (Trade) obj;
        if (instrument == null) {
            if (other.instrument != null)
                return false;
        } else if (!instrument.equals(other.instrument))
            return false;
        if (quantity != other.quantity)
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }

    public boolean copy(EncryptedTrade t1) {
        //Copy t1 to this trade
        // logic of copying the Encrypted trade to this trade goes here
        return true;
    }
}
