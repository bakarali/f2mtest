package com.f2m.model;

/**
 * Created by bakarali on 17/1/17.
 */
public class TraderRegistration {
    private int id;
    private String name;
    private String email;
    private String password;
    private long phone_no ;
    private String address;
    private String image_id;

    public TraderRegistration(){
    }

    public void setId(int id) { this.id = id;}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    private String company;

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public String getCompany() {
        return company;
    }

    public String getImage_id() {
        return image_id;
    }
}
