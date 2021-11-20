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
public class MemeberFactory {
    public Staff getMember (String TypeOfStaff)
    {
        if(null == TypeOfStaff.toUpperCase())
            return null;
        else switch (TypeOfStaff.toUpperCase()) {
            case "DOCTOR":
                return new Doctor();
            case "TEACHING ASSISTANT":
                return new TeachingAssistant();
            default:
                return null;
        }
        
            
        
    }
}
