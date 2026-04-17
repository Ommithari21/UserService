package order.project.UserService.Dto;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

public class RoleResponseDto {

    private String name;

    private String email;

    private String mobileNo;




    private String Description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }


    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
