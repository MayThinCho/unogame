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
public class Unodeck {
    
  
    
    private final int numOfCard = 108;
    private ArrayList<UNOcard> deck = new ArrayList<UNOcard>();

   
    public Unodeck(){
        
    }
      
   /**
     * @return the deck
     */
    public ArrayList<UNOcard> getDeck() {
        return deck;
    }

    /**
     * @param deck the deck to set
     */
    public void setDeck(ArrayList<UNOcard> deck) {
        this.deck = deck;
    }
    
    public void setCardToDeck(UNOcard und){
        this.getDeck().add(und);
    }
    
    public UNOcard getCardFromDeck(){
        return this.getDeck().remove(0);
    }
    
    public Unodeck addDeck(){
        String color[] = {"Red", "Yellow", "Green", "Blue", "RYGB"};
        String type[] = {"Normal","Skip","Reverse","Draw2","Wild", "WildDrawFour"};
        
        UNOcard ucard;
        Unodeck udeck = new Unodeck();
        
        for(int c=0; c< color.length; c++){
            int typeIndex = 0;
            
            for(int num=0; num <=12; num++){
                int value = num;
                
                if(num >9){
                    typeIndex++;
                    value=20;
                }
                
                if(c !=4){
                    ucard = new UNOcard(color[c], type[typeIndex], value, color[c]+type[0]+value);
                    udeck.setCardToDeck(ucard);
                    
                    if(num !=0)
                        udeck.setCardToDeck(ucard);
                    
                }
            }
            
            if(c ==4){
                int count = 1;
                while(count <=4){
                    
                    for(int i=4; i < type.length; i++){
                        ucard = new UNOcard(color[c], type[i], 50, color[c]+type[i]+50);
                        udeck.setCardToDeck(ucard);
                    }
                    
                    count++;
                }
            }
        }
        
        return udeck;
    }
    
    //public void takeCard(){
       // numOfCard -=1;
    //}

    @Override
    public String toString() {
        return "UnoCard on Deck: " + getDeck().size()+"\n"+deck;
    }

    

    
    
    
    
}
