package gr.vbatsalis.diningreviewapi_ca.businesslayer;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class DiningReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name ="name", nullable = false)
    private String name;
    @Column(name ="peanutScore", nullable = true)
    private int peanutScore;
    @Column(name ="eggScore", nullable = true)
    private int eggScore;
    @Column(name ="dairyScore", nullable = true)
    private int dairyScore;
    @Column(name ="comment", nullable = true)
    private String comment;

}
