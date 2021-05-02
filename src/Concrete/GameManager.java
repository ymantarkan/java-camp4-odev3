/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

import Entitiies.Game;
import Interfaces.GameService;

/**
 *
 * @author Tarkan Yaman
 */
public class GameManager implements GameService{

    @Override
    public void add(Game game) {
        System.out.println(game.getName()+"oyunu veri tabanına kaydedildi..");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName()+"oyunu veri tabanından silindi");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName()+"oyununun fiyatı"+ game.getPrice()+"olarak güncellendi...");
    }
    
}
