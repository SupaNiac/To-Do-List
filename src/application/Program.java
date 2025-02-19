package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Task;

public class Program {

	public static void main(String[] args) {
		
		Task task = new Task();
		Scanner sc = new Scanner(System.in);
		ArrayList<Task> task1 = new ArrayList<>();
		
		System.out.println("Add a task: ");
		task.setTask(sc.next());
		System.out.println(task.getTask());
		
		
		sc.close();
	}

}
