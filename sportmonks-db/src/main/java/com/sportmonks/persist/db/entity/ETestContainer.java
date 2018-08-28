package com.sportmonks.persist.db.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "test_container")
public class ETestContainer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "container")
    private List<ETestObj> testObjs = new ArrayList<>();

    public ETestContainer() {
    }

    public ETestContainer(String name) {
        this.name = name;
    }

    public List<ETestObj> getTestObjs() {
        return testObjs;
    }

    public void setTestObjs(List<ETestObj> testObjs) {
        this.testObjs = testObjs;
    }
}
