public class Tutor extends Teacher{    //class to store information about Teachers
    private int salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    //constructor to set some attributes to the parameter values and initialize other attributes
    public Tutor(String subject, String interviewerName, int classesPerDay, int salary, String appointedBy, String terminationDate){
        super(subject,interviewerName,classesPerDay); 
        this.salary = salary;
        this.appointedBy = appointedBy;
        this.terminationDate = terminationDate;
        appointedDate = "";
        evaluationPeriod = "";
        qualification = "";
        joined = false;
    }
    
    public int getSalary()    //getter method to get access to salary attribute
    {
        return salary;
    }
    
    public String getAppointedDate()    //getter method to get access to appointedDate attribute
    {
        return appointedDate;
    }
    
    public String getEvaluationPeriod()    //getter method to get access to evaluationPeriod attribute
    {
        return evaluationPeriod;
    }
    
    public String getTerminationDate()    //getter method to get access to terminationDate attribute
    {
        return terminationDate;
    }
    
    public String getQualification()    //getter method to get access to qualification attribute
    { 
        return qualification;
    }
    
    public String getAppointedBy()    //getter method to get access to appointedBy attribute
    {
        return appointedBy;
    }
    
    public boolean getJoined()    //getter method to get access to getJoined attribute
    {
        return joined;
    }
    
    public void setSalary(int newSalary)    //setter method to pass a new salary to the instance variable as changes are made
    {
        if (joined == false) {
            this.salary = newSalary;
        }
        
        else {
            System.out.println("Tutor already appointed. Changing the salary is not possible");
        }
    }
    
    public void appointTutor(String tutorName, String appointedDate, String terminationDate, String qualification) 
    {    //method to appoint a Tutor if he hasn't already been appointed
        if (joined == false) {
            super.setTeacherName(tutorName); 
            joined = true;
        }
       
        else{
            System.out.println("The tutor has already been appointed. Tutor appointed on " + appointedDate);
        }
        this.appointedDate = appointedDate;
        this.terminationDate = terminationDate;
        this.qualification = qualification; 
    }
    
    public void display()    //method to display information about the Tutor in a structured way
    {
        super.display();
        
        if (joined = true) {
            System.out.println("Appointed date: " + appointedDate + "\n" + "Tutor name: " + getTeacherName());
            System.out.println("Evaluation period: " + evaluationPeriod + "\n" + "Termination date: " + terminationDate);
            System.out.println("Tutor salary: " + salary + "\n" + "Tutor qualification: " + qualification);
            System.out.println("Tutor appointed: " + appointedDate);
        }
    }
}