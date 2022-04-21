package geno.first.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long board_key;

    @ManyToOne//여러 board가 하나의 user에 연결
    @JoinColumn(name="user_key")
    private User user;

    private String title;

    private String content;

}
