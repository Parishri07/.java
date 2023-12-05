package Dynamic_Programming;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    public int weight, profit;

    public Item(int weight, int profit) {
        this.weight = weight;
        this.profit = profit;
    }
}

public class GreedyKnapsack {

    public static double knapsack(int capacity, Item[] items) {
        // Sort items by pi/wi in decreasing order
        Arrays.sort(items, Comparator.comparingDouble(item -> (double) item.profit / item.weight).reversed());

        int n = items.length;
        int currentWeight = capacity;
        double totalProfit = 0.0;

        for (int i = 0; i < n; i++) {
            if (currentWeight > 0 && items[i].weight <= currentWeight) {
                currentWeight -= items[i].weight;
                totalProfit += items[i].profit;
            } else {
                break;
            }
        }

        if (currentWeight > 0) {
            totalProfit += (double) items[n - 1].profit * (currentWeight / (double) items[n - 1].weight);
        }

        return totalProfit;
    }

    public static void main(String[] args) {
        int capacity = 50;
        Item[] items = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };

        double maxProfit = knapsack(capacity, items);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
