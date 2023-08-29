package gr.vbatsalis.diningreviewapi_ca.businesslayer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//JPA-Entity annotations
@Entity
@Table(name = "USER")

//Lombok annotations
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long user_id;

    @Column (name = "user_name", nullable = false)
    private String name;

    @Column (name = "user_city", nullable = false)
    private String city;

    @Column (name = "user_state", nullable = false)
    private String state;

    @Column (name = "user_zipCode", nullable = false)
    private int zipCode;

    @Column(name = "interested_in_peanut_allergy", nullable = true)
    private String interestedInPeanutAllergy;

    @Column(name = "interested_in_egg_allergy", nullable = true)
    private String interestedInEggAllergy;

    @Column(name = "interested_in_dairy_allergy", nullable = true)
    private String interestedInDairyAllergy;



}
