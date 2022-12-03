//created by Cece, Derek, Rashaan, , and Nathan



import java.util.*;

public class Card {
    private String faceName, suitName;

    public Card(String faceName, String suitName) {
        setFaceName(faceName);
        setSuitName(suitName);
    }

    public String getFaceName() {
        return faceName;
    }

    public static List<String> getValidFaceNames() {//lists the card types there are
        return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace");
    }

    public void setFaceName(String faceName) {//gets face name
        List<String> validFaceNames = getValidFaceNames();
        if (validFaceNames.contains(faceName.toLowerCase())) {
            this.faceName = faceName;
        } else {//says not valid face naeme
            throw new IllegalArgumentException("Valid face names are " + validFaceNames);
        }
    }

    public String getSuitName() {
        return suitName;
    }

    public static List<String> getValidSuitNames() {//this is the valid suit name list
        return Arrays.asList("clubs", "diamonds", "hearts", "spades");
    }

    public void setSuitName(String suitName) {//finds card
        List<String> validSuitNames = getValidSuitNames();
        if (validSuitNames.contains(suitName.toLowerCase())) {
            this.suitName = suitName;
        } else {//this says you inputted the wrong suit name
            throw new IllegalArgumentException("Valid suit names are " + validSuitNames);
        }
    }

    public String toString() {//lists card name
        return String.format("%s of %s", faceName, suitName);
    }
}