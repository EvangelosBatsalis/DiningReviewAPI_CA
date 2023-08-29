package gr.vbatsalis.diningreviewapi_ca.businesslayer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Lombok annotations
@Data
@NoArgsConstructor
@AllArgsConstructor

//JPA-Entity annotations
@Entity
@Table(name = "RESTAURANT")


public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "peanutIndividualScore", nullable = true)
    private int peanutIndividualScore;
    @Column(name = "peanutTotalScore", nullable = true)
    private int peanutTotalScore;
    @Column(name = "peanutAverageScore", nullable = true)
    private float peanutAverageScore;

    @Column(name = "eggIndividualScore", nullable = true)
    private int eggIndividualScore;
    @Column(name = "eggTotalScore", nullable = true)
    private int eggTotalScore;
    @Column(name = "eggAverageScore", nullable = true)
    private float eggAverageScore;

    @Column(name = "dairyIndividualScore", nullable = true)
    private int dairyIndividualScore;
    @Column(name = "dairyTotalScore", nullable = true)
    private int dairyTotalScore;
    @Column(name = "dairyAverageScore", nullable = true)
    private float dairyAverageScore;

    @Column(name = "totalAverageScore", nullable = true)
    private float totalAverageScore;
}
