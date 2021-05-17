package com.company;

import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String sex;
    private String passportId;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3 || firstName.length() > 15) {
            System.out.println("firstName must be in range 3 to 15");
            setFirstName(scanner.next());
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 6 || lastName.length() > 20) {
            System.out.println("lastName must be in range 6 to 20");
            setLastName(scanner.next());
        } else {
            this.lastName = lastName;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        int resultOfFemale = sex.compareToIgnoreCase("female");
        int resultOfMale = sex.compareToIgnoreCase("male");
        if (resultOfFemale == 0 || resultOfMale == 0) {
            this.sex = sex;
        } else {
            System.out.println("sex must be male or female");
            setSex(scanner.next());
        }
    }

    public String getPassportId() {
        return passportId;
    }

    //    public void setPassportId(String passportId) {
//        int countDigits = 0;
//        char[] compare = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9'};
//        if (passportId.charAt(0) == 'A' && passportId.charAt(1) == 'N' && passportId.length() == 8) {
//            for (int i = 2; i <= 7; i++) {
//                for (int j = 0; j < compare.length; j++) {
//                    if (passportId.charAt(i) == compare[j]) {
//                        countDigits++;
//                    }
//                }
//            }
//            if (countDigits == 6) {
//                this.passportId = passportId;
//            } else {
//                System.out.println("passportId must contain 6 digits");
//            }
//        } else {
//            System.out.println("passportId must be start with \"AN\" and contain 6 digits");
//        }
//    }
    public void setPassportId(String passportId) {
        int countDigits = 0;
        if (passportId.charAt(0) == 'A' && passportId.charAt(1) == 'N' && passportId.length() == 8) {
            for (int i = 2; i < passportId.length(); i++) {
                char result = passportId.charAt(i);
                int ascii = (int) result;
                if (ascii >= 48 && ascii <= 57) {
                    countDigits++;
                }
            }
            if (countDigits == 6) {
                this.passportId = passportId;
            } else {
                System.out.println("passportId must contain 6 digits");
                setPassportId(scanner.next());
            }
        } else {
            System.out.println("passportId must be start with \"AN\" and contain 6 digits");
            setPassportId(scanner.next());
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 99) {
            System.out.println("age must be in range 18 - 99");
            setAge(scanner.nextInt());
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", passportId='" + passportId + '\'' +
                ", age=" + age +
                '}';
    }
}
