package assement1.departments;

public class HRDepartment extends SuperDepartment{

	public String departmentName() {
		return "HR Department";
	}
	
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendence.";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD.";
	}
	
	public String doActivity() {
		return "Team Lunch";
	}
}
