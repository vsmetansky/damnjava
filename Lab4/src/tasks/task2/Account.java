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

    private boolean perform(OperationType type, double sum) {
        Operation o = new Operation(type);
        boolean outcome = o.performOperation(this, sum);
        return outcome;
    }
    public boolean performWithdrawal(double sum) {
        boolean outcome = perform(OperationType.Withdrawal, sum);
        if (outcome) balance -= sum;
        return outcome;
    }

    public boolean performPayment(double sum) {
        boolean outcome = perform(OperationType.Payment, sum);
        if (outcome) balance -= sum;
        return outcome;
    }

    public boolean receiveIncome(double sum) {
        boolean outcome = perform(OperationType.Income, sum);
        if (outcome) balance += sum;
        return outcome;
    }

    enum OperationType {
        Withdrawal,
        Payment,
        Income
    }

    class Operation {
        protected Date time;
        protected OperationType type;

        Operation(OperationType type) {
            this.time = new Date();
            this.type = type;
        }

        public Date getTime() {
            return time;
        }

        boolean performOperation(Account a, double sum) {
            if (isValid(a, sum)) {
                a.operations.add(this);
                return true;
            }
            return false;
        }


        private boolean isValid(Account a, double sum) {
            if (sum > 0 && a != null) {
                boolean isIncome = true ? type == OperationType.Income : false;
                if (!isIncome) return true;
                return a.getBalance() - sum > 0;
            }
            return false;
        }
    }
}