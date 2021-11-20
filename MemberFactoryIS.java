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
public class MemberFactoryIS  extends AbstractMember{

    @Override
    Staff GetMember(String typeOfMember) {
        if(null == typeOfMember.toUpperCase())
            return null;
        else switch (typeOfMember.toUpperCase()) {
            case "DOCTOR IS":
                return new DoctorIS();
            case "TEACHING ASSISTANT IS":
                return new TeachingAssistantIS();
            default:
                return null;
    }
    
}
}
