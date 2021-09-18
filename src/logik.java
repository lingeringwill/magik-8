import java.util.Scanner;
public class logik {
    int randNumn;
   String userInput;

     void response (){
        Scanner input = new Scanner(System.in);
       
        helper();
        userInput = input.nextLine();
        input.close();
        randNumn = 1+(int)(Math.random()*8);
        

        switch (randNumn){
            case 1: System.out.println("I cannot answer that now");
            break;
            case 2: System.out.println("the answer to that may come in the near future");
            break;
            case 3: System.out.println("yes, without a doubt");
            break;
            case 4: System.out.println("My reply is no");
            break;
            case 5: System.out.println("Cannot predict now");
            break;
            case 6: System.out.println("Concentrate and ask again");
            break;
            case 7: System.out.println("I'm doubtful of that");
            break;
            case 8: System.out.println("you may rely on it");
            break;

        }
        
    }

    static void helper() {
        System.out.println("please ask your question here");
    }

    
    
}
