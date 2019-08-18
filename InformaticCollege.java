import javax.swing.JButton; 
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
public class InformaticCollege implements ActionListener
{  //class to store information about the several frames used for the GUI
    //initialising buttons, labels and frames for the methods 
    private JButton btnLecturer; 
    private JButton btnTutor;  
    private JLabel question;
    private JFrame mainFrame;
    private JFrame frame;
    
    //initialising labels and textfields for lecturer() method
    private JLabel lblTitle; 
    private JLabel lblLecSubject; 
    private JLabel lblLecInterviewerName; 
    private JLabel lblLecClassesPerDay;
    private JLabel lblLecSalary; 
    private JLabel lblLecDailyWorkingHour; 
    private JLabel lblLecStartingFrom;
    private JLabel lblLecAcademicBlockNumber;
    private JLabel lblLecAdvanceSalary;
    private JLabel lblLecTeacherName;
    private JLabel lblLecTeacherNum;
    
    private JTextField lecSubjectField;
    private JTextField lecInterviewerNameField;
    private JTextField lecClassesPerDayField;
    private JTextField lecSalaryField;
    private JTextField lecDailyWorkingHourField;
    private JTextField lecStartingFromField;
    private JTextField lecAcademicBlockNumField;
    private JTextField lecAdvanceSalaryField;
    private JTextField lecTeacherNameField;
    private JTextField lecTeacherNumField;
    private JButton btnAdd = new JButton("Add");
    private JButton btnClear = new JButton("Clear");
    private JButton btnDisplay = new JButton("Display");
    private JButton btnAppoint = new JButton("Appoint");
    private JButton btnTerminate = new JButton("Terminate");
    
    
    //initialising labels and textfields for tutor() method
    private JLabel lblTutSubject;
    private JLabel lblTutInterviewerName;
    private JLabel lblTutClassesPerDay;
    private JLabel lblTutSalary;
    private JLabel lblTutAppointedBy;
    private JLabel lblTutTerminationDate;
    private JLabel lblTutAppointedDate;
    private JLabel lblTutEvaluationPeriod;
    private JLabel lblTutQualification;
    private JLabel lblTutTeacherName;
    private JLabel lblTutTeacherNum;
    
    private JTextField tutSubjectField;
    private JTextField tutInterviewerNameField;
    private JTextField tutClassesPerDayField;
    private JTextField tutSalaryField;
    private JTextField tutAppointedByField;
    private JTextField tutTerminationDateField;
    private JTextField tutAppointedDateField;
    private JTextField tutEvaluationPeriodField;
    private JTextField tutQualificationField;
    private JTextField tutTeacherNameField;
    private JTextField tutTeacherNumField;
    private JButton btnTutAdd = new JButton("Add");
    private JButton btnTutClear = new JButton("Clear");
    private JButton btnTutDisplay = new JButton("Display");
    private JButton btnTutAppoint = new JButton("Appoint");
    
    //declaring ArrayList for storing values of both lecturer and tutor
    ArrayList<Teacher> teachersList = new ArrayList<Teacher>();
    
    
    public void mainFrame()
    { //creating a main frame where the user can choose which form to fill
        JFrame mainFrame = new JFrame("Teacher Appointment System");
        mainFrame.setSize(400,200);
        mainFrame.setVisible(true);
        mainFrame.setLayout(null);
        
        question = new JLabel("Which form would you like to fill?");
        mainFrame.add(question);
        question.setBounds(60,15,300,30);
        question.setFont(question.getFont().deriveFont(18f));
        
        //button to open form for Lecturer
        btnLecturer = new JButton("Lecturer");
        mainFrame.add(btnLecturer);
        btnLecturer.setBounds(90,80,90,30);
        btnLecturer.addActionListener(this); 
        
        //button to open form for tutor
        btnTutor = new JButton("Tutor");
        mainFrame.add(btnTutor);
        btnTutor.setBounds(190,80,90,30);
        btnTutor.addActionListener(this);
        
    }
    
