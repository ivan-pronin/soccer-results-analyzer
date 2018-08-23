package com.sportmonks.persist.db.entity;

import com.sportmonks.client.core.data.entity.Country;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "country")
public class ECountry implements Serializable {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    public ECountry() {
    }

    public ECountry(Country country) {
        this.id = country.getId();
        this.name = country.getName();
    }
}
