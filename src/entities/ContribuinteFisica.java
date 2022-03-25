package entities;

public final class ContribuinteFisica extends Contribuinte {
    private Double healthExpenses;

    public ContribuinteFisica() {
        super();
    }

    public ContribuinteFisica(String name, Double annualIncome, Double healthExpenses) {
        this.name = name;
        this.annualIncome = annualIncome;
        this.healthExpenses = healthExpenses;
    }

    public double getHealthExpenses() {
        return this.healthExpenses;
    }

    public void setHealthExpenses(double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double tax() {
        double tax = 0.0;
        if (annualIncome < 20000.00 && healthExpenses < 0){
            tax = annualIncome * 0.15;
        }
        else if (annualIncome > 20000.00 && healthExpenses < 0){
            tax = annualIncome * 0.25;
        }
        else if (annualIncome < 20000.00 && healthExpenses > 0){
            tax = ((annualIncome * 0.15) - (healthExpenses * 0.50));
        }
        else if (annualIncome > 20000.00 && healthExpenses > 0){
            tax = ((annualIncome * 0.25) - (healthExpenses * 0.50));
        }
        return tax;
    }
}
