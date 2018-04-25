package com.tsystems.javaschool.internetshop.model;

import javax.persistence.*;

@Entity
@Table(name = "parameter", schema = "internet_shop_db")
public class ParameterEntity {
    private int id;
    private String parametername;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parametername", nullable = true, length = 255)
    public String getParametername() {
        return parametername;
    }

    public void setParametername(String parametername) {
        this.parametername = parametername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParameterEntity that = (ParameterEntity) o;

        if (id != that.id) return false;
        if (parametername != null ? !parametername.equals(that.parametername) : that.parametername != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (parametername != null ? parametername.hashCode() : 0);
        return result;
    }
}
