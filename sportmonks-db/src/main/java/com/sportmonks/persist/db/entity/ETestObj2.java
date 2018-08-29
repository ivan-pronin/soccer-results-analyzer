package com.sportmonks.persist.db.entity;

import javax.persistence.*;

@Entity
@Table(name = "test_obj2")
public class ETestObj2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "container_id", nullable = false)
    private ETestContainer container;

    public ETestObj2() {
    }

    public ETestObj2(String name, ETestContainer container) {
        this.name = name;
        this.container = container;
    }

    public ETestContainer getContainer() {
        return container;
    }
}
