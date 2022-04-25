package geno.first.service;

import geno.first.entity.User;
import geno.first.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.net.http.HttpRequest;

@Slf4j
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public int checkID(String id){
        if(id.length()<2){
            return 0;
        }
        User oldUser=userRepository.getById(id);
        if(oldUser!=null){
            return 2;
        }
        return 1;
    }
}
