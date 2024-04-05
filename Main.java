/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

/**
 *
 * @author RC_Student_lab
 */
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        Learner learner = new Learner();
        getLearnerInput(learner);
        displayFinalMark(learner);
    }
    
    public static void getLearnerInput(Learner learner){
        learner.setFullName(JOptionPane.showInputDialog("Enter the learner's full name: "));
         
        learner.setSubject(JOptionPane.showInputDialog("Enter the learner's subject: "));
        
        learner.setAssignmentMark(Double.parseDouble(JOptionPane.showInputDialog("Enter the learner's subject: ")));
        
        learner.setTestMark(Double.parseDouble(JOptionPane.showInputDialog("Enter the learner's test mark: ")));
        
        learner.setExamMark(Double.parseDouble(JOptionPane.showInputDialog("Enter the learner's exam mark: ")));
    }
    public static void displayFinalMark(Learner learner){
        JOptionPane.showMessageDialog(null,"The final mark for" + learner.getFullName() + "in" + learner.getSubject() + "is" + learner.calcFinalMark());
    }
}