package com.oops.LogisticManagement;

public class Shipment {

    private String trackingId;
    private String senderName;
    private String ReciverName;
    private String source;
    private String destination;
    private String status;
    private double weight;

    private DeliveryAgent agent;
    private Vehicle vehicle;

    public Shipment(String trackingId,
                    String senderName,
                    String ReciverName,
                    String source,
                    String destination,
                    double weight) {

        this.trackingId = trackingId;
        this.senderName = senderName;
        this.ReciverName = ReciverName;
        this.source = source;
        this.destination = destination;
        this.status = "Booked";
        this.weight = weight;
    }

    public String gettrackingId() {
        return trackingId;
    }

    public String getsenderName() {
        return senderName;
    }

    public String getReciverName() {
        return ReciverName;
    }

    public String getsource() {
        return source;
    }

    public String getdestination() {
        return destination;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    public double getweigth() {
        return weight;
    }

    public void setAgent(DeliveryAgent agent) {
        this.agent = agent;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void shipMentDisplay() {

        System.out.println("Tracking ID : " + trackingId);
        System.out.println("Sender Name : " + senderName);
        System.out.println("Receiver Name : " + ReciverName);
        System.out.println("Source : " + source);
        System.out.println("Destination : " + destination);
        System.out.println("Weight : " + weight);
        System.out.println("Status : " + status);

        if (agent != null) {
            System.out.println("Agent : " + agent.getagentName());
        } else {
            System.out.println("Agent : Not Assigned");
        }

        if (vehicle != null) {
            System.out.println("Vehicle : " + vehicle.getvehicleNumber());
        } else {
            System.out.println("Vehicle : Not Assigned");
        }
    }
}