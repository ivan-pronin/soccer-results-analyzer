package com.sportmonks.persist.db.entity;

import javax.persistence.*;

@Entity
@Table(name = "test_obj")
public class ETestObj {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "container_id", nullable = false)
    private ETestContainer container;

    public ETestObj() {
    }

    public ETestObj(String name, ETestContainer container) {
        this.name = name;
        this.container = container;
    }

    public ETestContainer getContainer() {
        return container;
    }
}
