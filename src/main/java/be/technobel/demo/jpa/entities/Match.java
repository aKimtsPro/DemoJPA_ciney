package be.technobel.ylorth.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "match_tennis")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private long id;
    @ManyToOne
    @JoinColumn(name = "Vainqueur_Id", nullable = false)
    private Joueur vainqueur;
    @ManyToOne
    @JoinColumn(name = "Finaliste_Id", nullable = false)
    private Joueur finaliste;
    @ManyToOne
    @JoinColumn(name = "EPREUVE_ID")
    private Epreuve epreuve;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "score_id", nullable = false)
    private Score score;


}
