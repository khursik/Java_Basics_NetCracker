package ru.skillbench.tasks.basics.control;

public class ControlFlowStatements1Impl implements ControlFlowStatements1 {
    @Override
    public float getFunctionValue(float x) {
        if (x > 0) {
            return (float) (2 * Math.sin(x));
        }
        return 6 - x;
    }

    @Override
    public String decodeWeekday(int weekday) {
        switch (weekday) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return null;
        }
    }

    @Override
    public int[][] initArray() {
        int[][] array = new int[8][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }
        return array;
    }

    @Override
    public int getMinValue(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    @Override
    public BankDeposit calculateBankDeposit(double P) {
        BankDeposit deposit = new BankDeposit();
        deposit.amount = 1000;
        deposit.years = 0;
        while (deposit.amount < 5000) {
            deposit.amount += (P / 100) * deposit.amount;
            deposit.years += 1;
        }
        return deposit;
    }
}
