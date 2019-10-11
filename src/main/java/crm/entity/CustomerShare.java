package crm.entity;

public class CustomerShare {
    private int id;
    private Customer customer;
    private Employees employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "CustomerShare{" +
                "id=" + id +
                ", customer=" + customer +
                ", employees=" + employees +
                '}';
    }

    public CustomerShare() {
    }

    public CustomerShare(Customer customer, Employees employees) {
        this.customer = customer;
        this.employees = employees;
    }

    public CustomerShare(int id, Customer customer, Employees employees) {
        this.id = id;
        this.customer = customer;
        this.employees = employees;
    }
}
