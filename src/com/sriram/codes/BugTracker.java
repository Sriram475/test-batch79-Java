package com.sriram.codes;

public class BugTracker {
	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	
	int getbugId(){
    	return bugId;
      }
      String getapplicationName() {
    	  return applicationName;
      }
      String getbugTitle() {
    	  return bugTitle;
      }
      String getseverity() {
    	  return severity;
      }
      String getpriority() {
    	  return priority;
      }
      String getstatus() {
    	  return status;
      }
      String getassignedDeveloper() {
    	  return assignedDeveloper;
      }
	
	 void assignToDeveloper(int bugId,String developerName) {
	      System.out.println(bugId);
	      System.out.println(developerName);
	}
	void updateStatus(String newStatus) {
		System.out.println("New status is "+newStatus);
	}
	void displayBugSummary() {
		getbugId();
		getapplicationName();
		getbugTitle();
		getseverity();
		getpriority();
		getstatus();
		getassignedDeveloper();
		
	}
	public static void main(String[] args) {
	  BugTracker b = new BugTracker();
	  b.bugId=53533;
	  b.applicationName="Employeeportal";
	  b.bugTitle="apiresponses";
	  b.severity="high";
      b.priority="high";
      b.status="active";
      b.assignedDeveloper="siva";
      
      b.displayBugSummary();
      b.assignToDeveloper(64747,"sriram");
      b.updateStatus("In Development");
      
    
}   

}
