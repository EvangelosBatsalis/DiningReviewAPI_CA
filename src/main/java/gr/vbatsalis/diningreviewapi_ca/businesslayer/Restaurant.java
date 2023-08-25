package gr.vbatsalis.diningreviewapi_ca.businesslayer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

//Lombok annotations
@Data
@NoArgsConstructor
@AllArgsConstructor

//JPA-Entity annotations
@Entity
@Table(name="RESTAURANT")


public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private Long id;
    


}
