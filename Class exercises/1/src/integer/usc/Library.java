package integer.usc;

public class Library {
    public String name;
    public String family;
    public int MemberNo;

    public void borrow(String bName, String member){
        System.out.println("Dear"+" "+member+" "+"You Can Borrow "+bName+" "+"For One Month.");
    }

    public void lend(String bName, String member){
        System.out.println("We Thank You Dear"+" "+member+" "+"For Sharing Us The Book"+" "+bName+" "+"!");
        System.out.println("You Can Have Borrowed Book For One Month More!(If you have)");
    }
    public  void turnBack(String bName,String member){
        System.out.println("Dear"+" "+member+" "+"If you damaged the book "+bName+" "+"pay its half cost and if you didn't we thank you for well-keeping it :).");

    }
    public  void search(String bName){
        System.out.println("Searching Process For "+" "+bName+" "+"...");
        for(int j=1 ; j<40 ; j++ ) {
            for (int i = 0; i < 100000; i++);
            System.out.print("=");
        }
    }
}
