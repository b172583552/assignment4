public class HandTester {
    public static CardGamePlayer p1 = new CardGamePlayer("1P");
    public static CardGamePlayer p2 = new CardGamePlayer("2P");
    public static void main(String[] args) {
       
        CardList cards1, cards2;

        cards1 = new CardList();
        cards1.addCard(new BigTwoCard(2, 1));
        cards1.addCard(new BigTwoCard(2, 0));
        cards1.addCard(new BigTwoCard(2, 12));
        cards1.addCard(new BigTwoCard(2, 11));
        cards1.addCard(new BigTwoCard(2, 10));
        Hand h1= new StraightFlush(p1, cards1);
        System.out.println("1P plays " + h1.getType() + " :");
        cards1.print();
        h1.print();
        
        cards2 = new CardList();
        cards2.addCard(new BigTwoCard(3, 3));
        cards2.addCard(new BigTwoCard(3, 4));
        cards2.addCard(new BigTwoCard(3, 5));
        cards2.addCard(new BigTwoCard(3, 6));
        cards2.addCard(new BigTwoCard(3, 7));
        Hand h2 = new StraightFlush(p2, cards2);
        System.out.println("2P plays " + h2.getType() + " :");
        cards2.print();
        h2.print();
        
        System.out.println(h1.isValid());
        System.out.println(h2.isValid());
        System.out.println(h1.getTopCard());
        System.out.println(h2.getTopCard());	
        
        if (h1.beats(h2)) {
        	System.out.println("1P beat");
        }
        else {
        	System.out.println("1P do not beat");
        }
        
        System.out.println(cards1.getCard(0).compareTo(cards2.getCard(0)));
        
    }
}