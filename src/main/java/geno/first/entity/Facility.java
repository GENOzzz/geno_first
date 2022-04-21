package geno.first.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long facility_key;

    private String f_name;//업체명
    
    private String f_tel;//업체전화번호
    
    private String f_address;//업체주소
    
    private String f_operatingTime;//운영시간
    
    private String f_rate;//업체평점

    @ManyToOne
    @JoinColumn(name="user_key")
    private User user;//여러 facility가 하나의 user에 연결됨(업체를 여러개 등록 할 수도 있으니까.)

}
