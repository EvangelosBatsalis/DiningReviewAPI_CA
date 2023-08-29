package gr.vbatsalis.diningreviewapi_ca.businesslayer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//JPA-Entity annotations
@Entity
@Table(name = "DINING_REVIEW")

//Lombok annotations
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DiningReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diningRev_id", nullable = false)
    private Long id;

    @Column(name = "diningRev_name", nullable = false)
    private String name;

    @Column(name = "peanut_Score", nullable = true)
    private int peanutScore;

    @Column(name = "egg_Score", nullable = true)
    private int eggScore;

    @Column(name = "dairy_Score", nullable = true)
    private int dairyScore;

    @Column(name = "diningRev_comment", nullable = true)
    private String comment;

}
