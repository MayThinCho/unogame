/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author e0015785
 */

import java.util.ArrayList;
import java.util.Collections;

public class Unogame {
    
    private String gameID;
    private ArrayList<Player> playerList ;
    private String gameStatus; 
    private Unodeck unoDeck; 
    //private ArrayList<String> disPile = new ArrayList<String>();
      private UNOcard disPile;

    public Unogame(String gameID, ArrayList<Player> playerList, String gameStatus, Unodeck unoDeck) {
        this.gameID = gameID;
        this.playerList = playerList;
        this.gameStatus = gameStatus;
        this.unoDeck = unoDeck;
    }

   

    

   
      
    
    /**
     * @return the gameID
     */
    public String getGameID() {
        return gameID;
    }

    /**
     * @param gameID the gameID to set
     */
    public void setGameID(String gameID) {
        this.gameID = gameID;
    }

    /**
     * @return the playerList
     */
    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    /**
     * @param playerList the playerList to set
     */
    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    /**
     * @return the gameStatus
     */
    public String getGameStatus() {
        return gameStatus;
    }

       /**
     * @return the unoDeck
     */
    public Unodeck getUnoDeck() {
        return unoDeck;
    }

    /**
     * @param unoDeck the unoDeck to set
     */
    public void setUnoDeck(Unodeck unoDeck) {
        this.unoDeck = unoDeck;
    }
    
    /**
     * @param gameStatus the gameStatus to set
     */
    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

   
    
    public void setPlayer(Player player){
        this.playerList.add(player);
    }
    
    public void getPlayer(){
        
    }
    
    

      /**
     * @return the disPile
     */
    public UNOcard getDisPile() {
        return disPile;
    }

    /**
     * @param disPile the disPile to set
     */
    public void setDisPile(UNOcard disPile) {
        this.disPile = disPile;
    }
     
    
     public Unodeck ShuffleDeck(Unodeck udDeck)
     {
         Collections.shuffle(udDeck.getDeck());
         return udDeck;
     }
 
     public void startPlay(){
         unoDeck = this.ShuffleDeck(unoDeck.addDeck());
         
         int count = 1; 
         while(count <=7){
             for(Player player : playerList){
                 UNOcard handCard = unoDeck.getCardFromDeck();
                 player.setCardToHand(handCard);
             }
             
             count++;
         }
         disPile = unoDeck.getCardFromDeck();
     }
    
    
    /* public void takeCard(){
        Unodeck ud = new Unodeck();
         ud.takeCard();
    }
     
      public void takeCardPile(String disCard){
         for(int i=0; i< disPile.size(); i++){
             if(disPile.get(i) ==  disCard){
                 disPile.remove(i);
             }
         }
     }
      
      public void disCardPile(String disCard){
         disPile.add(disCard);
     }
*/

    @Override
    public String toString() {
        return "Game ID=" + gameID + "\nDiscard Card=" + disPile + "\nGameStatus=" + gameStatus + "\n" + unoDeck + "\n\t" + playerList;
    }

 

   
}
