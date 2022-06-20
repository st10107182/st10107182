/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.time.Duration;
import javax.swing.*;

/**
 *
 * @author ST10107182
 */
public class JavaApplication2 {
    

    //@param args the command line arguments
    
    public static String Developer[] = new String[4];
    public static String TaskNames[] = new String[4];
    public static int[] Duration = new int[4];
    public static String status[] = new String[4];
    
    
    
    public static void main(String[] args) {

        int option;

        JOptionPane.showInputDialog("Enter num task you want to add");
        JOptionPane.showInputDialog("Enter Developer name");
        JOptionPane.showInputDialog("Enter Task name");
        JOptionPane.showInputDialog("Enter num of longest duration");
        JOptionPane.showInputDialog("Enter duration");
        JOptionPane.showInputDialog("Enter task status");
        
    }

    public static void loadArray() {
    
        Developer[0] = "Mike Smith";
        Developer[1] = "Edward Harrison";
        Developer[2] = "Samantha Paulson";
        Developer[3] = "Glenda Obelholzer";

        TaskNames[0] = "Create Login";
        TaskNames[1] = "Create Add Features";
        TaskNames[2] = "Create Reports";
        TaskNames[3] = "Add Arrays";

        Duration[0] = 5;
        Duration[1] = 8;
        Duration[2] = 2;
        Duration[3] = 11;

        status[0] = "To Do";
        status[1] = "Doing";
        status[2] = "Done";
        status[3] = "To Do";
    }

    public static void display() {
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter (1) Display Developer, Task Name and Task Duration for all tasks with status DONE\n"
                + "Enter (2)Display developer with longest duration\n"
                + "Enter (3)Search task\n"
                + "Enter (4)Search for all tasks assigned to a developer\n"
                + "Enter (5)Delete a task using Task name\n"
                + "Enter (6)Show full details of all captured tasks"));
    
        
        if(option == 1){
            String Display=  JOptionPane.showInputDialog("DONE");
            displayDone();
       }
        if(option == 2){
            String Duration=  JOptionPane.showInputDialog("duration");
            displayLongestDuration();
       }
        if(option == 3){
          String search=  JOptionPane.showInputDialog("search");
            search(search);
        }
        if(option == 4){
            String delete=  JOptionPane.showInputDialog("delete");
            delete();
        }
        if(option == 5){
            String displayAll=  JOptionPane.showInputDialog("displayAll");
            display();
           
    }
    }
    public static String displayDone() {
        String message = "";
        for (int i = 0; i < status.length; i++) {
            if (status[i].equals("Done")) {
                message += "Developer Details: " + Developer[i] + "\nTask Name: " + TaskNames[i] + "\nTask duration: " + Duration[i];
            }
        }

        return message;

    }

    public static String displayLongestDuration() {
        String[] Duration = null;
        int maxDurationIndex = 0;
        for (int i = 0; i < Duration.length; i++) {
            String maxDurationValue = null;
            maxDurationValue = Duration[i];
            maxDurationIndex = i;
        }

        String[] DeveloperDetails = null;

        return DeveloperDetails[maxDurationIndex] + " " + Duration[maxDurationIndex];
    }
    public static String search(String name){
        String message = "";
        for(int i = 0; i<developerDetails.length; i++){  
            String[] DeveloperDetails = null;
            if(name.equalsIgnoreCase(DeveloperDetails[i])){
                message =  TaskNames[i];
            }
            
        }
        return message; 
    }

      public static String delete(){
        String deleteTask = JOptionPane.showInputDialog(null,"Please enter the task name");
        boolean taskFound = false;
        
        //This for loop is to check if the task they trying is actually in our list of tasks
        for(int i = 0; i<TaskNames.length; i++){
            if (status[i].equals("taskName")) {
                JOptionPane.showMessageDialog(null, "Developer:" + Developer[i] + "\n"
                        + "STATUS:" + status[i] + "'\n"
                        + "DURATION: P"+ Duration[i] + "\n");
                taskFound = true;
            }
            
            if(TaskNames.equals(TaskNames[delete])){
               
                
                
                message = "Entry \"" + TaskNames[i] +"\" has been successfully deleted";
            }
        }
        
        return message;
    }
       public void displayAll(){
        String message = "";
        for(int i = 0; i< TaskNames.length; i++){
            message = "\nTask " + (i+1) +":\n" + "printTaskDetails"+Developer[i]+TaskNames[i]+Duration[i] + status[i];
        }
        JOptionPane.showMessageDialog(null, message);
        
    }
    public String printTaskDetails(String taskStatus,
            String taskId, 
            String taskName, 
            int taskDuration, 
            String developerDetails){
        return ("Task Status: " + status + "\nDeveloper details: "+ Developer +
                "\nTask Name: " + TaskNames + "\nTask ID: " + taskId + "\nTask Duration: " + Duration);
        
    }

    

   


}