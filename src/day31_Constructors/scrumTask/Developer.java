package day31_Constructors.scrumTask;

public class Developer {

    public String name;
    public int employeeID;
    public String JobTitle;
    public double Salary;

    public Developer(String name, String jobTitle, int employeeID, double salary) {
        this.name = name;
        this.JobTitle = jobTitle;
        this.employeeID = employeeID;
        this.Salary = salary;
    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", Salary= $" + Salary +
                '}';
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void unitTesting(){
        System.out.println(name+" is unit testing");
    }
    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }


}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */
