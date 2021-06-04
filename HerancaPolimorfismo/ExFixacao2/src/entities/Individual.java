package entities;

public class Individual extends TaxPayer{

    private Double heathExpenses;

    public Individual(String name, Double annualIncome, Double heathExpenses) {
        super(name, annualIncome);
        this.heathExpenses = heathExpenses;
    }

    public Double getHeathExpenses() {
        return heathExpenses;
    }

    public void setHeathExpenses(Double heathExpenses) {
        this.heathExpenses = heathExpenses;
    }

    @Override
    public Double calcTaxes(){
        double tax;
        if (this.getAnnualIncome() < 20000){
            tax = 0.15 * this.getAnnualIncome();
        }
        else {
            tax = 0.25 * this.getAnnualIncome();
        }
        if (this.getHeathExpenses() > 0){
            tax -= 0.5 * this.getHeathExpenses();
        }
        return tax;
    }
}
