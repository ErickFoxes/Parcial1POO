package parcial1poo;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Parcial1POO {

    public static void main(String[] args) {
        
        Menu menu = new Menu();
        
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        menu.menu(i);

    }

}
