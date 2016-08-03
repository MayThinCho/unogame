/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoapp;

import Model.Player;
import Model.Unodeck;
import Model.Unogame;
import java.util.ArrayList; 
/**
 *
 * @author May Thin Cho
 */
public class UnoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // UnoApp uApp = new UnoApp();
        Unodeck uDeck = new Unodeck();
        Unogame uGame;
        
        Player p1 = new Player("id0001", "MayThinCho");
        Player p2 = new Player("id0002", "EiSanDarPhyo");
        Player p3 = new Player("id0003", "WyinePyiSone");
        Player p4 = new Player("id0004", "YaminAye");
        Player p5 = new Player("id0005", "MonZin");
        
        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p3);
        playerList.add(p4);
        playerList.add(p5);
        
        String gameID = "g001";
        String gameStatus = "Waiting";
        
        uGame = new Unogame(gameID, playerList, gameStatus, uDeck);
        
        uGame.startPlay();
        
       // uDeck = uGame.ShuffleDeck(uDeck.addDeck());
        //System.err.println(uDeck);
        
        System.out.println(uGame);
        
    }
    
}
