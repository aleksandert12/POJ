/*
    Autorzy: Tyński Aleksander 
             Michał Kaczmarek
      Lab7  Zadanie 2
     */
     public class AuctionTest {

    public static void main (String[] args){
        AuctionUser user = new AuctionUser('s')
                .Name("Aleksander", "Kaczmarek")
                .eMail("s11111@pjwstk.edu.pl")
                .build();
        Auction auction = new Auction('p')
                .Description("Rower")
                .Duration(5)
                .Name("Sprzedam Rower")
                .PriceStart(25.0d)
                .addingUser(user)
                .build();
        if(auction.type=='p'){
            if(auction.auctionDuration==0){
                auction.auctionWon(user);
            }
        }else if(auction.type=='w'){
            if(auction.auctionDuration==0){
                auction.auctionWon(user);
                auction.auctionDuration+=1;
            }
        }else if(auction.type=='o'){
            if(auction.isAuctioned()){
                auction.startPrice-=1;
                System.out.println(auction.startPrice);
            }
        }
    }
}
