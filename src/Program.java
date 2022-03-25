import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.ContribuinteFisica;
import entities.ContribuinteJuridica;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> contribuinteList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Tax payer #1 data:");
            System.out.print("Individual or company (i/c)? ");
            char resposta = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double annualIncome = sc.nextDouble();
            if(resposta =='i'){
                System.out.print("Health expenditures: ");
                double healthExpenses = sc.nextDouble();
                contribuinteList.add(new ContribuinteFisica(name, annualIncome, healthExpenses));
            }
            else if(resposta == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                contribuinteList.add(new ContribuinteJuridica(name, annualIncome, numberOfEmployees));
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for(Contribuinte updatedListContribuinte : contribuinteList){
            double tax = updatedListContribuinte.tax();
            System.out.println(updatedListContribuinte);
            sum += tax;
        }

        System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
        
        sc.close();
    }
    
}
