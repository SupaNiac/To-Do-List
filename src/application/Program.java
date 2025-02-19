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
		
		sc.close();
	}

}
