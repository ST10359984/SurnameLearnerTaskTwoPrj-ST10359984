/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rc;

/**
 *
 * @author RC_Student_lab
 */
public class Learner{
    //attributes
    private String fullName;
    private String subject;
    private double assignmentMark;
    private double testMark;
    private double examMark;
    
    //constructor
    public Learner(){
        this.fullName="Unknown";
        this.subject="Unknown";
        this.assignmentMark=0.0;
        this.testMark=0.0;
                this.testMark=0.0;
    }
    
    //getters
    public String getFullName(){
        return fullName;
    }
    public String getSubject(){
        return subject;
    }
    public double getAssignmentMark(){
        return assignmentMark;
    }
    public double getTestMark(){
        return testMark;
    }
    public double getExamMark(){
        return examMark;
    }
    
    //settes
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    
    public void setSubject(String subject){
        this.subject=subject;
    }
    public void setAssignmentMark(double assignmentMark){
        this.assignmentMark=assignmentMark;
    }
    public void setTestMark(double testMark){
        this.testMark=testMark;
    }
    public void setExamMark(double examMark){
        this.examMark=examMark;
    }
    
    //method to calculate the final mark
    public double calcFinalMark(){
        return (assignmentMark + testMark + examMark)/3;
    }
}




