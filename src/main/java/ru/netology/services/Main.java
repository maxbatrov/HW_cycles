package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        int month = service.calculate(10_000, 3000, 15_000);
        System.out.println(month);
    }
}