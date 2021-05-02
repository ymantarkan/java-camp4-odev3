
import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Concrete.UserValidationManager;
import Entitiies.Campaign;
import Entitiies.Game;
import Entitiies.Gamer;
import Interfaces.EntityService;







public class Main {
    public static void main(String[] args) {
      Gamer gamer =new Gamer(1, "Tarkan","Yaman",1998 ,1234540 );
      Game game=new Game(1, "FIFA21", 600);
      Campaign campaign=new Campaign(1, "%12 indirim", 50);
      
      EntityService entityservice=new Campaign(1, "%12 indirim", 50);
      
      
      UserValidationManager userValidationManager=new UserValidationManager();
      GamerManager gamerManager=new GamerManager(userValidationManager);
      CampaignManager campaignManager=new CampaignManager();
      
       SalesManager salesManager=new SalesManager();
      
      
      gamerManager.add(gamer);
        System.out.println("********************************");
     gamerManager.delete(gamer);
       System.out.println("********************************");
     campaignManager.add(campaign);
       System.out.println("********************************");
     campaignManager.delete(campaign);
       System.out.println("********************************");
         
      salesManager.sales(gamer, game, campaign);
    
      //Doğrulama işlel
      GamerManager gamemanager=new GamerManager(userValidationManager);
      
    
        
    }
    
}
