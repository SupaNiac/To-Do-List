package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Task;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Task> taskList = new ArrayList<>();
		int n = 100;
		
		for (int i=0; i<n; i++) {
		System.out.print("Type a task: ");
		String task1 = sc.next();
		Task task = new Task(task1);
		taskList.add(task);
		System.out.println(task);
		}
		
		
		sc.close();
	}

}
