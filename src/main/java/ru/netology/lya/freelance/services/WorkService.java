package ru.netology.lya.freelance.services;

public class WorkService {
    public int calcService(int income, int expences, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expences) / 3;
            } else {
                money = money + income - expences;
            }
        }
        return count;
    }
}
