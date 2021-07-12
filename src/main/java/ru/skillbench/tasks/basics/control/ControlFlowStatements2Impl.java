package ru.skillbench.tasks.basics.control;

public class ControlFlowStatements2Impl implements ControlFlowStatements2 {

    @Override
    public int getFunctionValue(int x) {
        if ((x < -2) || (x > 2)) {
            return 2 * x;
        }
        return -3 * x;
    }

    @Override
    public String decodeMark(int mark) {
        switch (mark) {
            case 1:
                return "Fail";
            case 2:
                return "Poor";
            case 3:
                return "Satisfactory";
            case 4:
                return "Good";
            case 5:
                return "Excellent";
            default:
                return "Error";
        }
    }

    @Override
    public double[][] initArray() {
        double[][] array = new double[5][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = Math.pow(i, 4) - Math.sqrt(j);
            }
        }
        return array;
    }

    @Override
    public double getMaxValue(double[][] array) {
        double maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }

    @Override
    public Sportsman calculateSportsman(float P) {
        Sportsman sportsman = new Sportsman();
        float totalDistance = 10;
        sportsman.addDay(10);

        while (sportsman.getTotalDistance() <= 200) {
            totalDistance += (P / 100) * totalDistance;
            sportsman.addDay(totalDistance);
        }
        return sportsman;
    }
}
