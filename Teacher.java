public class Teacher{          /*A class to store attributes related to both the Lecturer and Tutor classes, that will later be used*/
        private String subject;
        private String teacherName;
        private String interviewerName;   
        private int classesPerDay = 0;
        
        //constructor to set attributes to the parameter values
        public Teacher ( String subject, String interviewerName, int classesPerDay){     
            this.subject = subject;
            this.interviewerName = interviewerName;
            this.classesPerDay = classesPerDay;
            teacherName = "";
        }
        
        public String getSubject()  //getter method to get access to subject attribute
        {
            return subject;
        }
        
        public String getTeacherName()  //getter method to get access to teacherName attribute
        {
            return teacherName;
        }
        
        public String getInterviewerName()  //getter method to get access to interviewerName attribute
        {
            return interviewerName;
        }
        
        public int getClassesPerDay()   //getter method to get access to classesPerDay attribute
        {
            return classesPerDay;
        }
        
        public void setTeacherName(String teacherName)  //setter method to pass a new teacherName to the instance variable
        {
            this.teacherName = teacherName;
        }
        
        public void display()   //method to display the above attributes in a structured way
        {
            System.out.println("The subject is: " + subject);
            System.out.println("Classes per day: " + classesPerDay);
            System.out.println("Interviewer name: " + interviewerName);
            
            if (teacherName != "") {
                System.out.println("Teacher name: " + teacherName);
            }
        } 
}