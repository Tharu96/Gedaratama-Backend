package lk.gedaratama.backendserver.resource;

public class DeliveryResource {
    private String email;
    private String username;
    private String firstname;
    private String contact;
    private String uuid;
    private String role;
    private String password;



    public DeliveryResource() {
    }

    public DeliveryResource(DeliveryResource user) {
        this.setUsername(user.getUsername());
        this.setFirstname(user.getFirstname());
        this.setContact(user.getContact());
        this.setEmail(user.getEmail());
        this.setRole(user.getRole());

        this.setUuid(user.getUuid());
        this.setPassword(user.getPassword());
        // this.setActive(user.isActive());
    }


    public String getFirstname() { return firstname;
    }

    public void setFirstname(String firstname ) { this.firstname= firstname;
    }

    public String getContact() { return contact;
    }

    public void setContact(String contact) {this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   /* public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }*/


}
