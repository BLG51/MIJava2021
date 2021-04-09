package LinkedList;

import com.sun.org.apache.xpath.internal.operations.String;
import game1.Player;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//    List<Player> playersList = createClientList();

        List<Player> list = new ArrayList<>();
        list.add(new Player("Anton", "Here I am!"));//0x01
        Player p1 = new Player("Anton", "Here I am!");//0x02
        System.out.println(list.contains(p1));





        List<Integer> ilist = new ArrayList<>();
        ilist.add(5);
        int a = 5;
        ilist.contains(a);

        list.add(new Player("Anton", "Here I am!"));//0x01
        list.add(new Player("Anton", "Here I am!"));//0x02
        list.add(new Player("Anton", "Here I am!"));//0x03
        list.add(new Player("Anton", "Here I am!"));//0x04
        list.add(new Player("Anton", "Here I am!"));//0x05
        list.add(new Player("Anton", "Here I am!"));//0x06
        list.add(new Player("Anton", "Here I am!"));//0x07



        List<Player> list2 = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            list2.add(list.get(i));
//        }
        list2.addAll(list);


    }


    public static List<Player> createClientList() {
        List<Player> players = new ArrayList<>();
        //......
        return players;
    }


}
