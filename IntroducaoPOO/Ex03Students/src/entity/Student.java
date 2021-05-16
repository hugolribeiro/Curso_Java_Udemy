package entity;

public class Student {
    private String name;
    private double firstGrade;
    private double secondGrade;
    private double thirdGrade;

    public double finalGrade(){
        return this.firstGrade + this.secondGrade + this.thirdGrade;
    }

    public double missingPoints(){
        if (finalGrade() < 60.0){
            return 60.0 - finalGrade();
        }
        else {
            return 0.00;
        }
    }

    public double getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(double firstGrade) {
        this.firstGrade = firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public double getThirdGrade() {
        return thirdGrade;
    }

    public void setThirdGrade(double thirdGrade) {
        this.thirdGrade = thirdGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
