package game1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player p1 = new Player(sc.next(), sc.nextLine());
        System.out.println(p1.getName());
        Player p2 = new Player(sc.next(), sc.nextLine());
        boolean flag = true;


        Player pp1;
        Player pp2;

        while (p1.getHp() > 0 && p2.getHp() > 0) {

            if (flag) {
                pp1 = p1;
                pp2 = p2;
            } else {
                pp1 = p2;
                pp2 = p1;
            }

            String action = sc.next(); //shout, slash
            if (action.equals("slash")) {
                pp1.slash(pp2);
            } else if (action.equals("shout")) {
                pp1.shout();
            } else if (action.equals("getNewSword")) {
                pp1.getSword();
            } else if (action.equals("heal")) {
               pp1.heal();
            }

            System.out.println(p1.getName() + "'s hp = " + p1.getHp());
            System.out.printf(p1.getName() + "'s sword durability = " + p1.getSword().getDurability());

            System.out.println(p2.getName() + "'s hp = " + p2.getHp());
            System.out.printf(p2.getName() + "'s sword durability = " + p2.getSword().getDurability());

            flag = !flag;
        }

        if (p1.getHp() <= 0) {
            System.out.println(p2.getName() + " wins!");
        } else {
            System.out.println(p1.getName() + " wins!");
        }



    }
}
