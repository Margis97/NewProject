package todolist;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	
	List<Case> toDoList = new ArrayList<>();
	
	public void addCase(String name, String doBeforeDate, String description) {
		Case newCase = new Case(name, doBeforeDate, description);
		toDoList.add(newCase);
	}
	
	public void printToDoList() {
		for (int i = 0; i < toDoList.size(); i++) {
			Case someCase = toDoList.get(i);
			someCase.printInfo();
		}
	}
	
    public static void main(String[] args) {
    	ToDoList list = new ToDoList();	
    	list.addCase("Go to shop", "30.05.2022", "Buy something important");
    	list.printToDoList();
    }
}
