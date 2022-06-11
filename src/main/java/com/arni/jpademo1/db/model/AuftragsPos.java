package com.arni.jpademo1.db.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class AuftragsPos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String auftragsPosition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "auftrag_id")
    private Auftrag auftrag;


}
