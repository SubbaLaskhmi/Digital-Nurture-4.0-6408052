package FinancialForecasting;

public class ForecastCalculator {

	public double forecastValue(double initialValue, double growthRate, int years) {
	       if (years == 0) return initialValue;
	       return forecastValue(initialValue * (1 + growthRate), growthRate, years - 1);
	}
	public double forecastValueDP(double initialValue, double growthRate, int years) {
	    double result = initialValue;
	    for (int i = 0; i < years; i++){
	         result *= (1 + growthRate);
	    }
	    return result;
	}
	public static void main(String[] args) {
	    ForecastCalculator calculator = new ForecastCalculator();
	    double initialValue = 10000; 
	    double growthRate = 0.10;    
	    int years = 5;
	    double recursiveResult = calculator.forecastValue(initialValue, growthRate, years);
	    double dpResult = calculator.forecastValueDP(initialValue, growthRate, years);
	    System.out.printf("Forecast using Recursion (%.2f%% for %d years): ₹%.2f\n", growthRate * 100, years, recursiveResult);
	    System.out.printf("Forecast using Iteration  (%.2f%% for %d years): ₹%.2f\n", growthRate * 100, years, dpResult);
	}
}
