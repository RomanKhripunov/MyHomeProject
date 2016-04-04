package roman.part10.innerclasses;

import java.util.ArrayList;
import java.util.List;

public class Games {

    public static void playGame(GameFactory factory){
        Game game = factory.getGame();
        while (game.move());
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);

        List<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(14));
        list.add(new Integer(31));
        list.add(new Integer(-12));

        /*Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a = (Integer)o1.intValue();
                int b = (Integer)o2.intValue();
                return a < b ? 1 : a == b ? 0 : -1;
            }
        });
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);*/
    }
}

interface Game{

    Boolean move();
}

interface GameFactory{

    Game getGame();
}

class Checkers implements Game{

    private Checkers() {}
    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public Boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory(){
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game{

    private Chess() {}
    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public Boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}