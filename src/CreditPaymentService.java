public class CreditPaymentService {
    public double calculate(int credit, double rate, int months) {

        double monthlyRate = rate / (100 * 12);
        double payment = credit * (monthlyRate / (1 - Math.pow((1 + monthlyRate), -months)));
        return payment;
    }
}
