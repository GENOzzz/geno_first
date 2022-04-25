package geno.first.dto;

import geno.first.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @NotBlank(message="아이디에 공백은 포함할 수 없습니다.")
    @Size(min=2,max=6,message = "아이디는 2~16자리만 입력 가능합니다.")
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
