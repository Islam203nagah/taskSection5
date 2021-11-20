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
public class MemeberFactoryCS extends AbstractMember{
    @Override
    public Staff GetMember (String TypeOfMember)
    {
        if(null == TypeOfMember.toUpperCase())
            return null;
        else switch (TypeOfMember.toUpperCase()) {
            case "DOCTOR CS":
                return new DoctorCS();
            case "TEACHING ASSISTANT CS":
                return new TeachingAssistantCS();
            default:
                return null;
        }
        
            
        
    }
}