    public void lecturer()
    {//method that has labels, buttons and textfields for the lecturer form
        JFrame frame = new JFrame("Teacher Appointment System");
        frame.setSize(800,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);
        
        lblTitle = new JLabel("Lecturer");
        frame.add(lblTitle);
        lblTitle.setBounds(328,10,300,30);
        lblTitle.setFont(lblTitle.getFont().deriveFont(22f));
        
        lblLecSubject = new JLabel("Subject:");
        frame.add(lblLecSubject);
        lblLecSubject.setBounds(10,60,70,30);
        lblLecSubject.setFont(lblLecSubject.getFont().deriveFont(16f));
        lecSubjectField = new JTextField("");
        lecSubjectField.setBounds(100,60,205,30);
        frame.add(lecSubjectField);
        
        lblLecInterviewerName = new JLabel("Interviewer Name:");
        frame.add(lblLecInterviewerName);
        lblLecInterviewerName.setBounds(370,60,300,30);
        lblLecInterviewerName.setFont(lblLecInterviewerName.getFont().deriveFont(16f));
        lecInterviewerNameField = new JTextField("");
        lecInterviewerNameField.setBounds(510,60,200,30);
        frame.add(lecInterviewerNameField);
        
        lblLecClassesPerDay = new JLabel("Classes per day:");
        frame.add(lblLecClassesPerDay);
        lblLecClassesPerDay.setBounds(10,110,130,30);
        lblLecClassesPerDay.setFont(lblLecClassesPerDay.getFont().deriveFont(16f));
        lecClassesPerDayField = new JTextField("");
        lecClassesPerDayField.setBounds(155,110,150,30);
        frame.add(lecClassesPerDayField);
        
        lblLecSalary = new JLabel("Salary:");
        frame.add(lblLecSalary);
        lblLecSalary.setBounds(450,110,100,30);
        lblLecSalary.setFont(lblLecSalary.getFont().deriveFont(16f));
        lecSalaryField = new JTextField("");
        lecSalaryField.setBounds(510,110,200,30);
        frame.add(lecSalaryField);
        
        lblLecDailyWorkingHour = new JLabel("Daily Working Hour:");
        frame.add(lblLecDailyWorkingHour);
        lblLecDailyWorkingHour.setBounds(10,160,160,30);
        lblLecDailyWorkingHour.setFont(lblLecDailyWorkingHour.getFont().deriveFont(16f));
        lecDailyWorkingHourField = new JTextField("");
        lecDailyWorkingHourField.setBounds(175,160,130,30);
        frame.add(lecDailyWorkingHourField);
        
        btnAdd.addActionListener(this);
        frame.add(btnAdd);
        btnAdd.setBounds(560,190,150,30);
        
        lblLecStartingFrom = new JLabel("Starting From:");
        frame.add(lblLecStartingFrom);
        lblLecStartingFrom.setBounds(10,240,140,30);
        lblLecStartingFrom.setFont(lblLecClassesPerDay.getFont().deriveFont(16f));
        lecStartingFromField = new JTextField("");
        lecStartingFromField.setBounds(135,240,170,30);
        frame.add(lecStartingFromField);
        
        lblLecAcademicBlockNumber = new JLabel("Academic Block Number:");
        frame.add(lblLecAcademicBlockNumber);
        lblLecAcademicBlockNumber.setBounds(350,240,210,30);
        lblLecAcademicBlockNumber.setFont(lblLecClassesPerDay.getFont().deriveFont(16f));
        lecAcademicBlockNumField = new JTextField("");
        lecAcademicBlockNumField.setBounds(550,240,160,30);
        frame.add(lecAcademicBlockNumField);
        
        lblLecAdvanceSalary = new JLabel("Advance Salary:");
        frame.add(lblLecAdvanceSalary);
        lblLecAdvanceSalary.setBounds(10,290,150,30);
        lblLecAdvanceSalary.setFont(lblLecClassesPerDay.getFont().deriveFont(16f));
        lecAdvanceSalaryField = new JTextField("");
        lecAdvanceSalaryField.setBounds(145,290,160,30);
        frame.add(lecAdvanceSalaryField);
        
        lblLecTeacherName = new JLabel("Teacher name:");
        frame.add(lblLecTeacherName);
        lblLecTeacherName.setBounds(10,340,150,30);
        lblLecTeacherName.setFont(lblLecClassesPerDay.getFont().deriveFont(16f));
        lecTeacherNameField = new JTextField("");
        lecTeacherNameField.setBounds(135,340,170,30);
        frame.add(lecTeacherNameField);
        
        lblLecTeacherNum = new JLabel("Teacher number:");
        frame.add(lblLecTeacherNum);
        lblLecTeacherNum.setBounds(415,290,150,30);
        lblLecTeacherNum.setFont(lblLecClassesPerDay.getFont().deriveFont(16f));
        lecTeacherNumField = new JTextField("");
        lecTeacherNumField.setBounds(550,290,160,30);
        frame.add(lecTeacherNumField);
        
        btnAppoint.addActionListener(this);
        frame.add(btnAppoint);
        btnAppoint.setBounds(600,390,110,30);
        
        btnDisplay.addActionListener(this);
        frame.add(btnDisplay);
        btnDisplay.setBounds(480,440,110,30);
        
        btnClear.addActionListener(this);
        frame.add(btnClear);
        btnClear.setBounds(600,440,110,30);
        
        btnTerminate.addActionListener(this);
        frame.add(btnTerminate);
        btnTerminate.setBounds(480,390,110,30);
        
    }
    
