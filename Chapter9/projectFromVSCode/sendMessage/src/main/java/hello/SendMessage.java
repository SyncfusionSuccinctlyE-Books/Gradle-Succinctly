package hello;

public class SendMessage {
    
    public static void main (String[] args) {
        
        if (args.length == 0)
        {
            System.out.println("A message must be typed in the Command Line");
        }
        else
        {
            System.out.println(args[0]);
        }
    }
}
