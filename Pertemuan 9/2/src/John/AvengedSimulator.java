package John;

import java.util.ArrayList;
import java.util.List;

public class AvengedSimulator {

    public static void main(String[] args) {
        List<SuperHero> ListHeroes = new ArrayList();

        ListHeroes.add(new ManRay(0, "Gennichiro"));
        ListHeroes.add(new FlyingDutchMan(225, "Shirai"));
        ListHeroes.add(new ManRay(553, "Gyoubu Masataka Oniwa"));
        ListHeroes.add(new DirtyBubble(666, "Arnastria"));
        ListHeroes.add(new FlyingDutchMan(36556 , "Tatenari"));

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("===============================");
            ListHeroes.get(i).identity();
            ListHeroes.get(i).showPowers();
            System.out.println("===============================");
        }


    }

}
