package order.project.UserService.Service;

import order.project.UserService.Dto.UserRequestDto;
import order.project.UserService.Entity.User;
import order.project.UserService.Enum.Roles;
import order.project.UserService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public String login(UserRequestDto login){
        return " login sucesfully ";

    }


    public User  Register(UserRequestDto user){
        User us= new User() ;
    us.setEmail(user.getEmail());
    us.setPassword(user.getPassword());
    us.setRoles(List.of(Roles.Customer));
      User u=  userRepository.save(us);
        return u;

    }



    public void sign_out(int id){
        userRepository.deleteById(id);
    }


    public User updateUser(int id,User user){
        User us=userRepository.findById(id).orElseThrow(()->new RuntimeException(" user not found "));
        us.setFirstName(user.getFirstName());
        us.setLastName(user.getLastName());
        us.setAddress(user.getAddress());
        us.setPhone_no(user.getPhone_no());
        return us;
    }


    public User view(int id) {
        return userRepository.findById(id).orElseThrow(()->new RuntimeException("error"));

    }
}