    public void tutor()
    {//method that has the labels, buttons and textfields for the tutor form
        JFrame frame = new JFrame("Teacher Appointment System");
        frame.setSize(800,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);
        
        lblTitle = new JLabel("Tutor");
        frame.add(lblTitle);
        lblTitle.setBounds(315,10,300,30);
        lblTitle.setFont(lblTitle.getFont().deriveFont(22f));
        
        lblTutSubject = new JLabel("Subject:");
        frame.add(lblTutSubject);
        lblTutSubject.setBounds(10,60,70,30);
        lblTutSubject.setFont(lblTutSubject.getFont().deriveFont(16f));
        tutSubjectField = new JTextField("");
        tutSubjectField.setBounds(100,60,205,30);
        frame.add(tutSubjectField);
        
        lblTutInterviewerName = new JLabel("Interviewer Name:");
        frame.add(lblTutInterviewerName);
        lblTutInterviewerName.setBounds(370,60,300,30);
        lblTutInterviewerName.setFont(lblTutInterviewerName.getFont().deriveFont(16f));
        tutInterviewerNameField = new JTextField("");
        tutInterviewerNameField.setBounds(510,60,200,30);
        frame.add(tutInterviewerNameField);
        
        lblTutClassesPerDay = new JLabel("Classes per day:");
        frame.add(lblTutClassesPerDay);
        lblTutClassesPerDay.setBounds(10,110,130,30);
        lblTutClassesPerDay.setFont(lblTutClassesPerDay.getFont().deriveFont(16f));
        tutClassesPerDayField = new JTextField("");
        tutClassesPerDayField.setBounds(155,110,150,30);
        frame.add(tutClassesPerDayField);
        
        lblTutSalary = new JLabel("Salary:");
        frame.add(lblTutSalary);
        lblTutSalary.setBounds(450,110,100,30);
        lblTutSalary.setFont(lblTutSalary.getFont().deriveFont(16f));
        tutSalaryField = new JTextField("");
        tutSalaryField.setBounds(510,110,200,30);
        frame.add(tutSalaryField);
        
        lblTutAppointedBy = new JLabel("Appointed by:");
        frame.add(lblTutAppointedBy);
        lblTutAppointedBy.setBounds(10,160,160,30);
        lblTutAppointedBy.setFont(lblTutAppointedBy.getFont().deriveFont(16f));
        tutAppointedByField = new JTextField("");
        tutAppointedByField.setBounds(175,160,130,30);
        frame.add(tutAppointedByField);
        
        lblTutTerminationDate = new JLabel("Termination Date:");
        frame.add(lblTutTerminationDate);
        lblTutTerminationDate.setBounds(370,160,150,30);
        lblTutTerminationDate.setFont(lblTutTerminationDate.getFont().deriveFont(16f));
        tutTerminationDateField = new JTextField("");
        tutTerminationDateField.setBounds(510,160,200,30);
        frame.add(tutTerminationDateField);
        
        
        frame.add(btnTutAdd);
        btnTutAdd.setBounds(560,200,150,30);
        btnTutAdd.addActionListener(this);
        
        lblTutAppointedDate = new JLabel("Appointed Date:");
        frame.add(lblTutAppointedDate);
        lblTutAppointedDate.setBounds(10,250,140,30);
        lblTutAppointedDate.setFont(lblTutAppointedDate.getFont().deriveFont(16f));
        tutAppointedDateField = new JTextField("");
        tutAppointedDateField.setBounds(145,260,160,30);
        frame.add(tutAppointedDateField);
        
        lblTutEvaluationPeriod = new JLabel("Evaluation Period:");
        frame.add(lblTutEvaluationPeriod);
        lblTutEvaluationPeriod.setBounds(370,260,160,30);
        lblTutEvaluationPeriod.setFont(lblTutEvaluationPeriod.getFont().deriveFont(16f));
        tutEvaluationPeriodField = new JTextField("");
        tutEvaluationPeriodField.setBounds(520,260,190,30);
        frame.add(tutEvaluationPeriodField);
        
        lblTutQualification = new JLabel("Qualification:");
        frame.add(lblTutQualification);
        lblTutQualification.setBounds(10,310,150,30);
        lblTutQualification.setFont(lblTutQualification.getFont().deriveFont(16f));
        tutQualificationField = new JTextField("");
        tutQualificationField.setBounds(135,310,170,30);
        frame.add(tutQualificationField);
        
        lblTutTeacherName = new JLabel("Teacher name:");
        frame.add(lblTutTeacherName);
        lblTutTeacherName.setBounds(390,310,140,30);
        lblTutTeacherName.setFont(lblTutTeacherName.getFont().deriveFont(16f));
        tutTeacherNameField = new JTextField("");
        tutTeacherNameField.setBounds(520,310,190,30);
        frame.add(tutTeacherNameField);
        
        lblTutTeacherNum = new JLabel("Teacher number:");
        frame.add(lblTutTeacherNum);
        lblTutTeacherNum.setBounds(10,360,160,30);
        lblTutTeacherNum.setFont(lblTutTeacherNum.getFont().deriveFont(16f));
        tutTeacherNumField = new JTextField("");
        tutTeacherNumField.setBounds(155,360,150,30);
        frame.add(tutTeacherNumField);
        
        btnTutAppoint.addActionListener(this);
        frame.add(btnTutAppoint);
        btnTutAppoint.setBounds(600,390,110,30);
        
        btnTutDisplay.addActionListener(this);
        frame.add(btnTutDisplay);
        btnTutDisplay.setBounds(480,440,110,30);
        
        btnTutClear.addActionListener(this);
        frame.add(btnTutClear);
        btnTutClear.setBounds(600,440,110,30);
       
    }
    public void actionPerformed (ActionEvent e) 
    {//method where the functionality of each button from all three frames is described
        if (e.getSource()==btnLecturer) {
            lecturer();         //this opens the lecturer form
        }
        else if(e.getSource()==btnTutor) {
            tutor();            //this opens the tutor form
        }
        
        
        else if (e.getSource() == btnClear) {       //this clears data from the textfields of the lecturer form
             lecSubjectField.setText("");
             lecInterviewerNameField.setText("");
             lecClassesPerDayField.setText("");
             lecSalaryField.setText("");
             lecDailyWorkingHourField.setText("");
             lecStartingFromField.setText("");
             lecAcademicBlockNumField.setText("");
             lecAdvanceSalaryField.setText("");
             lecTeacherNameField.setText(""); 
             lecTeacherNumField.setText("");
        }
        else if (e.getSource()==btnAdd) {           //to add the data entered in the lecturer form to an arraylist
             try{
                 //getting data from the textfields
                 String lecSubject = lecSubjectField.getText();
                 String lecInterviewer = lecInterviewerNameField.getText();
                 String lecClassesPerDay = lecClassesPerDayField.getText();
                 String lecSalary = lecSalaryField.getText();
                 String lecDailyWorkingHour = lecDailyWorkingHourField.getText();
                 
                 if (lecSubject.equals("") || lecInterviewer.equals("") || lecClassesPerDay.equals("") || lecSalary.equals("") || lecDailyWorkingHour.equals("")){
                    throw new NullPointerException();
                 }
                 
                 //converting data from the textfields to ineteger values
                 int convLecClassesPerDay = Integer.parseInt(lecClassesPerDay);
                 int convLecSalary = Integer.parseInt(lecSalary);
                 int convLecDailyWorkingHour = Integer.parseInt(lecDailyWorkingHour);
                 
                 if (convLecSalary < 0 || convLecClassesPerDay < 0 || convLecDailyWorkingHour < 0) {
                     throw new NumberFormatException();
                 }
                 
                 //adding to the ArrayList
                 Lecturer lecturer = new Lecturer(lecSubject,lecInterviewer,convLecClassesPerDay,convLecSalary,convLecDailyWorkingHour);
                 teachersList.add(lecturer);
                 
                 JOptionPane.showMessageDialog(null,"Added Successfully!");
             }
             catch(NullPointerException ex){    //to show error message when a field is left empty
                 JOptionPane.showMessageDialog(null,"Do not leave any field empty!", "Empty Field", JOptionPane.ERROR_MESSAGE);
             }
             
             catch(NumberFormatException ex){   //to show error message when a negative value in entered
                 JOptionPane.showMessageDialog(null,"Please enter a valid number!", "Invalid number",JOptionPane.ERROR_MESSAGE);
             }
        } 
        
        else if (e.getSource()==btnAppoint) {       //to appoint a lecturer
            //getting text from the textfields
            String startingFrom = lecStartingFromField.getText();
            String academicBlockNumber = lecAcademicBlockNumField.getText();
            String advanceSalary = lecAdvanceSalaryField.getText();
            String lecTeacherName = lecTeacherNameField.getText();
            String lecTeacherNum = lecTeacherNumField.getText();
            
            try{
                if(startingFrom.equals("") || academicBlockNumber.equals("") || advanceSalary.equals("") || lecTeacherName.equals("") || lecTeacherNum.equals("")) {
                    throw new NullPointerException();
                }
                
                //converting to integer values
                double convAdvanceSalary = Double.parseDouble(advanceSalary);
                int convLecTeacherNum = Integer.parseInt(lecTeacherNum);
                
                if(convAdvanceSalary < 0 || convLecTeacherNum < 0) {
                    throw new NumberFormatException();
                }
                
                if(convLecTeacherNum >= 0 && convLecTeacherNum < teachersList.size()) {     //checking if the value is in the ArrayList
                    if(teachersList.get(convLecTeacherNum) instanceof Lecturer) {           //checking if the value is an instance of Lecturer class
                        Lecturer lect = (Lecturer)teachersList.get(convLecTeacherNum);
                        if(lect.getJoined() == false) {
                            lect.appointLecturer(lecTeacherName, startingFrom, convAdvanceSalary,academicBlockNumber);      //passing parameters to the appointLecturer method in Lecturer class
                            JOptionPane.showMessageDialog(null,"Appointed successfully!");
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"Already Appointed!","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Not an object of Lecturer!","Error!!!",JOptionPane.ERROR_MESSAGE);
                    }
                }
                  
            }
            catch(NullPointerException ex){
                JOptionPane.showMessageDialog(null,"Do not leave any field empty!", "Empty Field", JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Please enter the correct format!", "Wrong number format", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else if (e.getSource()==btnDisplay) {    //to display the values that have been entered and stored           
            if(teachersList.size() > 0) {           //checking if the ArrayList is empty or not
                for (Teacher value: teachersList) {
                    if (value instanceof Lecturer) {
                        Lecturer lecturer = (Lecturer) value;
                        lecturer.display();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No data to display");
                    }
                }
            }
        }
        else if (e.getSource()==btnTerminate) {         //to terminate lecturer
            //getting value from textfield
            String lectTeacherNum = lecTeacherNumField.getText();
            
            try{
                if(lectTeacherNum==("")) {
                    throw new NullPointerException();
                }
                
                //converting to integer value
                int convLectTeacherNum = Integer.parseInt(lectTeacherNum);
                
                if(convLectTeacherNum < 0) {
                    throw new NumberFormatException();
                }
                
                if(convLectTeacherNum >=0 && convLectTeacherNum < teachersList.size()) {
                    if(teachersList.get(convLectTeacherNum) instanceof Lecturer) {
                        Lecturer lec = (Lecturer)teachersList.get(convLectTeacherNum);      //getting data from ArrayList
                        if(lec.getTerminated()==false) {
                            lec.lectureTermination();
                            JOptionPane.showMessageDialog(null, "Terminated");
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"Already Terminated!", "Duplication Error",JOptionPane.ERROR_MESSAGE); 
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Invalid!", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                }   
            }
            catch(NullPointerException ex){
                JOptionPane.showMessageDialog(null,"Textfield empty!","Error",JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Enter a valid number!", "Number Format Error",JOptionPane.ERROR_MESSAGE);
            }
        }
      
        
        else if (e.getSource()==btnTutClear) {      //clearing data from textfields in tutor form
             tutSubjectField.setText("");
             tutInterviewerNameField.setText("");
             tutClassesPerDayField.setText("");
             tutSalaryField.setText("");
             tutAppointedByField.setText("");
             tutTerminationDateField.setText("");
             tutAppointedDateField.setText("");
             tutEvaluationPeriodField.setText("");
             tutQualificationField.setText("");
             tutTeacherNameField.setText("");
             tutTeacherNumField.setText("");
        }
        else if (e.getSource()==btnTutAdd) {        //adding data from tutor form to ArrayList
             try
             {
                 //getting values from textfields
                 String tutSubject = tutSubjectField.getText();
                 String tutInterviewer = tutInterviewerNameField.getText();
                 String tutClassesPerDay = tutClassesPerDayField.getText();
                 String tutSalary = tutSalaryField.getText();
                 String tutAppointedBy = tutAppointedByField.getText();
                 String tutTerminationDate = tutTerminationDateField.getText();
                 
                 if (tutSubject.equals("") || tutInterviewer.equals("") || tutClassesPerDay.equals("") || tutSalary.equals("") || tutAppointedBy.equals("") || tutTerminationDate.equals("")){
                    throw new NullPointerException();
                 }
                 
                 //converting to integer values
                 int convTutClassesPerDay = Integer.parseInt(tutClassesPerDay);
                 int convTutSalary = Integer.parseInt(tutSalary);
                 
                 if (convTutSalary < 0 || convTutClassesPerDay < 0) {
                     throw new NumberFormatException();
                 }
                 
                 JOptionPane.showMessageDialog(null,"Added Successfully!");
                 
                 //adding to ArrayList
                 Tutor tutor = new Tutor(tutSubject,tutInterviewer,convTutClassesPerDay,convTutSalary,tutAppointedBy,tutTerminationDate);
                 teachersList.add(tutor);
             }
             catch(NullPointerException ex){//to show error message when a field is left empty
                 JOptionPane.showMessageDialog(null,"Do not leave any field empty!", "Empty Field", JOptionPane.ERROR_MESSAGE);
             }
             
             catch(NumberFormatException ex){//to show error message when a negative value in entered
                 JOptionPane.showMessageDialog(null,"Please enter a valid number!", "Invalid number",JOptionPane.ERROR_MESSAGE);
             }
        }
        else if (e.getSource()==btnTutAppoint) {           //to appoint a tutor
            //getting values from the textfield
            String appointedDate = tutAppointedDateField.getText();
            String evaluationPeriod = tutEvaluationPeriodField.getText();
            String terminationDate = tutTerminationDateField.getText();
            String tutTeacherName = tutTeacherNameField.getText();
            String tutTeacherNum = tutTeacherNumField.getText();
            String qualification = tutQualificationField.getText();
            
            try{
                if(appointedDate.equals("") || evaluationPeriod.equals("") || terminationDate.equals("") || tutTeacherName.equals("") || tutTeacherNum.equals("") || qualification.equals(""))
                {
                    throw new NullPointerException();
                }
                
                //converting to integer values
                int convTutTeacherNum = Integer.parseInt(tutTeacherNum);
                
                if(convTutTeacherNum < 0) {
                    throw new NumberFormatException();
                }
                
                if(convTutTeacherNum >= 0 && convTutTeacherNum < teachersList.size()) {       
                    if(teachersList.get(convTutTeacherNum) instanceof Tutor) {          //checking if the entered value is an object of Tutor class
                        Tutor tutor = (Tutor)teachersList.get(convTutTeacherNum);
                        if(tutor.getJoined() == false) {
                            tutor.appointTutor(tutTeacherName, appointedDate, terminationDate,qualification); //passing parameters to the appointTutor method in Tutor class
                            JOptionPane.showMessageDialog(null,"Appointed successfully!");
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"Already Appointed!","Duplication Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Not an object of Tutor!","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                  
            }
            catch(NullPointerException ex){
                JOptionPane.showMessageDialog(null,"Do not leave any field empty!", "Empty Field", JOptionPane.ERROR_MESSAGE);
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Please enter a valid number!", "Wrong number format", JOptionPane.ERROR_MESSAGE);
            }
        }   
        
        else if(e.getSource()==btnTutDisplay) {         //to display all entered values
            if(teachersList.size() > 0) {
                for (Teacher value: teachersList) {
                    if (value instanceof Tutor) {
                        Tutor tutor = (Tutor) value;
                        tutor.display();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "No data to display");
                    }
                }
            }
        }
    }
    public static void main()
    {//main method to call the mainFrame() method
        new InformaticCollege().mainFrame();
    }
}   