package FirstWebApp.FirstWebApp.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Notperminant { @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    private String firstName;
    private String secondName;
    private String email;
    private String address;
    private String phoneNumber;

    public Notperminant() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Notperminant(Long id, String firstName, String secondName, String email, String address, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}


