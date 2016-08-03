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
public class UNOcard {
    
    private String cardColor; 
    private String cardType;
    private int cardScore;
    private String cardImage;
    
    public UNOcard(){
        
    }

    public UNOcard(String cardColor, String cardType, int cardScore, String cardImage) {
        this.cardColor = cardColor;
        this.cardType = cardType;
        this.cardScore = cardScore;
        this.cardImage = cardImage;
    }

    
    
    /**
     * @return the cardColor
     */
    public String getCardColor() {
        return cardColor;
    }

    /**
     * @param cardColor the cardColor to set
     */
    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    /**
     * @return the cardType
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * @return the cardScore
     */
    public int getCardScore() {
        return cardScore;
    }

    /**
     * @param cardScore the cardScore to set
     */
    public void setCardScore(int cardScore) {
        this.cardScore = cardScore;
    }

    /**
     * @return the cardImage
     */
    public String getCardImage() {
        return cardImage;
    }

    /**
     * @param cardImage the cardImage to set
     */
    public void setCardImage(String cardImage) {
        this.cardImage = cardImage;
    }

    @Override
    public String toString() {
        return "UNOcard:" + "cardColor=" + cardColor + ", cardType=" + cardType + ", cardScore=" + cardScore + ", cardImage=" + cardImage + "\n\t\t\t";
    }
    
    
    
    
    
}
