package entities;

public class LegalPerson extends TaxPayer{

    private int amountEmployees;

    public LegalPerson(String name, Double annualIncome, int amountEmployees) {
        super(name, annualIncome);
        this.amountEmployees = amountEmployees;
    }

    public int getAmountEmployees() {
        return amountEmployees;
    }

    public void setAmountEmployees(int amountEmployees) {
        this.amountEmployees = amountEmployees;
    }

    @Override
    public Double calcTaxes(){
        double tax;
        if (this.amountEmployees > 10){
            tax = 0.14 * this.getAnnualIncome();
        }
        else {
            tax = 0.16 * this.getAmountEmployees();
        }
        return tax;
    }
}
