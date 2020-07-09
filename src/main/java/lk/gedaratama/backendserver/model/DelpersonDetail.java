package lk.gedaratama.backendserver.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
/**
 * @author kavindya Sewwandi on 7/1/2020.
 */
@Entity
@Table (name = "DeliveryPerson")
public class DelpersonDetail {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    @NotNull
    private String username;
    @Column
    @NotNull
    private String firstname;

    @Column
    @NotNull
    private String contact;

    @Column
    private String uuid;
    @Column
    @JsonIgnore
    private String role;
    @Column
    @NotNull
    private String email;
    // @Column(nullable=false, updatable=false)
    //@Temporal(TemporalType.TIMESTAMP)
    //@LastModifiedDate
    //private Date joindate;




    public DelpersonDetail(DelpersonDetail user) {
        this.setUsername(user.getUsername());
        this.setFirstname(user.getFirstname());

        this.setContact(user.getContact());
        this.setEmail(user.getEmail());
        this.setRole(user.getRole());

        this.setUuid(user.getUuid());
        //this.setJoinDate(user.getJoinDate());
    }

    public DelpersonDetail() {

    }



    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getContact() { return contact;}

    public void setContact(String contact) { this.contact=contact;}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
