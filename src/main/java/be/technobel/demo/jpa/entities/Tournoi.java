package be.technobel.ylorth.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "tournoi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tournoi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private long id;
    @Column(name = "nom", length = 100, nullable = false)
    private String nom;

    @Column(name = "code", length = 2, nullable = false)
    private String code;

    @OneToMany(mappedBy = "tournoi")
    private Set<Epreuve> epreuves = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(
            name = "inscription",
            joinColumns = @JoinColumn(name = "tournoi_id"),
            inverseJoinColumns = @JoinColumn(name = "joueur_id")
    )
    private Set<Joueur> inscrits = new LinkedHashSet<>();

}
