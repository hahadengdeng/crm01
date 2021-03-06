package crm.entity;

import java.util.List;

public class Customer {
    private int cid;
    private String cusname;
    private String address;
    private String contact;
    private String tel;
    private String email;

    private List<Employees> employees;

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    public Customer() {
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cusname='" + cusname + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", employees=" + employees +
                '}';
    }

    public Customer(int cid) {
        this.cid = cid;
    }

    public Customer(int cid, String cusname, String address) {
        this.cid = cid;
        this.cusname = cusname;
        this.address = address;
    }

    public Customer(String cusname, String address, String contact, String tel, String email) {
        this.cusname = cusname;
        this.address = address;
        this.contact = contact;
        this.tel = tel;
        this.email = email;
    }
}
