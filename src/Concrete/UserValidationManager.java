/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

import Entitiies.Gamer;
import Interfaces.UserValidationService;

/**
 *
 * @author Tarkan Yaman
 */
public class UserValidationManager implements UserValidationService{

    @Override
    public boolean validate(Gamer gamer) {
        if(gamer.getFirstName()=="Tarkan"&&
                gamer.getId()==1&&
                gamer.getBirthYear()==1998 &&
               
                gamer.getIdentityNumber()==1234540&&
                gamer.getLastName()=="Yaman")
        {
                return true;
        }
        return false;
    
    }
   
    
}
