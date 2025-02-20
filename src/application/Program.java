package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Task;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Task> taskList = new ArrayList<>();
		String INPUT = "";
		
		
		 while (true) {
	            System.out.print("Type a task (or 'Quit' to exit): ");
	            INPUT = sc.nextLine();

	            if (INPUT.equalsIgnoreCase("Quit")) {
	                break;
	            }

	            taskList.add(new Task(INPUT));
	            System.out.println("Task added: " + INPUT);
	        }

	        while (true) {
	            System.out.println("\nTask list:");
	            if (taskList.isEmpty()) {
	                System.out.println("No tasks available.");
	            } else {
	                for (int i = 0; i < taskList.size(); i++) {
	                    System.out.println((i + 1) + " - " + taskList.get(i).getDescription());
	                }
	            }

	            System.out.println("\nDo you want to add more tasks, remove a task or quit? [A/R/Q]");
	            char ra = sc.next().charAt(0);
	            sc.nextLine();

	            //Quit program
	            if (Character.toUpperCase(ra) == 'Q') {
	                System.out.println("Exiting program...");
	                break;
	            }

	            // Add task
	            if (Character.toUpperCase(ra) == 'A') {
	                while (true) {
	                    System.out.print("Type a task (or 'Quit' to stop adding): ");
	                    INPUT = sc.nextLine();

	                    if (INPUT.equalsIgnoreCase("Quit")) {
	                        break;
	                    }

	                    taskList.add(new Task(INPUT));
	                    System.out.println("Task added: " + INPUT);
	                }
	            }

	            //Remove task
	            else if (Character.toUpperCase(ra) == 'R') {
	                if (taskList.isEmpty()) {
	                    System.out.println("No tasks to remove.");
	                    continue;
	                }

	                System.out.println("Your tasks:");
	                for (int i = 0; i < taskList.size(); i++) {
	                    System.out.println((i + 1) + " - " + taskList.get(i).getDescription());
	                }

	                System.out.print("Type the number of the task you want to remove: ");
	                int number = sc.nextInt();
	                sc.nextLine();

	                if (number <= 0 || number > taskList.size()) {
	                    System.out.println("Invalid number!");
	                } else {
	                    taskList.remove(number - 1);
	                    System.out.println("Task removed!");
	                }
	            }

	            //Invalid option
	            else {
	                System.out.println("Invalid option! Please choose (A), (R) or (Q)!");
	            }
	        }

	        sc.close();
	    }
	}