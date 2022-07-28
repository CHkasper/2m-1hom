public class Main {
    public static void main(String[] args) {
        Father ObjectA = new Father(Color.BLACK, "Байэл", 18, new Gambol("студент"));
        Son ObjectB = new Son(Color.YELLOW, "Исхак", 13, new Gambol("ученик"));
        Son ObjectC = new Son(Color.BLACK, "Дани", 6, new Gambol("начальная школа "));
        

        ObjectA.getInfo();
        ObjectB.getInfo();
        ObjectC.getInfo();
    }

    }
