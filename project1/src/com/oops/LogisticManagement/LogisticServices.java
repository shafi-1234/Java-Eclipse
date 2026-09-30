package com.oops.LogisticManagement;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LogisticServices implements LogisticOperationInterface {

    static Scanner sc = new Scanner(System.in);

    ArrayList<Customer> customer = new ArrayList<>();
    ArrayList<Shipment> shipment = new ArrayList<>();
    ArrayList<DeliveryAgent> agent = new ArrayList<>();
    ArrayList<Vehicle> vehicle = new ArrayList<>();

    public static void main(String[] args) {

    	LogisticOperationInterface ls = new LogisticServices();

        String ch;

        do {

            System.out.println("===== LOGISTICS MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Shipment");
            System.out.println("3. Track Shipment");
            System.out.println("4. Update Shipment Status");
            System.out.println("5. Assign Delivery Agent");
            System.out.println("6. Assign Vehicle");
            System.out.println("7. Display Shipment");
            System.out.println("8. Cancel Shipment");
            System.out.println("9. Add Agent");
            System.out.println("10. Add Vehicle");

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:
                ls.addcustomer();
                break;

            case 2:
                ls.addShipment();
                break;

            case 3:
                ls.trackShipment();
                break;

            case 4:
                ls.updateShipmentStatus();
                break;

            case 5:
                ls.assignDeliveryAgent();
                break;

            case 6:
                ls.assignVehicle();
                break;

            case 7:
                ls.displayShipment();
                break;

            case 8:
                ls.cancelShipment();
                break;

            case 9:
                ls.addAgent();
                break;

            case 10:
                ls.addVehicle();
                break;

            default:
                System.out.println("Invalid Choice");
            }

            System.out.print("Do You Want Continue (Yes/No) : ");
            ch = sc.nextLine();

        } while (ch.equalsIgnoreCase("yes"));

        System.out.println("Thank You!");
    }

    
