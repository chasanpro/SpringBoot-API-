package com.chasanpro;

public class Customer {
    private int uid;
   private  String name;
   private String email;
   private  int age;


    public Customer(int uid, String name, String email, int age) {
        this.uid = uid;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public Customer(){


    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;

        if (getUid() != customer.getUid()) return false;
        if (getAge() != customer.getAge()) return false;
        if (getName() != null ? !getName().equals(customer.getName()) : customer.getName() != null) return false;
        return getEmail() != null ? getEmail().equals(customer.getEmail()) : customer.getEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = getUid();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
