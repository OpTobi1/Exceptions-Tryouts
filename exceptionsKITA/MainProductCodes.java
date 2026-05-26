package exceptionsKITA;

import java.util.Scanner;

/**Gets product codes and returns the number of valid codes and banned codes
 * valid codes are entered as: CCCNNNNCCC
 *                             N-number
 *                             C-any character
 * banned codes are such that 10-th character = 'R' and NNNN>2000.
 *
 */
public class MainProductCodes {
    public static void main(String[] args) {
        String code;
        int  valid=0, banned=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter product-code CCCNNNNCCC 
                N-number 
                C-any character 
                or
                XXX to quit""");
        code=scanner.nextLine();

        while (!code.trim().equalsIgnoreCase("XXX")) {
            try {
                if(code.length() <10){
                    throw new InvalidCodeException("Code need to have 10 chars.");
                }
                char region = code.charAt(9);
                String cityCodeStr = code.substring(3,7);
                for(int i = 0; i < cityCodeStr.length(); i++){
                    if(!Character.isDigit(cityCodeStr.charAt(i))){
                        throw new InvalidCodeException("Chars 4-7 need to be numbers.");
                    }
                }
                int cityCode = Integer.parseInt(code.substring(3, 7));
                valid++;
                if (region == 'R' && cityCode > 2000) banned++;

            } catch (InvalidCodeException e){
                System.out.println(("exception: " + e));
                System.out.println(" Invalid code: " + code );
            }
            System.out.println("""
                    Enter product-code CCCNNNNCCC 
                    N-number 
                    C-any character 
                    or
                    XXX to quit""");
            code=scanner.nextLine();
        }
        System.out.println("Summary:\n============");
        System.out.println("number of valid codes: "+valid);
        System.out.println("number of banned codes: "+banned);
    }
}
