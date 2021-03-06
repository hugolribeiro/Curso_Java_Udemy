package entities;

public class Employee {

    private int id;
    private String name;
    private double income;

    public Employee(int id, String name, double income){
        this.id = id;
        this.name = name;
        this.income = income;
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

    public double getIncome() {
        return income;
    }

    public void increaseIncome(double percentage){
        this.income += this.income * percentage / 100;
    }

}
