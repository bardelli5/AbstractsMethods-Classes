package entities;

public final class ContribuinteJuridica extends Contribuinte {
    private int numberOfEmployees;

    public ContribuinteJuridica() {
        super();
    }

    public ContribuinteJuridica(String name, Double annualIncome, int numberOfEmployees) {
        this.name = name;
        this.annualIncome = annualIncome;
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double tax = 0.0;
        if (numberOfEmployees > 10){
            tax = annualIncome * 0.14;
        }
        else {
            tax = annualIncome * 0.16;
        }
        return tax;
    }
    
}
