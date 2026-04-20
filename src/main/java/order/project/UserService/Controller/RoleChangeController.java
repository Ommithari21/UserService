package order.project.UserService.Controller;

import order.project.UserService.Dto.RoleResponseDto;
import order.project.UserService.Entity.RoleChange;
import order.project.UserService.Service.RoleChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class RoleChangeController {

    @Autowired
    private RoleChangeService roleChangeService;

    @PostMapping("/rolechange/{id}")
    public ResponseEntity<RoleResponseDto> getRoleChangeRequest(
            @RequestBody RoleChange rc,
            @PathVariable("id") int id) {

        return ResponseEntity.ok(roleChangeService.roleChange(rc, id));
    }
}
