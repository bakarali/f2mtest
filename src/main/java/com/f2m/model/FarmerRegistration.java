package com.f2m.model;

/**
 * Created by bakarali on 20/1/17.
 */
public class FarmerRegistration {
    private int id;
    private String name;
    private long phone_no ;
    private String password;
    private String address;
    private String image_id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }
}
