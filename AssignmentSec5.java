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
     //       MemeberFactory memef = new MemeberFactory();
//       String MemeName="doctor";
//       String MemName2="teaching Assistant"; 
//       Staff stff = memef.getMember(MemeName);
//       stff.getSallary();
//       stff.getYearsOfWork();
//       
//       Staff stff2 = memef.getMember(MemName2);
//       stff2.getSallary();
//       stff2.getYearsOfWork();
AbstractMember CSam= memberProducer.GetDepartment("CS") ;
		Staff CSstfDR = CSam.GetMember("Doctor");
		Staff CSstfTS = CSam.GetMember("teaching assistant");
		CSstfDR.getSallary();
		CSstfTS.getSallary();
		AbstractMember ISam= MemberProducer.GetDepartment("is") ;
		Staff ISstfDR = ISam.GetMember("Doctor");
		Staff ISstfTS = ISam.GetMember("teaching assistant");
		ISstfDR.getSallary();
		ISstfTS.getSallary();
    }
    
}
