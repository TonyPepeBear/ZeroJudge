package com.tonypepe.zerojudge.d.d600;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//not finish

public class D637 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                Duck duck = new Duck();
                duck.addFood(new Food(scanner.nextInt(), scanner.nextInt()));
                System.out.println(duck.getAnswer());
            }
        }
    }

    private static class Duck {
        static final int MAX_WEIGHT = 100;
        List<Food> foods = new ArrayList<>();
        private int maxValue = 0;
        private int maxWeight = 0;

        void addFood(Food food) {
            foods.add(food);
        }

        int getAnswer() {
            // TODO: 2018/10/24 get answer
            return maxValue;
        }
    }

    private static class Food {
        private int weight;
        private int value;

        Food(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        public int getWeight() {
            return weight;
        }

        public int getValue() {
            return value;
        }
    }
}
