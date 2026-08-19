import java.util.*;
public class Stringopr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("1.Length of string\n2.Concatination\n3.charat function\n4.compare 2 strings\n5.upper/lower case\n6.Substring\n7.Replace\n8.Join\n9.Exit\n");
        for(int i=0;i<10;i++){
            System.out.println("Choose an option: ");
            int n=s.nextInt();
            switch (n) {
                case 1:
                    len();
                    break;
                case 2:
                    Concatination();
                    break;
                case 3:
                    charat();
                    break;
                case 4:
                    compare();
                    break;
                case 5:
                    uplo();
                    break;
                case 6:
                    substring();
                    break;
                case 7:
                    replace();
                    break;
                case 8:
                    join();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Enter A valid Number.");
            }
        }
    }
    public static void len(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String ster=s.next();
        System.out.println("The Length Of "+ster+"is: "+ster.length());
    }
    public static void Concatination(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String ster1=s.next();
        System.out.println("Enter the String 2: ");
        String ster2=s.next();
        String ster3=ster1.concat(ster2);
        System.out.println("The Concatination is: "+ster3);
    }
    public static void charat(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String ster=s.next();
        System.out.println("Enter the position: ");
        int x=s.nextInt();
        char res=ster.charAt(x);
        System.out.println("The charecter in that position is: "+res);
    }
    public static void compare(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String ster1=s.next();
        System.out.println("Enter the String 2: ");
        String ster2=s.next();
        int s1=ster1.compareTo(ster2);
        System.out.println((s1 == 0) ? "Both are equal" : "Both are not equal");
    }
    public static void uplo(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String ster=s.next();
        System.out.println("Upper Case: "+ster.toUpperCase()+"\nLower Case: "+ster.toLowerCase());
    }
    public static void substring(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String ster=s.next();
        System.out.println("Enter the start position: ");
        int x=s.nextInt();
        System.out.println("Enter the end position: ");
        int y=s.nextInt();
        System.out.println("The substring of ster is: "+ster.substring(x,y));
    }
    public static void replace(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String ster=s.next();
        System.out.println("Enter the charecter to relace: ");
        char x = s.next().charAt(0);
        System.out.println("Enter the charecter that relace: ");
        char y = s.next().charAt(0);
        System.out.println("The string is: "+ster.replace(x,y));
    }
    public static void join(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String ster1=s.next();
        System.out.println("Enter the String 2: ");
        String ster2=s.next();
        System.out.println(String.join(ster1,ster2));
    }
}
