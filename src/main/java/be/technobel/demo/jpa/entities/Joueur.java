package be.technobel.ylorth.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;


@Entity
@Table(name = "joueur")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Joueur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private long id;
    @Column(name = "nom", length = 50, nullable = false)
    private String nom;
    @Column(name = "prenom", length = 50, nullable = false)
    private String prenom;
    @Column(name = "sexe", nullable = false)
    private char sexe;
    @OneToMany(mappedBy = "vainqueur")
    private Set<Match> matchVainqueur = new LinkedHashSet<>();
    @OneToMany(mappedBy = "finaliste")
    private Set<Match> matchFinaliste = new LinkedHashSet<>();

    @ManyToMany(mappedBy = "inscrits")
    private Set<Tournoi> tournois = new LinkedHashSet<>();

}
