import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password length:");
        int length = scan.nextInt();
        String password = "";
        for (int i = 0; i <= length - 1; i++){
            Random random = new Random();
            int letterNum = random.nextInt(36) + 1;
            switch (letterNum){
                case 1:
                    password += "a";
                    break;
                case 2:
                    password += "b";
                    break;
                case 3:
                    password += "c";
                    break;
                case 4:
                    password += "d";
                    break;
                case 5:
                    password += "e";
                    break;
                case 6:
                    password += "f";
                    break;
                case 7:
                    password += "g";
                    break;
                case 8:
                    password += "h";
                    break;
                case 9:
                    password += "i";
                    break;
                case 10:
                    password += "j";
                    break;
                case 11:
                    password += "k";
                    break;
                case 12:
                    password += "l";
                    break;
                case 13:
                    password += "m";
                    break;
                case 14:
                    password += "n";
                    break;
                case 15:
                    password += "o";
                    break;
                case 16:
                    password += "p";
                    break;
                case 17:
                    password += "q";
                    break;
                case 18:
                    password += "r";
                    break;
                case 19:
                    password += "s";
                    break;
                case 20:
                    password += "t";
                    break;
                case 21:
                    password += "u";
                    break;
                case 22:
                    password += "v";
                    break;
                case 23:
                    password += "w";
                    break;
                case 24:
                    password += "x";
                    break;
                case 25:
                    password += "y";
                    break;
                case 26:
                    password += "z";
                    break;
                case 27:
                    password += "1";
                    break;
                case 28:
                    password += "2";
                    break;
                case 29:
                    password += "3";
                    break;
                case 30:
                    password += "4";
                    break;
                case 31:
                    password += "5";
                    break;
                case 32:
                    password += "6";
                    break;
                case 33:
                    password += "7";
                    break;
                case 34:
                    password += "8";
                    break;
                case 35:
                    password += "9";
                    break;
                case 36:
                    password += "0";
                    break;
                default:
                    password += "@";
                    break;
            }
        }
        System.out.println(password);
    }
}
