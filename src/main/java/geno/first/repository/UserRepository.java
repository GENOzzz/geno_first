package geno.first.repository;


import geno.first.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    //id로 회원을 찾아 가져옴
    User getById(String id);
}
