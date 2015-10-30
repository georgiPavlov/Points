import java.util.Scanner;

/**
 * Created by Georgi on 10/30/2015.
 */
public class Points {
    private int x=0;
    private int y=0;
    private boolean reverse=false;
    private char ch;

    public void operations(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter directions: ");
        String directions = scanner.nextLine();
        for (int i = 0; i < directions.length(); i++) {
          //System.out.print(directions.charAt(i) + " ");
            ch=directions.charAt(i);
            if(x == 2147483647 || x == -2147483648 ){
                System.out.println("x: +-oo y: " + y);
                 break;
            }
            else if(y == 2147483647 || y == -2147483648  ){
                System.out.println("x: " + x + "y: +-oo");
                 break;
            }
            else if(ch == '~'){
               if(reverse){reverse=false;}
               else{reverse=true;}
            }
            else if(ch == '>'){
                if(reverse){x--;}
                else{x++;}
            }
            else if(ch == '<'){
                if(reverse){x++;}
                else{x--;}
            }
            else if(ch == '^'){
                if(reverse){y--;}
                else{y++;}
            }
             else {
                 if(reverse){y++;}
                 else{y--;}
             }

        }
        System.out.println("x: " + x + " y: " + y);
    }

    public static void main(String[] args){
        Points points = new Points();
        points.operations();
    }

}
