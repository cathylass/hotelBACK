package co.simplon.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hotel;
    private String description;
    private double Lit;
    private double currentPrice;
    private boolean promotion;
    private boolean selected;
    private boolean available;

    @Transient
    private int quantity=1;
    @ManyToOne
    private Ville ville;


}