//    -----------------------------------Implementation-----------------------------------------
    @Override
    public void addcustomer() {

        System.out.println("\n----- ADD CUSTOMER -----");

        System.out.print("Add Customer ID : ");
        int cid = sc.nextInt();
        sc.nextLine();

        System.out.print("Add Customer Name : ");
        String cname = sc.nextLine();

        System.out.print("Add Customer Phone Number : ");
        String phnnum = sc.nextLine();

        Customer customers = new Customer(cid, cname, phnnum);

        customer.add(customers);

        System.out.println("Customer Added Successfully");
    }

    @Override
    public void addShipment() {

        System.out.println("\n----- ADD SHIPMENT -----");

        Random random = new Random();

        int number = random.nextInt(1000);
        String trackingId = String.valueOf(number);

        System.out.println("Your Tracking ID : " + trackingId);

        System.out.print("Enter Sender Name : ");
        String senderName = sc.nextLine();

        System.out.print("Enter Receiver Name : ");
        String ReciverName = sc.nextLine();

        System.out.print("Enter Source : ");
        String source = sc.nextLine();

        System.out.print("Enter Destination : ");
        String destination = sc.nextLine();

        System.out.print("Enter Weight : ");
        double weight = sc.nextDouble();
        sc.nextLine();

        Shipment s = new Shipment(
                trackingId,
                senderName,
                ReciverName,
                source,
                destination,
                weight
        );

        shipment.add(s);

        System.out.println("Shipment Added Successfully");
    }

    @Override
    public void trackShipment() {

        System.out.println("\n----- TRACK SHIPMENT -----");

        if (shipment.isEmpty()) {
            System.out.println("No Shipments Available");
            return;
        }

        System.out.print("Enter Shipment ID : ");
        String id = sc.nextLine();

        for (Shipment s : shipment) {

            if (s.gettrackingId().equals(id)) {

                System.out.println("Tracking ID : " + s.gettrackingId());
                System.out.println("Sender Name : " + s.getsenderName());
                System.out.println("Receiver Name : " + s.getReciverName());
                System.out.println("Source : " + s.getsource());
                System.out.println("Destination : " + s.getdestination());
                System.out.println("Weight : " + s.getweigth());
                System.out.println("Status : " + s.getstatus());

                return;
            }
        }

        System.out.println("Shipment Not Found");
    }

    @Override
    public void updateShipmentStatus() {

        System.out.println("\n----- UPDATE SHIPMENT STATUS -----");

        if (shipment.isEmpty()) {
            System.out.println("No Shipments Available");
            return;
        }

        System.out.print("Enter Shipment ID : ");
        String id = sc.nextLine();

        for (Shipment s : shipment) {

            if (s.gettrackingId().equals(id)) {

                System.out.println("1. Picked Up");
                System.out.println("2. In Transit");
                System.out.println("3. Out For Delivery");
                System.out.println("4. Delivered");

                System.out.print("Enter Choice : ");
                int choice = sc.nextInt();
                sc.nextLine();

                String status;

                switch (choice) {

                case 1:
                    status = "Picked Up";
                    break;

                case 2:
                    status = "In Transit";
                    break;

                case 3:
                    status = "Out For Delivery";
                    break;

                case 4:
                    status = "Delivered";
                    break;

                default:
                    System.out.println("Invalid Choice");
                    return;
                }

                s.setstatus(status);

                System.out.println("Shipment Status Updated Successfully");
                return;
            }
        }

        System.out.println("Shipment Not Found");
    }

    @Override
    public void assignDeliveryAgent() {

        System.out.println("\n----- ASSIGN DELIVERY AGENT -----");

        if (shipment.isEmpty()) {
            System.out.println("No Shipments Available");
            return;
        }

        if (agent.isEmpty()) {
            System.out.println("No Delivery Agents Available");
            return;
        }
       

        System.out.print("Enter Shipment ID : ");
        String id = sc.nextLine();

        Shipment shipments = null;

        for (Shipment s : shipment) {

            if (s.gettrackingId().equals(id)) {
                shipments = s;
                break;
            }
        }

        if (shipments == null) {
            System.out.println("Shipment Not Found");
            return;
        }

        System.out.println("\nAvailable Agents:");

        boolean availableAgent = false;

        for (DeliveryAgent agents : agent) {

            if (agents.getagentAvailable()) {

                agents.displayAgent();
                System.out.println();

                availableAgent = true;
            }
        }

        if (!availableAgent) {
            System.out.println("No Agents Available");
            return;
        }

        System.out.print("Enter Agent ID : ");
        int agentId = sc.nextInt();
        sc.nextLine();

        for (DeliveryAgent agents : agent) {

            if (agents.getagentId() == agentId
                    && agents.getagentAvailable()) {

                shipments.setAgent(agents);

                agents.setAvailable(false);

                System.out.println("Agent Assigned Successfully");
                return;
            }
        }

        System.out.println("Agent Not Available or Invalid ID");
    }

    @Override
    public void assignVehicle() {

        System.out.println("\n----- ASSIGN VEHICLE -----");

        if (shipment.isEmpty()) {
            System.out.println("No Shipments Available");
            return;
        }

        if (vehicle.isEmpty()) {
            System.out.println("No Vehicles Available");
            return;
        }

        System.out.print("Enter Shipment ID : ");
        String id = sc.nextLine();

        Shipment shipments = null;

        for (Shipment s : shipment) {

            if (s.gettrackingId().equals(id)) {
                shipments = s;
                break;
            }
        }

        if (shipments == null) {
            System.out.println("Shipment Not Found");
            return;
        }

        System.out.println("\nAvailable Vehicles:");

        boolean availableVehicle = false;

        for (Vehicle v : vehicle) {

            if (v.available()) {

                v.display();
                System.out.println();

                availableVehicle = true;
            }
        }

        if (!availableVehicle) {
            System.out.println("No Vehicles Available");
            return;
        }

        System.out.print("Enter Vehicle ID : ");
        int vehicleId = sc.nextInt();
        sc.nextLine();

        for (Vehicle v : vehicle) {

            if (v.getVehicleId() == vehicleId
                    && v.available()) {

                shipments.setVehicle(v);

                v.setAvailable(false);

                System.out.println("Vehicle Assigned Successfully");
                return;
            }
        }

        System.out.println("Vehicle Not Available or Invalid ID");
    }

    @Override
    public void displayShipment() {

        System.out.println("\n----- SHIPMENT DETAILS -----");

        if (shipment.isEmpty()) {
            System.out.println("No Shipments Available");
            return;
        }

        for (Shipment s : shipment) {

            s.shipMentDisplay();

            System.out.println("----------------------------");
        }
    }

    @Override
    public void cancelShipment() {

        System.out.println("\n----- CANCEL SHIPMENT -----");

        if (shipment.isEmpty()) {
            System.out.println("No Shipments Available");
            return;
        }

        System.out.print("Enter Tracking ID : ");
        String id = sc.nextLine();

        for (Shipment s : shipment) {

            if (s.gettrackingId().equals(id)) {

                if (s.getstatus().equals("Delivered")) {

                    System.out.println(
                            "Delivered shipment cannot be cancelled"
                    );

                    return;
                }

                if (s.getstatus().equals("Cancelled")) {

                    System.out.println("Shipment is already cancelled");
                    return;
                }

                s.setstatus("Cancelled");

                System.out.println("Shipment Cancelled Successfully");

                return;
            }
        }

        System.out.println("Shipment Not Found");
    }

    public void addAgent() {

        System.out.println("\n----- ADD DELIVERY AGENT -----");

        System.out.print("Enter Agent ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Agent Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Phone : ");
        String phnnum = sc.nextLine();

        agent.add(
                new DeliveryAgent(id, name, phnnum)
        );

        System.out.println("Agent Added Successfully");
    }

    public void addVehicle() {

        System.out.println("\n----- ADD VEHICLE -----");

        System.out.print("Enter Vehicle ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Number : ");
        String number = sc.nextLine();

        System.out.print("Enter Vehicle Type : ");
        String type = sc.nextLine();

        System.out.print("Enter Capacity : ");
        double capacity = sc.nextDouble();
        sc.nextLine();

        vehicle.add(
                new Vehicle(id, number, type, capacity)
        );

        System.out.println("Vehicle Added Successfully");
    }
}