package com.arni.jpademo1.db.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Auftrag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String auftragsName;

    public void addAuftragsPosition(AuftragsPos auftragsPos) {
        auftragsPos.setAuftrag(this);
        auftragsPositionen.add(auftragsPos);
    }

    @OneToMany(
            mappedBy = "auftrag",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    Set<AuftragsPos> auftragsPositionen = new HashSet<>();

}
