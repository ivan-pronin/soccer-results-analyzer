package com.sportmonks.persist.db.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "test_container")
@NamedEntityGraph(name = "ETestContainer.testObjs",
        attributeNodes = {@NamedAttributeNode("testObjs"), @NamedAttributeNode("testObjs2")})
public class ETestContainer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "container")
    private Set<ETestObj> testObjs ;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "container")
    private Set<ETestObj2> testObjs2;

    public ETestContainer() {
    }

    public ETestContainer(String name) {
        this.name = name;
    }

    public Set<ETestObj> getTestObjs() {
        return testObjs;
    }

    public void setTestObjs(Set<ETestObj> testObjs) {
        this.testObjs = testObjs;
    }

    public Set<ETestObj2> getTestObjs2() {
        return testObjs2;
    }

    public void setTestObjs2(Set<ETestObj2> testObjs2) {
        this.testObjs2 = testObjs2;
    }
}
