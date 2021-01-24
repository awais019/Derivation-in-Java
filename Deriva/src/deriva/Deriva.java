/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package deriva;

/**
 *
 * @author MUHAMMAD AWAIS
 */
import java.util.*;
public class Deriva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String inputBuffer;
        System.out.print("Enter the expression: ");
        Scanner get = new Scanner(System.in);
        inputBuffer = get.nextLine();
        String input = "";
        // Removing white spaces
        for (int i = 0; i < inputBuffer.length(); i++) {
            if(!(inputBuffer.charAt(i) == ' '))
            {
                input += inputBuffer.charAt(i);
            }
        }
        int expressions = 1;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '+')
            {
                expressions++;
            }
        }
        String exp[] = new String[expressions];
        for (int i = 0; i < expressions; i++) {
            exp[i] = "";
        }
            int curExp = 0;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == '+')
                {
                    curExp++;
                }
                else
                {
                    exp[curExp] += input.charAt(i);
                }
            }
            System.out.println("The derivative is :");
        for (int i = 0; i < expressions; i++) {
            int c  = exp[i].length();
            String str = "1";
            if(c== 3)
            {
                exp[i] = str.concat(exp[i]);
            }
            for(int j = 0; j < c; j++){
            if(exp[i].charAt(j) == 'x')
            {
            if(exp[i].charAt(c-1) != 'x' )
            {
            char ch = exp[i].charAt(0);
            char ch1 = exp[i].charAt(3);
            int x = Integer.parseInt(String.valueOf(ch));
            int y = Integer.parseInt(String.valueOf(ch1));
            if(y-1 == 1)
            {
                System.out.print((x*y) + "x" + " + ");
            }
            else
            System.out.print((x*y) + "x^" + (y-1) + " + ");
            }
            else
            {
                System.out.println(exp[i].charAt(0));   
            }
            }
            }
        }
    }
    
}
