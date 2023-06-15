package model;

public class Client {
    private String name;
    private String lastName;
    private int age;
    private String mail;
    private String cellPhone;
    
    Client next;

    public Client(String name, String lastName, int age, String mail, String cellPhone) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.mail = mail;
        this.cellPhone = cellPhone;
        next = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public Client getNext() {
        return next;
    }

    public void setNext(Client next) {
        this.next = next;
    }
}
