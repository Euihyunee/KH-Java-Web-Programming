package test;

public class PaymentProcessor {
    public void processPayment(double amount) {
        if (validateAmount(amount) && authorizePayment(amount)) {
            deductFunds(amount);
            sendConfirmation();
        }
    }
    private boolean validateAmount(double amount) {
        return amount > 0;
    }
    private boolean authorizePayment(double amount) {
        // 복잡한 인증 로직
        return true;
    }
    private void deductFunds(double amount) {
        // 자금 차감 로직
    }
    private void sendConfirmation() {
        // 확인 메시지 전송 로직
    }
}
