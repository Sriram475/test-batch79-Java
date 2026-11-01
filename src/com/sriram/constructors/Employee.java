package com.sriram.constructors;

class Employee {

    String name;

    Employee() {
        name = "Unknown";
        System.out.println("In no-arg constructor");
        System.out.println("Name is :" + name);
    }

    Employee(String name) {
        this.name = name;
        System.out.println("In parameterized constructor");
        System.out.println("Name is: " + this.name);
    }
    public static void main(String args[]) {
    	Employee e = new Employee();
    	Employee e1 = new Employee("ram");
    }
    
}
