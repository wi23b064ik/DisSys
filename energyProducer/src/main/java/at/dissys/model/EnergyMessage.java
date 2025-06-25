package at.dissys.model;

import java.io.Serializable;

public class EnergyMessage implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public enum Type {
        PRODUCER, USER
    }

    public enum Association {
        COMMUNITY, GRID
    }

    private Type type;
    private Association association;
    private double kwh;
    private String datetime;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public double getKwh() {
        return kwh;
    }

    public void setKwh(double kwh) {
        this.kwh = kwh;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "EnergyMessage{" +
                "type=" + type +
                ", association=" + association +
                ", kwh=" + kwh +
                ", datetime='" + datetime + '\'' +
                '}';
    }
}


