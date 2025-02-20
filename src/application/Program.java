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
			
			while (true) {
			System.out.println();
			System.out.println("Do you want to add more tasks, remove a task or quit? [A/R/Q]");
			char ra = sc.next().charAt(0);
			sc.nextLine();
			
			if (Character.toUpperCase(ra) == 'A') {
				INPUT = "";
				while (true) {
					System.out.print("Type a task (or Quit to stop adding): ");
					INPUT = sc.nextLine();
					
					if (!INPUT.equalsIgnoreCase("Quit")) {
						break;
					}
					taskList.add(new Task(INPUT));
					System.out.println("Task added: " + INPUT);
					}
			}
			else if (Character.toUpperCase(ra) == 'R') {
				if (taskList.isEmpty()) {
					System.out.println("No tasks to remove.");
					continue;
				}
			}
				System.out.println("Your tasks: ");
				for (int i = 0; i < taskList.size(); i++) {
					System.out.println((i + 1) + "-" + taskList.get(i).getDescription());
				}
				System.err.println("Type the number of the task you want to remove: ");
				int number = sc.nextInt();
				sc.nextLine();
				
				if (number < 0 && number <= taskList.size()) {
					taskList.remove(number - 1);
					System.out.println("Task removed! ");
				}
				else {
					System.out.println("Invalid number!");
				}
				if	 (Character.toUpperCase(ra) == 'Q') {
					System.out.println("Exiting program...");
					break;
				}
				else {
					System.out.println("Invalid option! Please choose (A), (R) or (Q)!  ");
				}
			}
		sc.close();
	}

}
