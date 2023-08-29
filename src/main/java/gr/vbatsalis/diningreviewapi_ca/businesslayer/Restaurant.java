package gr.vbatsalis.diningreviewapi_ca.businesslayer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//JPA-Entity annotations
@Entity
@Table(name = "RESTAURANT")

//Lombok annotations
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id", nullable = false)
    private Long id;

    @Column(name = "peanut_Individual_Score", nullable = true)
    private int peanutIndividualScore;
    @Column(name = "peanut_Total_Score", nullable = true)
    private int peanutTotalScore;
    @Column(name = "peanut_Average_Score", nullable = true)
    private float peanutAverageScore;

    @Column(name = "egg_Individual_Score", nullable = true)
    private int eggIndividualScore;
    @Column(name = "egg_Total_Score", nullable = true)
    private int eggTotalScore;
    @Column(name = "egg_Average_Score", nullable = true)
    private float eggAverageScore;

    @Column(name = "dairy_Individual_Score", nullable = true)
    private int dairyIndividualScore;
    @Column(name = "dairy_Total_Score", nullable = true)
    private int dairyTotalScore;
    @Column(name = "dairy_Average_Score", nullable = true)
    private float dairyAverageScore;

    @Column(name = "total_Average_Score", nullable = true)
    private float totalAverageScore;
}
//Lombok annotations
