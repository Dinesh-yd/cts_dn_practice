package financialforecasting;

public class FinancialForecast {

    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        // Base Case
        if(years == 0) {
            return currentValue;
        }
        // Recursive Case
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 5;
        double futureValue = predictFutureValue(currentValue, growthRate, years);
        System.out.println("Predicted Future Value = ₹"+ futureValue);
    }
}
/*
OUTPUT:-
Predicted Future Value = ₹16105.100000000008
Time Complexity: O(n) as the function performs one recursive call for each year.

Space Complexity: O(n) as the recursion stack stores one call for each year until the base case is reached.
 */