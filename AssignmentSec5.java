/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsec5;

/**
 *
 * @author Islam
 */
public class AssignmentSec5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      AbstractMember CSam= MemberProducer.GetDepartement("CS") ;
      Staff CSsttafDR = CSam.GetMember("doctor cs");
      Staff CSstfTS = CSam.GetMember("teaching assistant cs");
      CSsttafDR.getSallary();
      CSstfTS.getSallary();
      AbstractMember ISam= MemberProducer.GetDepartement("is") ;
      Staff ISstafDR = ISam.GetMember("doctor is");
      Staff ISstafTS = ISam.GetMember("teaching assistant is");
      ISstafDR.getSallary();
      ISstafTS.getSallary();
    }
    
}
