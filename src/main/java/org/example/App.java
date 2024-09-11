package org.example;

import java.util.List;

public class App {

    public static void main(String[] args) {
        TruckService truckService = new TruckService();

        Truck jithin = new Truck("Jithin Travels", "2022", 100, "jithin");
        Truck kumar = new Truck("Kumar Travels", "2023", 90, "Kumar");
        Truck vasanth = new Truck("Vasanth Travels", "2024", 80, "Vasanth");
        Truck saiteja = new Truck("Sai Travels", "2025", 70, "Sai Teja");

        boolean running = true;
        int operation = 1; // Simulate the flow with operation value

        while (running) {
            switch (operation) {
                case 1:
                    // Add trucks
                    System.out.println("Adding trucks to the database...");
                    truckService.addTruck(jithin);
                    truckService.addTruck(kumar);
                    truckService.addTruck(vasanth);
                    truckService.addTruck(saiteja);
                    System.out.println("Trucks added:");
                    System.out.println(jithin);
                    System.out.println(kumar);
                    System.out.println(vasanth);
                    System.out.println(saiteja);

                    operation = 2; // Move to next case
                    break;

                case 2:
                    // Fetch a truck by ID
                    System.out.println("\nFetching truck by ID: 1");
                    Truck fetchedTruck = truckService.getTruckById(1);
                    System.out.println("Truck data: " + fetchedTruck);

                    operation = 3; // Move to next case
                    break;

                case 3:
                    // Update truck data
                    System.out.println("\nUpdating truck data for ID: 1");
                    Truck updateTruck = truckService.getTruckById(1);
                    if (updateTruck != null) {
                        updateTruck.setDriverName("Ramesh");
                        truckService.updateTruck(updateTruck);
                        System.out.println("Updated truck data: " + truckService.getTruckById(1));
                    }

                    operation = 4; // Move to next case
                    break;

                case 4:
                    // Get all trucks
                    System.out.println("\nFetching all trucks from the database...");
                    List<Truck> allTrucks = truckService.getAllTrucks();
                    System.out.println("All trucks in the database:");
                    for (Truck truck : allTrucks) {
                        System.out.println(truck);
                    }

                    operation = 5; // Move to next case
                    break;

                case 5:
                    // Delete truck by ID
//                    System.out.println("\nDeleting truck with ID: 2");
//                    truckService.deleteTruck(2);
//                    System.out.println("Truck deleted.");

                    operation = 6; // Move to next case
                    break;

                case 6:
                    // Fetch all trucks after deletion
                    System.out.println("\nFetching all trucks after deletion...");
                    allTrucks = truckService.getAllTrucks();
                    System.out.println("All trucks after all operations:");
                    for (Truck truck : allTrucks) {
                        System.out.println(truck);
                    }

                    running = false; // Exit the loop after all operations
                    break;

                default:
                    System.out.println("Invalid operation.");
                    running = false;
                    break;
            }
        }
    }
}
