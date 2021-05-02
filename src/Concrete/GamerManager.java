
package Concrete;

import Entitiies.Gamer;
import Interfaces.GamerService;
import Interfaces.UserValidationService;


public class GamerManager  implements GamerService{
    
    //Ekleme işlemini yapmak için kullanıcının bilgilerinin doğrulanması gerekiyor
    //Bu işlem  için bizim yazdığım UserValidationService aracılığıyla yapmamız gerekiyor
    
    
    
   UserValidationService uservalidationservice;

    public GamerManager(UserValidationService uservalidationservice) {
        this.uservalidationservice = uservalidationservice;
    }
    
   
    @Override
    public void add(Gamer gamer) {
        
        if(uservalidationservice.validate(gamer)){
            System.out.println("Veri tabanına kayıt etme işlemi başarılı bir şekilde yapıldı...");
        }
        else{
            System.out.println("Kullanıcı bilgileri doğrulanamdı kayıt işlemi başarısız");
        }
        
       
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Kayıt silme işlemi başarılı bir şekilde yapıldı...");
        
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Kayıt güncelleme işlemi başarılı bir şekilde yapıldı...");
        
    }
    
}
