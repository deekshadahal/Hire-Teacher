import java.util.*;   
   public class Lecturer extends Teacher{    //class to store information about the Lecturers
        private int salary;
        private String startingFrom;
        private String academicBlockNumber;
        private int dailyWorkingHour;
        private double advanceSalary;
        private boolean joined;
        private boolean terminated;
        
        //constructor to set some attributes to the parameter values and initialize other attributes
        public Lecturer(String subject, String interviewerName, int classesPerDay, int salary, int dailyWorkingHour){
            super(subject, interviewerName, classesPerDay);
            this.salary = salary;
            this.dailyWorkingHour = dailyWorkingHour;
            startingFrom = "";
            academicBlockNumber = "";
            advanceSalary = 0.0;
            joined = false;
            terminated = false;
        }
        
        public int getSalary()    //getter method to get access to salary attribute
        {
             return salary;
        }
        
        public String getStartingFrom()    //getter method to get access to startingFrom attribute
        {
             return startingFrom;
        }
        
        public String getAcademicBlockNumber()    //getter method to get access to academicBlockNumber attribute    
        {
            return academicBlockNumber;
        }
        
        public int getDailyWorkingHour()    //getter method to get access to dailyWorkingHour attribute
        {
            return dailyWorkingHour;
        }
        
        public double getAdvanceSalary()    //getter method to get access to advanceSalary attribute
        {
            return advanceSalary;
        }
        
        public boolean getJoined()    //getter method to get access to joined attribute
        {
            return joined;
        }
        
        public boolean getTerminated()    //getter method to get access to terminated attribute
        {
            return terminated;
        }
        
        public void setSalary(int salary)    //setter method to pass a new salary to the instance variable as changes are made
        {
            this.salary = salary;
        }
        
        public void setDailyWorkingHour(int dailyWorkingHour)    //setter method to pass a new dailyWrokingHour to the instance variable 
        {                                                           
            this.dailyWorkingHour = dailyWorkingHour;
        }
        
        public void appointLecturer(String lecturerName,String startingFrom, double advanceSalary, String academicBlockNumber)
        {        //method to display information about a lecturer if he has already joined
            if (joined == true) {
                System.out.println("Lecturer name: " + lecturerName);
                System.out.println("Academic Block Number: " + academicBlockNumber);
            }
            
            else {
                super.setTeacherName(lecturerName);
                this.startingFrom = startingFrom;
                this.advanceSalary = advanceSalary;
                this.academicBlockNumber = academicBlockNumber;
                joined = true;
                terminated = false;
            }
        }
        
        public void lectureTermination()    //method to check if a lecture has been terminated
        {
            if (terminated == true) {
                System.out.println("Lecture has been terminated");
            }
            
            else {
                setTeacherName("");
                startingFrom = "";
                advanceSalary = 0.0;
                joined = false;
                terminated = true; 
            }
        }
        
        public void print()    //method to display attributes from Lecturer class and Teacher class in a structured way
        {
           System.out.println("The subject is: " + getSubject());
           System.out.println("The lecturer name is: " + getTeacherName());
           System.out.println("The salary is: " + salary);
        }
        
        public void display()    //method to display attributes from Lecturer class and values of methods from Teacher class in a structured way
        {
            super.display();
            
            if (joined == true) {        
                System.out.println("Termination status: " + terminated);
                System.out.println("Date of starting: " + startingFrom); 
                System.out.println("Advance Salary: " + advanceSalary);
                System.out.println("Teacher name: " + getTeacherName());
            }
        }
}