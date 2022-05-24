package todolist;

public class Case {
	
    String name;
    String doBeforeDate;
    String description;
    
	public Case(String name, String doBeforeDate, String description) {
		this.name = name;
		this.doBeforeDate = doBeforeDate;
		this.description = description;
	}
    
    public void printInfo() {
    	System.out.println(name + " before " + doBeforeDate + " " + description);
    }
} 
