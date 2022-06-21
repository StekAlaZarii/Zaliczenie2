import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner skaner=new Scanner(System.in);
    String tekst;

    System.out.println();
    System.out.print("Podaj tekst: ");
    tekst = skaner.nextLine();
    tekst=tekst.replaceAll(" ","");
    
    System.out.println("Wynik: "+tekst);

    skaner.close();
  }
}