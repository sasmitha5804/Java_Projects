package javaday5_project;
import java.util.*;
public class Task1 {

    public static void main(String[] args) {

    	 Scanner s = new Scanner(System.in);

         // HashMap to store student details

         HashMap<String, HashMap<String, String>> studentMap = new HashMap<>();
         System.out.println("Enter the Number of students to add:");
         int n = s.nextInt();
         s.nextLine(); 

         // Adding students
           for (int i = 0; i < n; i++) {
           System.out.println("Enter the Id:");
           String id = s.nextLine();

          HashMap<String, String> studentDetails = new HashMap<>();
           System.out.println("Enter the name:");
           studentDetails.put("Name", s.nextLine());
           System.out.println("Enter the Grade:");
           studentDetails.put("Grade", s.nextLine());        
           studentMap.put(id, studentDetails);

             }

         System.out.println("Student List: " + studentMap);

         //Sorting student ID

         TreeMap<String, HashMap<String, String>> sortedMap = new TreeMap<>(studentMap);

         System.out.println("Sorted Student List by ID: " + sortedMap);
         // Remove a student by ID

         System.out.println("Enter the ID to remove the student:");

         String idToRemove = s.nextLine();

         if (studentMap.containsKey(idToRemove)) {

             HashMap<String, String> removedStudent = studentMap.remove(idToRemove);

             System.out.println("Removed Student: " + removedStudent);

         } else {

             System.out.println("Student with ID " + idToRemove + " not found!");

         }
         //Resort after removal 

         sortedMap = new TreeMap<>(studentMap);

         System.out.println("Updated Sorted Student List by ID: " + sortedMap);
         //Search student details with ID
         System.out.println("Enter the ID to search for the student:");

         String idToSearch = s.nextLine();

         if (studentMap.containsKey(idToSearch)) {

             System.out.println("Student Found: " + studentMap.get(idToSearch));

         } else {

             System.out.println("Student with ID " + idToSearch + " not found!");

         }
         //updating the student data

         System.out.println("\nEnter the ID to update student details:");

         String idToUpdate = s.nextLine();

         if (studentMap.containsKey(idToUpdate)) {

             HashMap<String, String> studentDetails = studentMap.get(idToUpdate);

             System.out.println("Enter the new name (current: " + studentDetails.get("Name") + "):");

             String newName = s.nextLine();

             studentDetails.put("Name", newName);

             System.out.println("Enter the new grade (current: " + studentDetails.get("Grade") + "):");

             String newGrade = s.nextLine();

             studentDetails.put("Grade", newGrade);

             studentMap.put(idToUpdate, studentDetails); 

             System.out.println("Updated Student Details: " + studentMap.get(idToUpdate));

         } else {

             System.out.println("Student with ID " + idToUpdate + " not found!");

         }

         System.out.println("\nFinal Student List: " + studentMap); n
         s.close();
}
}