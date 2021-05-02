
package Concrete;

import Entitiies.Campaign;
import Entitiies.Game;
import Entitiies.Gamer;
import Interfaces.SalesService;

public class SalesManager implements SalesService{

    @Override
    public void sales(Gamer gamer, Game game, Campaign campaign) {
        double amount=game.getPrice();
        if(campaign!=null){
            amount=amount-campaign.getDiscountAmount();
        }
        
        System.out.println(
                game.getName()+"\toyunu"+" " +gamer.getFirstName()+"\tadlı kişiye"+" "+
                campaign.getDiscountAmount()+"\tindirim ile"+" " + amount+"\tfiyata satılmıştır"
        );
    }
    
}
