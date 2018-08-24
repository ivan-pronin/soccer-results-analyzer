package com.sportmonks.persist.db.entity;

import com.sportmonks.client.core.data.entity.Venue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "venue")
public class EVenue {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String surface;

    @Column
    private String address;

    @Column
    private String city;

    @Column
    private Integer capacity;

    @Column
    private String imagePath;

    public EVenue() {
    }

    public EVenue(Venue venue) {
        this.id = venue.getId();
        this.name = venue.getName();
        this.surface = venue.getSurface();
        this.address = venue.getAddress();
        this.city = venue.getCity();
        this.capacity = venue.getCapacity();
        this.imagePath = venue.getImagePath();
    }
}
