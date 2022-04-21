package geno.first.dto;

import geno.first.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String address;
    private String email;
    private String auth;

    public User toEntity(){
        return User.builder()
                .id(this.getId())
                .pw(this.getPw())
                .name(this.getName())
                .phone(this.getPhone())
                .address(this.getAddress())
                .email(this.getEmail())
                .auth(this.getAuth())
                .build();

    }
}
