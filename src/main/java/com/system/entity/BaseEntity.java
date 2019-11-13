package com.system.entity;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.sql.Timestamp;
import java.util.Date;

public class BaseEntity {

    @Id
    private int id;

    @Column(name="operator_num",updatable = false)
    private String operatornum;

    @Column(name="operator",updatable = false)
    private String operator;

    @Column(name="operator_date",updatable = false)
    private Timestamp operatordate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperatornum() {
        return operatornum;
    }

    public void setOperatornum(String operatornum) {
        this.operatornum = operatornum;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Timestamp getOperatordate() {
        return operatordate;
    }

    public void setOperatordate(Timestamp operatordate) {
        this.operatordate = operatordate;
    }
}
