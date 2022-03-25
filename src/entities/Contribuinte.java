package entities;

public abstract class Contribuinte {
    protected String name;
    protected Double annualIncome;

    public Contribuinte() {
    }

    public Contribuinte(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return this.annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract double tax();

    @Override
    public String toString() {
        return name + ": $ " + String.format("%.2f", tax());
    }
}
