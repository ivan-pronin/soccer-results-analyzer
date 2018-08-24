package com.sportmonks.persist.db.entity;

import com.sportmonks.client.core.data.entity.Team;

import javax.persistence.*;

@Entity
@Table(name = "team")
public class ETeam {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String shortCode;

    @Column
    private String twitter;

    @Column
    private Boolean nationalTeam;

    @Column
    private Integer founded;

    @Column
    private String logoPath;

    @OneToOne
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID")
    private ECountry country;

    @OneToOne
    @JoinColumn(name = "VENUE_ID", referencedColumnName = "ID")
    private EVenue venue;

    public ETeam() {
    }

    public ETeam(Team team, ECountry country, EVenue venue) {
        this.id = team.getId();
        this.name = team.getName();
        this.shortCode = team.getShortCode();
        this.twitter = team.getTwitter();
        this.nationalTeam = team.getNationalTeam();
        this.founded = team.getFounded();
        this.logoPath = team.getLogoPath();
        this.country = country;
        this.venue = venue;
    }
}
