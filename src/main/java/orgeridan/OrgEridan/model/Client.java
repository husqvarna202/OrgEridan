package orgeridan.OrgEridan.model;

import javax.persistence.*;

@Entity
@Table(name = "clients", schema = "mydb")
public class Client {

    @Id
    @Column(name = "id_client")
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_client;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;


    public int getId() {
        return id_client;
    }
    public void setId(int id) {
        this.id_client = id_client;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }





}
