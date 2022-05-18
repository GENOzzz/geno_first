package geno.first.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_key;//회원키

    private String id;
    private String pw;
    private String name;
    private String phone;
    private String address;
    private String email;
    private String auth;//권한(member,ceo,admin)

    @Override
    public String toString(){
        return "key : "+this.getUser_key()+"id : "+this.getId();
    }
}
