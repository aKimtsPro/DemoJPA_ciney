package be.technobel.ylorth.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "score_vainqueur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private long id;
    @OneToOne(mappedBy = "score")
    private Match match;
    @Column(name = "Set_1")
    private Integer set1;
    @Column(name = "Set_2")
    private Integer set2;
    @Column(name = "Set_3")
    private Integer set3;
    @Column(name = "Set_4")
    private Integer set4;
    @Column(name = "Set_5")
    private Integer set5;


}
