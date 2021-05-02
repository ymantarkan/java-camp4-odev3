/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

import Entitiies.Campaign;
import Interfaces.CampaignService;

/**
 *
 * @author Tarkan Yaman
 */
public class CampaignManager implements CampaignService{

    @Override
    public void add(Campaign campaign) {
        System.out.println("Kampanya veri tabanına başarılı bir şekilde eklendi.");
    }

    @Override
    public void delete(Campaign campaign) {
        
        System.out.println(campaign.getName()+"kampanyası veri tabanından silindi!!");
       
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya güncelleme işlemi başarılı bir şekilde gerçekleşti....");
        
    }
    
}
