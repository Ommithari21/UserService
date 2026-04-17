package order.project.UserService.Repository;

import order.project.UserService.Entity.RoleChange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface uploadRepository extends JpaRepository<RoleChange,Integer> {
    int getUserByRoleId(int RoleId);

    //   Boolean existsByUserId(int userId);

}
