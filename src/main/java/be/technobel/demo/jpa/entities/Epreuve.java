package be.technobel.ylorth.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "epreuve")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Epreuve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private long id;
    @Column(name = "annee", nullable = false)
    private int annee;
    @Column(name = "typeEpreuve", nullable = false)
    private char type;
    @ManyToOne
    @JoinColumn(name = "tounoi_id")
    private Tournoi tournoi;

    @OneToMany(mappedBy = "epreuve")
    private Set<Match>matchs = new LinkedHashSet<>();

}
