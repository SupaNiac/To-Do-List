package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Task;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Task> taskList = new ArrayList<>();
		String INPUT = "";
		
		
		while (!INPUT.equalsIgnoreCase("Quit")) {
		System.out.print("Type a task (or 'Quit to exit): ");
		INPUT = sc.nextLine();
		
		if (!INPUT.equalsIgnoreCase("Quit")) {
			Task task = new Task(INPUT);
			taskList.add(task);
			System.out.println("Task added: " + task);
		}
		}
		
		System.out.println("\n Task list: ");
			for (Task t : taskList) {
				System.out.println(t);
			}
			
			System.out.println("Do you want to add more tasks or remove a task? [A/R]");
			char ra = sc.next().charAt(0);
			
			if (ra == 'a') {
				while (!INPUT.equalsIgnoreCase("Quit")) {
					System.out.print("Type a task (or 'Quit to exit): ");
					INPUT = sc.nextLine();
					
					if (!INPUT.equalsIgnoreCase("Quit")) {
						Task task = new Task(INPUT);
						taskList.add(task);
						System.out.println("Task added: " + task);
					}
					}
			}
			else if (ra == 'r') {
				
				System.out.println("Your tasks: ");
				for (int i = 0; i < taskList.size(); i++) {
					System.out.println((i + 1) + "-" + taskList.get(i).getDescription());
				}	
				System.out.print("Type the number of the task you want to remove: ");
				int number = sc.nextInt();
			}
					
		
		sc.close();
	}

}
