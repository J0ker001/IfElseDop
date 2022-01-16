package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        int age = 24;
        int salary = 58_000;
        int ratioAge1 = 2 * salary;
        int ratioAge2 = 3 * salary;
        double ratioSalary1 = 1.2;
        double ratioSalary2 = 1.5;


        if (age >= 23 && salary >= 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ratioAge2 * ratioSalary1 + " рублей");
        }
        if (age >= 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ratioAge2 * ratioSalary2 + " рублей");
        }
        if (age < 23 && salary >= 50_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ratioAge1 * ratioSalary1 + " рублей");
        }
        if (age < 23 && salary >= 80_000) {
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + ratioAge1 * ratioSalary1 + " рублей");
        }
        System.out.println();
        System.out.println();
    }

    public static void task2() {

        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;                   //желаемая сумма кредита
        double baseRate = 0.1;                    //Базовая ставка для клиента — 10% годовых
        int loanTerm = 12;                       //Срок кредитования — 12 месяцев
        double maxMonthlyPayment = salary * 0.5; //Максимальный ежемесячный платеж — 50% от ЗП
        double additionallyRate1 = 0.01;        // доп ставка 1%
        double additionallyRate2 = 0.005;        // доп ставка 0.5%
        double additionallyRate3 = 0.007;        // доп ставка 0.7%

        if (age < 23 && salary < 80_000) {
            double a = (double) wantedSum / loanTerm + (baseRate + additionallyRate1) / loanTerm;
            if (a < maxMonthlyPayment) {
                System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment +
                        " рублей. Платеж по кредиту " + a + " рублей. Одобрено");
            } else System.out.println("отказано");
        }
        if (age < 23 && salary > 80_000) {
            double b = (double) wantedSum / loanTerm + (baseRate + additionallyRate1 - additionallyRate3) / loanTerm;
            if (b < maxMonthlyPayment) {
                System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment +
                        " рублей. Платеж по кредиту " + b + " рублей. Одобрено");
            } else System.out.println("отказано");
        }
        if (age < 30 && salary < 80_000) {
            if (age >= 23) {
                double c = (double) wantedSum / loanTerm + (baseRate + additionallyRate2) / loanTerm;
                if (c < maxMonthlyPayment) {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment +
                            " рублей. Платеж по кредиту " + c + " рублей. Одобрено");
                } else System.out.println("отказано");
            }
        }
        if (age < 30 && salary > 80_000) {
            if (age >= 23) {
                double d = (double) wantedSum / loanTerm + (baseRate + additionallyRate2 - additionallyRate3) / loanTerm;
                if (d < maxMonthlyPayment) {
                    System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment +
                            " рублей. Платеж по кредиту " + d + " рублей. Одобрено");
                } else System.out.println("отказано");
            }
        }
    }
}
