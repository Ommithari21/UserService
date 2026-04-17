package order.project.UserService.Entity;

import jakarta.persistence.*;
//import jakarta.validation.constraints.Max;
//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class RoleChange
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int roleId;


    private String name;


    private String email;


    private String mobileNo;


    private int fileId;

//
//    @Max(value = 200)
//    @Min(value = 50)
private String description;

    @ManyToOne
    @JoinColumn(name = "user_id_fk")
    private User userid;

//    @NotNull
//    private String identity;

//    @NotNull
//    private String Licence;


    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

//    public String getDocuments() {
//        return Documents;
//    }
//
//    public void setDocuments(String documents) {
//        Documents = documents;
//    }

//    public String getIdentity() {
//        return identity;
//    }
//
//    public void setIdentity(String identity) {
//        this.identity = identity;
//    }
//
//    public String getLicence() {
//        return Licence;
//    }
//
//    public void setLicence(String licence) {
//        Licence = licence;
//    }
}
