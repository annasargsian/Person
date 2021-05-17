package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Enter your first name");
        person.setFirstName(scanner.next());
        System.out.println("Enter your last name");
        person.setLastName(scanner.next());
        System.out.println("Enter your age");
        person.setAge(scanner.nextInt());
        System.out.println("Enter your sex");
        person.setSex(scanner.next());
        System.out.println("Enter your passport ID");
        person.setPassportId(scanner.next());
        System.out.println(person.toString());

    }
}
