import java.util.*;
public class UniqueWords{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the paragraph:");
        String text =sc.nextLine();
        String[]words=text.toLowerCase().split("\\W+");
        HashSet <String>uniquewords =new HashSet<>();
        for(String word: words){
            if(!word.isEmpty()){
                uniquewords.add(word);
            }
        }
        System.out.println("\n unique words:");
        for(String W : uniquewords){
            System.out.println(W);
        }
    }
}
