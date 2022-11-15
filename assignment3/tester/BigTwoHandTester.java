
public class BigTwoHandTester {
	
	private static CardGamePlayer p1=new CardGamePlayer("1p");
	private static CardGamePlayer p2=new CardGamePlayer("2p");
	
	
	public static void main(String[] args) {
		///Pair
		CardList cards1,cards2;
		
		
		cards1=new CardList();
		cards1.addCard(new BigTwoCard(0,2));
		cards1.addCard(new BigTwoCard(1,2));
		Hand h1=new Pair(p1,cards1);
		System.out.println("1p plays"+h1.getType()+":");
		cards1.print();
		System.out.println("1p's top card:"+h1.getTopCard());
		System.out.println("1p plays is valid?"+h1.isValid());
		System.out.println("............................");
		
		cards2=new CardList();
		//cards2.addCard(new BigTwoCard(3,1));
		//cards2.addCard(new BigTwoCard(2,1));
		Hand h2=new Pair(p2,cards2);
		System.out.println("2p plays"+h2.getType()+":");
		cards2.print();
		System.out.println("2p's top card:"+h2.getTopCard());
		System.out.println("2p plays is valid?"+h2.isValid());
		System.out.println("............................");
		
		
		if (h1.beats(h2)) {
			System.out.println("1p wins");
			
		}
		else {
			System.out.println("1p doesn't beat 2p");
		}
		System.out.println("............................");
		
		
		///Single
		CardList cards3,cards4;
		
		
		cards3=new CardList();
		cards3.addCard(new BigTwoCard(2,5));
		Hand h3=new Single(p1,cards3);
		System.out.println("1p plays"+h3.getType()+":");
		cards3.print();
		System.out.println("1p's top card:"+h3.getTopCard());
		System.out.println("1p plays is valid?"+h3.isValid());
		System.out.println("............................");
		
		cards4=new CardList();
		//cards4.addCard(new BigTwoCard(0,7));
		Hand h4=new Single(p2,cards4);
		System.out.println("2p plays"+h4.getType()+":");
		cards4.print();
		System.out.println("2p's top card:"+h4.getTopCard());
		System.out.println("2p plays is valid?"+h4.isValid());
		System.out.println("............................");
		
		
		if (h3.beats(h4)) {
			System.out.println("1p wins");
			
		}
		else {
			System.out.println("1p doesn't beat 2p");
		}
		System.out.println("............................");
		
		
		
		///Triple
		CardList cards5,cards6;
		
		
		cards5=new CardList();
		cards5.addCard(new BigTwoCard(2,1));
		cards5.addCard(new BigTwoCard(0,1));
		cards5.addCard(new BigTwoCard(3,1));
		Hand h5=new Triple(p1,cards5);
		System.out.println("1p plays"+h5.getType()+":");
		cards5.print();
		System.out.println("1p's top card:"+h5.getTopCard());
		System.out.println("1p plays is valid?"+h5.isValid());
		System.out.println("............................");
		
		cards6=new CardList();
		//cards6.addCard(new BigTwoCard(0,5));
		//cards6.addCard(new BigTwoCard(3,5));
		//cards6.addCard(new BigTwoCard(1,5));
		Hand h6=new Triple(p2,cards6);
		System.out.println("2p plays"+h6.getType()+":");
		cards6.print();
		System.out.println("2p's top card:"+h6.getTopCard());
		System.out.println("2p plays is valid?"+h6.isValid());
		System.out.println("............................");
		
		
		if (h5.beats(h6)) {
			System.out.println("1p wins");
			
		}
		else {
			System.out.println("1p doesn't beat 2p");
		}
		System.out.println("............................");	
		
		
		///Straight
		CardList cards7,cards8;
		
		
		cards7=new CardList();
		cards7.addCard(new BigTwoCard(1,10));
		cards7.addCard(new BigTwoCard(0,0));
		cards7.addCard(new BigTwoCard(1,1));
		cards7.addCard(new BigTwoCard(2,12));
		cards7.addCard(new BigTwoCard(2,11));
		Hand h7=new Straight(p1,cards7);
		System.out.println("1p plays"+h7.getType()+":");
		cards7.print();
		System.out.println("1p's top card:"+h7.getTopCard());
		System.out.println("1p plays is valid?"+h7.isValid());
		System.out.println("............................");
		
		cards8=new CardList();
		//cards8.addCard(new BigTwoCard(0,10));
		//cards8.addCard(new BigTwoCard(3,0));
		//cards8.addCard(new BigTwoCard(1,12));
		//cards8.addCard(new BigTwoCard(1,11));
		//cards8.addCard(new BigTwoCard(2,1));
		Hand h8=new Straight(p2,cards8);
		System.out.println("2p plays"+h8.getType()+":");
		cards8.print();
		System.out.println("2p's top card:"+h8.getTopCard());
		System.out.println("2p plays is valid?"+h8.isValid());
		System.out.println("............................");
		
		
		if (h7.beats(h8)) {
			System.out.println("1p wins");
			
		}
		else {
			System.out.println("1p doesn't beat 2p");
		}
		System.out.println("............................");	
		
		
		
		///Flush
		CardList cards9,cards10;
		
		//9 valid flush
		cards9=new CardList();
		cards9.addCard(new BigTwoCard(1,10));
		cards9.addCard(new BigTwoCard(1,9));
		cards9.addCard(new BigTwoCard(1,3));
		cards9.addCard(new BigTwoCard(1,7));
		cards9.addCard(new BigTwoCard(1,5));
		Hand h9=new Flush(p1,cards9);
		System.out.println("1p plays"+h9.getType()+":");
		cards9.print();
		System.out.println("1p's top card:"+h9.getTopCard());
		System.out.println("1p plays is valid?"+h9.isValid());
		System.out.println("............................");
		//10 invalid flush->valid flush->valid straight
		cards10=new CardList();
		//cards10.addCard(new BigTwoCard(2,5));
		//cards10.addCard(new BigTwoCard(2,3));
		//cards10.addCard(new BigTwoCard(2,9));
		//cards10.addCard(new BigTwoCard(2,6));
		//cards10.addCard(new BigTwoCard(2,4));
		Hand h10=new Flush(p2,cards10);
		System.out.println("2p plays"+h10.getType()+":");
		cards10.print();
		System.out.println("2p's top card:"+h10.getTopCard());
		System.out.println("2p plays is valid?"+h10.isValid());
		System.out.println("............................");
		
		
		if (h9.beats(h10)) {
			System.out.println("1p wins");
			
		}
		else {
			System.out.println("1p doesn't beat 2p");
		}
		System.out.println("............................");	
		
		
		if (h10.beats(h9)) {
			System.out.println("2p wins");
			
		}
		else {
			System.out.println("2p doesn't beat 1p");
		}
		System.out.println("............................");	
		
		
		
		///FullHouse
		CardList cards11,cards12;
		
		//11 valid fullhouse
		cards11=new CardList();
		cards11.addCard(new BigTwoCard(3,10));
		cards11.addCard(new BigTwoCard(2,10));
		cards11.addCard(new BigTwoCard(1,3));
		cards11.addCard(new BigTwoCard(0,10));
		cards11.addCard(new BigTwoCard(2,3));
		Hand h11=new FullHouse(p1,cards11);
		System.out.println("1p plays"+h11.getType()+":");
		cards11.print();
		System.out.println("1p's top card:"+h11.getTopCard());
		System.out.println("1p plays is valid?"+h11.isValid());
		System.out.println("............................");
		//12 invalid FullHouse->valid full house->valid straight->valid flush
		cards12=new CardList();
		//cards12.addCard(new BigTwoCard(2,1));
		//cards12.addCard(new BigTwoCard(1,1));
		//cards12.addCard(new BigTwoCard(1,0));
		//cards12.addCard(new BigTwoCard(2,0));
		//cards12.addCard(new BigTwoCard(0,1));
		Hand h12=new FullHouse(p2,cards12);
		System.out.println("2p plays"+h12.getType()+":");
		cards12.print();
		System.out.println("2p's top card:"+h12.getTopCard());
		System.out.println("2p plays is valid?"+h12.isValid());
		System.out.println("............................");
		
		
		if (h11.beats(h12)) {
			System.out.println("1p wins");
			
		}
		else {
			System.out.println("1p doesn't beat 2p");
		}
		System.out.println("............................");	
		
		
		if (h12.beats(h11)) {
			System.out.println("2p wins");
			
		}
		else {
			System.out.println("2p doesn't beat 1p");
		}
		System.out.println("............................");	
		
		
		
		///Quad
		CardList cards13,cards14;
		
		//13 valid Quad
		cards13=new CardList();
		cards13.addCard(new BigTwoCard(1,10));
		cards13.addCard(new BigTwoCard(3,10));
		cards13.addCard(new BigTwoCard(2,10));
		cards13.addCard(new BigTwoCard(0,10));
		cards13.addCard(new BigTwoCard(2,3));
		Hand h13=new Quad(p1,cards13);
		System.out.println("1p plays"+h13.getType()+":");
		cards13.print();
		System.out.println("1p's top card:"+h13.getTopCard());
		System.out.println("1p plays is valid?"+h13.isValid());
		System.out.println("............................");
		//14 invalid Quad->valid full quad->valid straight->valid flush->valid full house
		cards14=new CardList();
		//cards14.addCard(new BigTwoCard(0,0));
		//cards14.addCard(new BigTwoCard(3,0));
		//cards14.addCard(new BigTwoCard(2,0));
		//cards14.addCard(new BigTwoCard(1,0));
		//cards14.addCard(new BigTwoCard(2,1));
		Hand h14=new Quad(p2,cards14);
		System.out.println("2p plays"+h14.getType()+":");
		cards14.print();
		System.out.println("2p's top card:"+h14.getTopCard());
		System.out.println("2p plays is valid?"+h14.isValid());
		System.out.println("............................");
		
		
		if (h13.beats(h14)) {
			System.out.println("1p wins");
			
		}
		else {
			System.out.println("1p doesn't beat 2p");
		}
		System.out.println("............................");	
		
		
		if (h14.beats(h13)) {
			System.out.println("2p wins");
			
		}
		else {
			System.out.println("2p doesn't beat 1p");
		}
		System.out.println("............................");	
		
		
		
		///StraightFlush
		CardList cards15,cards16;
		
		//15 valid Quad
		cards15=new CardList();
		cards15.addCard(new BigTwoCard(1,10));
		cards15.addCard(new BigTwoCard(1,0));
		cards15.addCard(new BigTwoCard(1,11));
		cards15.addCard(new BigTwoCard(1,12));
		cards15.addCard(new BigTwoCard(1,1));
		
		Hand h15=new StraightFlush(p1,cards15);
		System.out.println("1p plays"+h15.getType()+":");
		cards15.print();
		System.out.println("1p's top card:"+h15.getTopCard());
		System.out.println("1p plays is valid?"+h15.isValid());
		System.out.println("............................");
		//16 invalid StraightFlush->valid StraightFlush->valid straight->valid flush->valid full house->valid quad
		cards16=new CardList();
		//cards16.addCard(new BigTwoCard(3,7));
		//cards16.addCard(new BigTwoCard(3,7));
		//cards16.addCard(new BigTwoCard(3,1));
		//cards16.addCard(new BigTwoCard(3,7));
		//cards16.addCard(new BigTwoCard(3,7));
		
		Hand h16=new Quad(p2,cards16);
		System.out.println("2p plays"+h16.getType()+":");
		cards16.print();
		System.out.println("2p's top card:"+h16.getTopCard());
		System.out.println("2p plays is valid?"+h16.isValid());
		System.out.println("............................");
		
		
		if (h15.beats(h16)) {
			System.out.println("1p wins");
			
		}
		else {
			System.out.println("1p doesn't beat 2p");
		}
		System.out.println("............................");	
		
		
		if (h16.beats(h15)) {
			System.out.println("2p wins");
			
		}
		else {
			System.out.println("2p doesn't beat 1p");
		}
		System.out.println("............................");	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
