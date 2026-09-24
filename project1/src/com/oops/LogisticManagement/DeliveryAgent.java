package com.oops.LogisticManagement;

public class DeliveryAgent extends LogisticServices {
	
	private int agentId;
	private String agentName;
	private String agentphnnum;
	private boolean agentAvailable;
	
	
	public DeliveryAgent(int agentId, String agentName, String agentphnnum) {
		this.agentId=agentId;
		this.agentName=agentName;
		this.agentphnnum=agentphnnum;
		this.agentAvailable=true;
		
	}
	
	public int getagentId() {
		return agentId;
	}
	
	public String getagentName() {
		return agentName;
	}
	
	public String getagentphnnum() {
		return agentphnnum;
	}
	
	public boolean getagentAvailable() {
		return agentAvailable;
	}
	
	public void setAvailable(boolean agentAvailable) {
		this.agentAvailable=agentAvailable;
		
	}
	
	
	public void displayAgent() {
		System.out.println("Agent ID : "+agentId);
		System.out.println("Agent Name : "+agentName);
		System.out.println("Agent Phone Number : "+agentphnnum);
		System.out.println("Agent Available : "+agentAvailable);

	}

	

	

	

}
