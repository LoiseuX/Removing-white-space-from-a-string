# Removing-white-space-from-a-string
    import java.util.Scanner;

    public class RemovingWhiteSpacesFromAString {
    public static void main(String[] args) {
        
        //get input from the user
        //Scanner in = new Scanner(System.in);
        //System.out.print("Input String: ");
        //String input = in.nextLine();
        
        //given input
        String input = "Annyeong ha se yo o o sa sa ge yo ";
        
        String rslt = input.replaceAll("\\s", "");
        System.out.println("String without spaces: "+ rslt);
        
    }
    
}
