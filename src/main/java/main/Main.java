package main;

import abstractfactory.GUIFactory;
import abstractfactory.MacOSFactory;
import abstractfactory.WindowsFactory;
import application.DeliveryApplication;
import factorymethod.Logistics;
import factorymethod.RoadLogistics;
import factorymethod.SeaLogistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose delivery type:");
        System.out.println("1. Road");
        System.out.println("2. Sea");
        System.out.print("Enter choice: ");

        int deliveryChoice = scanner.nextInt();

        Logistics logistics;

        if (deliveryChoice == 1) {
            logistics = new RoadLogistics();
        } else if (deliveryChoice == 2) {
            logistics = new SeaLogistics();
        } else {
            System.out.println("Invalid delivery type.");
            return;
        }

        System.out.println();
        System.out.println("Choose platform:");
        System.out.println("1. Windows");
        System.out.println("2. MacOS");
        System.out.print("Enter choice: ");

        int platformChoice = scanner.nextInt();

        GUIFactory guiFactory;

        if (platformChoice == 1) {
            guiFactory = new WindowsFactory();
        } else if (platformChoice == 2) {
            guiFactory = new MacOSFactory();
        } else {
            System.out.println("Invalid platform.");
            return;
        }

        DeliveryApplication application =
                new DeliveryApplication(guiFactory, logistics);

        System.out.println();
        application.run();

        scanner.close();
    }
}