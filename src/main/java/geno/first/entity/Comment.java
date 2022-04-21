package geno.first.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long comment_key;

    @ManyToOne//여러 comment가 하나의 user에 연결
    @JoinColumn(name="user_key")
    private User user;

    @ManyToOne//여러 댓글이 하나의 board에 연결
    @JoinColumn(name="board_key")
    private Board board;

    private String content;
}
