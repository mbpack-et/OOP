package problem1;

import java.util.Scanner;

class Data {
    private double sum = 0;
    private int count = 0;
    private double max = Double.NEGATIVE_INFINITY;

    public void add(double value) {
        sum += value;
        count++;
        if (value > max) {
            max = value;
        }
    }

    public double getAverage() {
        if (count == 0) return 0;
        return sum / count;
    }

    public double getMax() {
        if (count == 0) return 0;
        return max;
    }
}

class Analyzer {
    private Data data = new Data();

    public void readInput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                data.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or Q.");
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMax());
    }
}

public class Main {
    public static void main(String[] args) {
        Analyzer analyzer = new Analyzer();
        analyzer.readInput();
    }
}
