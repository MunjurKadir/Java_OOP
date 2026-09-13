package p07_anonymous;

public class F02_Anonymous_from_Interface {
    public static void main (String[] args){
        Payment P = new Payment (){  // InterfaceName reference = new InterfaceName() {  code  }
            public void pay(){
                System.out.println("Paid with Bkash");
            }
        };
        P.pay();
    }
}
interface Payment{
    void pay();
}
