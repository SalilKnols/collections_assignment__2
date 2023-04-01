package question3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap that maps stock symbols to their current prices
        HashMap<String, Double> stockMap = new HashMap<>();
        stockMap.put("AAPL", 148.36);
        stockMap.put("GOOG", 2215.54);
        stockMap.put("MSFT", 236.48);
        stockMap.put("AMZN", 3062.85);

        String highestStockSymbol = null;
        double highestStockPrice = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : stockMap.entrySet()) {
            if (entry.getValue() > highestStockPrice) {
                highestStockSymbol = entry.getKey();
                highestStockPrice = entry.getValue();
            }
        }
        System.out.println("The stock with the highest price is " + highestStockSymbol);
    }
}
