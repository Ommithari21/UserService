package order.project.UserService.Controller;


import order.project.UserService.Dto.UserRequestDto;
import order.project.UserService.Entity.User;
import order.project.UserService.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {

    public UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/Login")
    public ResponseEntity<String>login(@RequestBody  UserRequestDto requestDto){
               userService.login(requestDto);
         return ResponseEntity.ok().build();
    }


    @PostMapping("/Register")
    public ResponseEntity<User>register(@RequestBody UserRequestDto requestDto){

        return ResponseEntity.ok(userService.Register(requestDto));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>SignOut(@PathVariable  int id){
        userService.sign_out(id);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @PutMapping("update/{id}")
    public ResponseEntity<User>Update( @PathVariable  int id , @RequestBody User user){

        return ResponseEntity.ok(userService.updateUser(id,user));

    }

    @GetMapping("/view_profile/{id}")
    public ResponseEntity<User>view( @PathVariable  int id){
        return ResponseEntity.ok(userService.view(id));
    }


}
