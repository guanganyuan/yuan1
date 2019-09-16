package main.java.com.tvb.pojo;

public class Stu {
    private int id;
    private String name;
    private int age;
    private String address;
    private double height;

    public Stu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
