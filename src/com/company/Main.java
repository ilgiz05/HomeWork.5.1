package com.company;

public class Main {

    public static void main(String[] args) {
        Boss slash = new Boss(1250, 56, "magic") {
        };
        System.out.println(" Boss.health " + slash.getBossHealth() + slash.getBossDamage() + slash.getBossDeffence());

    }
}
