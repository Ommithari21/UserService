package order.project.UserService.figenclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "File-Handling-Service",url = "http://localhost:8084")
public interface FileClient {


    @GetMapping("/Get/role_change/{id}")
    RoleChangeDto getRoleChangeId(@PathVariable int id);

}
