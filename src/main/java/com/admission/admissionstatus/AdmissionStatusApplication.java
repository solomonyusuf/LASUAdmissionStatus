package com.admission.admissionstatus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/* Group 2 Demonstrating the Admission Status of Law students in a University */
@SpringBootApplication
public class AdmissionStatusApplication {

    /* entry point of the java program */
    public static void main(String[] args) {
        // is used to map or join two same or different data structure
        // key , value
        Map<String, String> studentDictionary = new HashMap<>();

        // Generate Students full names and sample reg numbers
        String[] fullNames = generateFullNames();
        String[] regNumbers = generateRegNumbers();

        // Add names and reg numbers to the dictionary
        // run 20 times
        for (int i = 0; i < 20; i++) {
            // we want to put one name per one reg number
            studentDictionary.put(fullNames[i], regNumbers[i]);
        }


        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: [Enter Your Reg Number To Search Admission Status]");
        // Receive student name or input
        String reg = scanner.nextLine();

        // Search for the entered reg number in the dictionary
        if (studentDictionary.containsValue(reg)) {
            for (Map.Entry<String, String> entry : studentDictionary.entrySet()) {
                if (entry.getValue().contains(reg)) {
                    System.out.println("Student Name: " + entry.getKey() + ", Reg:  " + entry.getValue());
                    break;
                }
            }
        } else {
            System.out.println("Student Reg Number does not exist in the Database.");
        }

        // Close the scanner to release resources
        scanner.close();

    }

    // generates an array of string
    private static String[] generateFullNames() {
        Random random = new Random();
  // true or false
        String[] fullNames = {
                "John Doe, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),//true
                "Jane Smith, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),//false
                "Michael Johnson, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),//true
                "Aisha Mohammed, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),//false
                "Chinedu Okonkwo, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),//true
                "Ngozi Okafor, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),//false
                "Emeka Eze, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Fatima Ibrahim, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Ibrahim Abubakar, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Adeola Ogunmola, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Tolu Adewale, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Oluwafemi Oladele, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Chioma Nwachukwu, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Yusuf Bello, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Blessing Oje, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Yinka Afolabi, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Folake Adeyemi, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Abdul Ahmed, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Nkechi Eze, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted"),
                "Olumide Adeleke, Status: " + (random.nextBoolean() ? " Admitted" : " Not Admitted")
        };
        return fullNames;
    }

    // Sample method to generate reg numbers
    private static String[] generateRegNumbers() {
        String[] regNumbers = {
                "LAW12345",
                "LAW67890",
                "LAW23456",
                "LAW78901",
                "LAW34567",
                "LAW89012",
                "LAW45678",
                "LAW90123",
                "LAW56789",
                "LAW01234",
                "LAW67890",
                "LAW23456",
                "LAW78901",
                "LAW34567",
                "LAW89012",
                "LAW45678",
                "LAW90123",
                "LAW56789",
                "LAW01234",
                "LAW67890"
        };
        return regNumbers;
    }
}
