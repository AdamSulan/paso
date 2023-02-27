import java.util.Scanner;

public class MainMenu {
    public MainMenu(){

    }
    public void showMenu(){
        System.out.println();
        System.out.println("------------------");
        System.out.println(" 1.) Mengtekintés ");
        System.out.println("  2.) Új jelszó  ");
        System.out.println("   3.) Kilépés   ");
        System.out.println("------------------");
        System.out.println();
    }
    public void selectMenu(){
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print("Választás: ");
            String selected=scanner.nextLine();
        }

    }
}
