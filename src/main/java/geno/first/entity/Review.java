package geno.first.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Review_key;

    @ManyToOne//여러 review가 하나의 user와 연결
    @JoinColumn(name="user_key")
    private User user;

    @ManyToOne//여러 review가 하나의 facility와 연결
    @JoinColumn(name = "facility_key")
    private Facility facility;

    private String comment;
}
