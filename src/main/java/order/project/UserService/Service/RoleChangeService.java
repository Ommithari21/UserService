package order.project.UserService.Service;

import order.project.UserService.Dto.RoleResponseDto;
import order.project.UserService.Entity.RoleChange;
import order.project.UserService.Repository.uploadRepository;
import order.project.UserService.figenclient.FileClient;
import order.project.UserService.figenclient.RoleChangeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleChangeService {

    @Autowired
    private uploadRepository uploadRepository;

    @Autowired
    private  FileClient fileClient;

    public RoleResponseDto roleChange(RoleChange RoleChange,int id){
        //RoleChangeDto o= fileClient.getRoleChangeId(id);
       // RoleChange.setRoleId(o.getId());
        uploadRepository.save(RoleChange);

        RoleResponseDto dto=new RoleResponseDto();
        dto.setDescription(RoleChange.getDescription());
        dto.setName(RoleChange.getName());
        dto.setMobileNo(RoleChange.getMobileNo());
        dto.setEmail(RoleChange.getEmail());

        return dto;

    }



}
