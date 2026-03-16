class Bank {

    static double interestRate = 0.05;

    static double calculateInterest(double amount) {
        return amount * interestRate;
    }

    public static void main(String[] args) {
        double interest = calculateInterest(10000);
        System.out.println("Interest: " + interest);
    }
}

