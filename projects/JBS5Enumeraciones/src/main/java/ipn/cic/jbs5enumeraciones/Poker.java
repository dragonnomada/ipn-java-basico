package ipn.cic.jbs5enumeraciones;

enum PokerNumber {
    Ace,
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Joker,
    Queen,
    King,
    Unknown;
    
    public static PokerNumber getByNumber(int number) {
        switch(number) {
            case 1: return PokerNumber.Ace;
            default: return PokerNumber.Unknown;
        }
    }
    
    public static PokerNumber getByName(String name) {
        switch(name.toLowerCase()) {
            case "ace":
            case "one": return PokerNumber.Ace;
            case "two": return PokerNumber.Two;
            default: return PokerNumber.Unknown;
        }
    }
}

enum PokerType {
    Heart,
    Diamond,
    Club,
    Spade
}

public class Poker {
    
}
