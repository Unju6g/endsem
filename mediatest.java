class media{
    void displayDetails(){
        System.out.println("media details");
    }
}
class book extends media{
    void displayDetails(){
        System.out.println("book: the 'alchemist'by bob");
    }
}
class movie extends media{
    void displayDetails(){
        System.out.println("movie: devdas");
    }
}
public class mediatest{
    public static void main(String[]args){
        media m;
        m= new book();
        m. displayDetails();
        m=new movie();
        m.displayDetails();
    }
}
