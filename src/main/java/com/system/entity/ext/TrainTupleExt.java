package com.system.entity.ext;

import com.system.entity.TrainTuple;

import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name="train_tuple")
public class TrainTupleExt extends TrainTuple {

    @Transient
    private String roughFamily;

    @Transient
    private String thinFamily;

    @Transient
    private String city;

    public String getRoughFamily() {
        return roughFamily;
    }

    public void setRoughFamily(String roughFamily) {
        this.roughFamily = roughFamily;
    }

    public String getThinFamily() {
        return thinFamily;
    }

    public void setThinFamily(String thinFamily) {
        this.thinFamily = thinFamily;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
