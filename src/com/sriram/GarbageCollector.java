package com.sriram;
class A{
  B b;	
}
class B{
  A a;	
}
public class GarbageCollector {
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize called");
	}
     void message() {
    	System.out.println("In message method"); 
     }
     
     static void  outOfScope() {
         //objects out of scope
    	 GarbageCollector obj5 = new GarbageCollector();
     }
     
	public static void main(String[] args) {
	  System.out.println("main method started");
//	  GarbageCollector obj1 = new GarbageCollector();
//	  GarbageCollector obj2 = new GarbageCollector();
	  
	  // Island of Isolation
	  A obj1 = new A();
	  B obj2 = new B();
	  
	  obj1.b=obj2;
	  obj2.a=obj1;
		
	  //Nullifying the objects
      obj1=null;
      obj2=null;
      
      GarbageCollector obj3 = new GarbageCollector();
      GarbageCollector obj4 = new GarbageCollector();
      //Reassigning the objects
      obj4=obj3;
      
      //Anonymous objects
      new GarbageCollector().message();    
      
      outOfScope();
      
      System.gc();
      
      System.out.println("main method ended");
	}

}
