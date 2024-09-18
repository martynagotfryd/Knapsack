import java.io.*;
import java.util.*;

public class Knapsack {

    static int capacity;
    static List<Item> items = new ArrayList<>();

    static class Item {
        int weight;
        int value;

        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    static void readInputFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("5.txt"));
        capacity = Integer.parseInt(reader.readLine());

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            int weight = Integer.parseInt(parts[0]);
            int value = Integer.parseInt(parts[1]);
            items.add(new Item(weight, value));
        }

        reader.close();
    }

    public static int[] convertToBinary(int x, int n) {
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            res[i] = x % 2;
            x /= 2;
        }
        return res;
    }
    public static void main(String[] args) throws IOException {

        readInputFile();

        int n = items.size();
        int totalWeight = 0;
        int totalValue = 0;
        int[] finalVector = new int[n];


        for (int i = 0; i < (1 << n); i++) {
            int[] vector = convertToBinary(i, n);

            int totalWeight0 = 0;
            int totalValue0 = 0;

            for (int j = 0; j < n; j++) {
                if (vector[j] == 1) {
                    totalWeight0 += items.get(j).weight;
                    totalValue0 += items.get(j).value;
                }
                if (totalWeight0 > capacity) {
                    break;
                }
            }

            if (totalWeight0 <= capacity && totalValue0 > totalValue) {
                System.arraycopy(vector, 0, finalVector, 0, n);
                totalValue = totalValue0;
                totalWeight = totalWeight0;
            }
        }
        System.out.println("Best characteristic vector: " + Arrays.toString(finalVector));
        System.out.println("Total weight: " + totalWeight);
        System.out.println("Total value: " + totalValue);
    }
}
