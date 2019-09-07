package tasks.task2;

import java.util.Date;
import java.util.LinkedList;

public class Account {
    public LinkedList<Operation> operations;
    private double balance;

    public Account() {
        operations = new LinkedList<Operation>();
    }

    public double getBalance() {
        return balance;
    }

    private boolean getOperationOutcome(OperationType type, double sum) {
        return new Operation(type).perform(this, sum);
    }

    private void updateBalance(OperationType type, double sum) {
        if (type == OperationType.Income) balance += sum;
        else balance -= sum;
    }

    private boolean performOperation(OperationType type, double sum) {
        boolean outcome = getOperationOutcome(type, sum);
        if (outcome) updateBalance(type, sum);
        return outcome;
    }

    public boolean performWithdrawal(double sum) {
        return performOperation(OperationType.Withdrawal, sum);
    }

    public boolean performPayment(double sum) {
        return performOperation(OperationType.Payment, sum);
    }

    public boolean receiveIncome(double sum) {
        return performOperation(OperationType.Income, sum);
    }

    private enum OperationType {
        Withdrawal,
        Payment,
        Income
    }

    private class Operation {
        private Date time;
        private OperationType type;

        Operation(OperationType type) {
            this.time = new Date();
            this.type = type;
        }

        Date getTime() {
            return time;
        }

        boolean perform(Account a, double sum) {
            if (isValid(a, sum)) {
                a.operations.add(this);
                return true;
            }
            return false;
        }

        private boolean isValid(Account a, double sum) {
            if (sum > 0 && a != null) {
                boolean isIncome = type == OperationType.Income;
                if (isIncome) return true;
                return a.getBalance() - sum >= 0;
            }
            return false;
        }
    }
}