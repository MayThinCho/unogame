/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author e0015785
 */
public class Player {
    
    private String id;
    private String name;
    //private String [] cardHold ; 
    private ArrayList<UNOcard> cardHold = new ArrayList<UNOcard>();

    public Player(){
        
    }
    
    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    

   
      /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    
    
    /**
     * @return the cardHold
     */
    public ArrayList<UNOcard> getCardHold() {
        return cardHold;
    }

    /**
     * @param cardHold the cardHold to set
     */
    public void setCardHold(ArrayList<UNOcard> cardHold) {
        this.cardHold = cardHold;
    }

    public void setCardToHand(UNOcard udC){
        this.cardHold.add(udC);
    }
    
    
    /*
    public void removeCard(UNOcard udc){
        for(int i=0; i< getCardHold().size(); i++){
            if(getCardHold().get(i) == udc){
                getCardHold().remove(i);
                break;
            }
        }
    }

  */
    
    
  
      
      
  public void getCardFromHand(int i){
      this.cardHold.remove(i);
  }

    @Override
    public String toString() {
        return "Player:" + "id=" + id + ", name=" + name + ", \n\t\tCards in hand:\n\t\t\t" + cardHold + "\n\t" ;
    }

    
  
}
