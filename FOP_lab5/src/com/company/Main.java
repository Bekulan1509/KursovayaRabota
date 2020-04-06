package com.company;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        task1();
//        System.out.println("------------------------------------------------------");
        //   task2();
        task3();
        System.out.println("------------------------------------------------------");


    }

    static void task1() {
        System.out.println("Enter name : ");
        String name1 = scanner.next();
        System.out.println("Enter group : ");
        String gruop1 = scanner.next();
        System.out.println("Enter semester : ");
        int ses1 = scanner.nextInt();

        System.out.println("------------------------------------------------------");

        System.out.println("Enter name : ");
        String name2 = scanner.next();
        System.out.println("Enter group : ");
        String gruop2 = scanner.next();
        System.out.println("Enter semester : ");
        int ses2 = scanner.nextInt();

        List<Student> list = new ArrayList<>();
        list.add(new Student(name1, gruop1, ses1));
        list.add(new Student(name2, gruop2, ses2));
        list.add(new Student("Atahan", "Pi-8-19", 4));
        list.add(new Student("Nursultan", "Pi-8-19", 4));
        list.add(new Student("Suiun", "Pi-8-19", 2));
        list.sort(Student::compareTo);

        Iterator<Student> iter = list.iterator();
        while (iter.hasNext()) {
            Student st = iter.next();
            if (st.getSes() < 4) {
                System.out.println("these guys don't have 5 or 4, Because they studied bad  😎");
            } else
                System.out.println("Name : " + st.getName() + "," + " Group : " + st.getGroup() + "," + " Semester : " + st.getSes());
        }
    }

    static void task2() {
        System.out.println("Enter destination : ");
        String destination = scanner.next();
        System.out.println("enter number of train :");
        int num1 = scanner.nextInt();
        System.out.println("enter departure time : ");
        String time1 = scanner.next();

        System.out.println("-------------------------------------------------------------");

        System.out.println("Enter destination : ");
        String destination2 = scanner.next();
        System.out.println("enter number of train");
        int num2 = scanner.nextInt();
        System.out.println("enter departure time : ");
        String time2 = scanner.next();

        System.out.println("-------------------------------------------------------------");

        System.out.println("Enter destination : ");
        String destination3 = scanner.next();
        System.out.println("enter number of train");
        int num3 = scanner.nextInt();
        System.out.println("enter departure time : ");
        String time3 = scanner.next();

        ArrayList<Train> trains = new ArrayList<>();
        trains.add(new Train(destination, num1, time1));
        trains.add(new Train(destination2, num2, time2));
        trains.add(new Train(destination3, num3, time3));
        trains.sort(Train::compareTo);

        Iterator<Train> iterator = trains.iterator();
        while (iterator.hasNext()) {
            Train tr = iterator.next();
            System.out.println("destination : " + tr.getNazn() + "," + " number of the train : " + tr.getNum() + ", " + "departure time : " + tr.getTime() + " hours");
        }
        System.out.println("___________________________________________________________________________________________");
        System.out.println("Enter number of train ");
        int searchTrainNum = scanner.nextInt();
        if (num1 == searchTrainNum) {
            System.out.println("destination : " + destination + "," + " number of the train :" + num1 + ", " + "departure time : " + time1 + " hours");
        } else if (num2 == searchTrainNum) {
            System.out.println("destination : " + destination2 + "," + " number of the train :" + num2 + ", " + "departure time : " + time2 + " hours");

        } else if (num3 == searchTrainNum) {
            System.out.println("destination : " + destination3 + "," + " number of the train :" + num3 + ", " + "departure time : " + time3 + " hours");

        } else System.out.println("this train doesn't excise in the table");
    }

    static void task3() {
        ArrayList<Worker> list;
        System.out.println("Enter year");
        int year1 = scanner.nextInt();
        System.out.println("Enter year");
        int year2 = scanner.nextInt();
        System.out.println("Enter year");
        int year3 = scanner.nextInt();
        System.out.println("Enter year");
        int year4 = scanner.nextInt();
        System.out.println("Enter year");
        int year5 = scanner.nextInt();


        list = new ArrayList<>();
        list.add(new Worker("Bekulan", "Developer", year1));
        list.add(new Worker("Beksultan", "Manager", year2));
        list.add(new Worker("Bektur", "security", year3));
        list.add(new Worker("Bekturgan", "engineer", year4));
        list.add(new Worker("Bekjan", "little engineer", year5));
        list.sort(Worker::compareTo);

        Iterator<Worker> iter = list.iterator();
        while (iter.hasNext()) {
            Worker wr = iter.next();
            System.out.println("Name : " + wr.getName() + ", " + "position : " + wr.getPos() + ", " + "year : " + wr.getYear());
        }
        System.out.println("-------------------------------------------------------------");

        System.out.println("Enter any year");
        int yearCheck = scanner.nextInt();
        if (year1 >= yearCheck) {
            System.out.print("Name : Bekulan" + " " + ", " + "position : Developer" + " " + ", " + "year : ");
            System.out.println(year1);
        }
        if (year2 >= yearCheck) {
            System.out.print("Name : Beksultan" + " " + ", " + "position : Manager" + " " + ", " + "year : ");
            System.out.println(year2);
        }
        if (year3 >= yearCheck) {
            System.out.print("Name : Bektur" + " " + ", " + "position : security" + " " + ", " + "year : ");
            System.out.println(year3);
        }
        if (year4 >= yearCheck) {
            System.out.print("Name : Bekturgan" + " " + ", " + "position : engineer" + " " + ", " + "year : ");
            System.out.println(year4);
        }
        if (year5 >= yearCheck) {
            System.out.print("Name : Bekjan" + " " + ", " + "position : little engineer" + " " + ", " + "year : ");
            System.out.println(year5);
        }

    }
}
