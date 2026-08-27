package oop.assigment_problems;

class HallTicket{
    String name;
    int seatNumber;
    HallTicket(String name,int seatNumber){
        this.name=name;
        this.seatNumber=seatNumber;
    }

}


public class HallTicketTest {
    public static void main(String[] args) {
        
    HallTicket h1=new HallTicket("Priya",45);
    HallTicket h2=h1;
    h2.seatNumber=0;
    System.out.println("Priya's seat number:"+h1.seatNumber);
    System.out.println("h1==h2: "+(h1==h2));
    HallTicket h3=new HallTicket("Priya",0);
    System.out.println("h1==h3: "+(h1==h3));
    
    
}
}
