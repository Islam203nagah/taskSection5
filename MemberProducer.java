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
public class MemberProducer {
    public static AbstractMember GetDepartement (String Department  )
    {
        if(Department.toUpperCase()==null)
            return null;
        else switch(Department.toUpperCase()) {
		case"CS":return new MemeberFactoryCS() ;
		case"IS":return new MemberFactoryIS();
                default:return null;
		
        
                }
        
    }
}