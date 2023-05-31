package designPattern.structuralPattern.filter;

public class Customer {
    private final Name name;
    private String status;
    private String gender;

    public Customer(String firstName,String lastName, String status, String gender) {
        name=new Name(firstName,lastName);
        this.status = status;
        this.gender =gender;
    }

    public Name getName() {
        return name;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender =gender;
    }
}
