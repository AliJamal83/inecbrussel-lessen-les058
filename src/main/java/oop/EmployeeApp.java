package oop;

public class EmployeeApp {
    public static void main(String[] args) {

        Employee employee01 = new Employee();
        employee01.id = 0;
        employee01.firstName = "Charles";
        employee01.lastName = "Darwin";
        employee01.department="Scientist";
        employee01.salary=50_000;
        employee01.email= "charles.darwin@intecbrussel.be";
        employee01.phone= 467700705L;
        employee01.isEmployed= false;
        employee01.isOutsourced= false;

        Employee employee02 = new Employee();
        employee02.id = 1;
        employee02.firstName ="Yilmaz";
        employee02.lastName = "Mustafa";
        employee02.department="Instructors";
        employee02.salary= 2250;
        employee02.email= "yilmaz.mustafa@intecbrussel.be";
        employee02.phone = 467711709L;
        employee02.isEmployed= true;
        employee02.isOutsourced= false;

        Employee employee03 = new Employee();
        employee03.id = 2;
        employee03.firstName ="Justin";
        employee03.lastName = "Bieber";
        employee03.department="No One Knows";
        employee03.salary= 2_000_000;
        employee03.email= "justin.bieber@intecbrussel.be";
        employee03.phone= 467711703L;
        employee03.isEmployed= true;
        employee03.isOutsourced= true;

        Employee employee04 = new Employee();
        employee04.id = 3;
        employee04.firstName ="Nikola";
        employee04.lastName = "Tesla";
        employee04.department="Scientist";
        employee04.salary=100;
        employee04.email= "nikola.tesla@intecbrussel.be";
        employee04.phone= 467711705L;
        employee04.isEmployed= false;
        employee04.isOutsourced= false;


        Employee employee05 = new Employee();
        employee05.id = 4;
        employee05.firstName ="Thomas";
        employee05.lastName = "Edison";
        employee05.department="Business person";
        employee05.salary= 1_000_000;
        employee05.email= "thomas.edison@intecbrussel.be";
        employee05.phone= 467711701L;
        employee05.isEmployed= false;
        employee05.isOutsourced= true;

        Employee employee06 = new Employee();
        employee06.id = 5;
        employee06.firstName ="Elon";
        employee06.lastName = "Desk";
        employee06.department="Marketing guy";
        employee06.salary = 1_000_000_000;
        employee06.email= "elon.desk@intecbrussel.be";
        employee06.phone= 567711102L;
        employee06.isEmployed= false;
        employee06.isOutsourced= true;

        Employee employee07 = new Employee();
        employee07.id =6;
        employee07.firstName ="Jeff";
        employee07.lastName = "BeeZoos";
        employee07.department="Bossy and mean guy";
        employee07.salary = 1_500_000_000;
        employee07.email= "jeff.the.mean@intecbrussel.be";
        employee07.phone= 667722102L;
        employee07.isEmployed= true;
        employee07.isOutsourced= false;

        Employee [] employees = new Employee[100];
        //
        employees [0] = employee01;
        employees [1] = employee02 ;
        employees [2] = employee03;
        employees [3] = employee04;
        employees [4] = employee05;
        employees [5] = employee06;
        employees [6] = employee07;

        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null) {
                employees[index].print();
            }
            System.out.println("Step " + index);
        }


    }
}
