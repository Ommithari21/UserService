package order.project.UserService.Entity;

import jakarta.persistence.*;
import order.project.UserService.Enum.Roles;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;


    private String FirstName;


    private String LastName;


    private String phone_no;


    private String Email;

    private String password;


    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Roles> roles;


    private String Address;


    private LocalDateTime CreatedAT;

    private String city;

    private String pinCode;









    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhone_no() {
        return phone_no;
    }


    @PrePersist
    protected void onCreate() {
        this.CreatedAT = LocalDateTime.now();
    }
    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public LocalDateTime getCreatedAT() {
        return CreatedAT;
    }

    public void setCreatedAT(LocalDateTime createdAT) {
        CreatedAT = createdAT;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
