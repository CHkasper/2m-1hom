public class Grandfather {
    public Grandfather(Color color, String name, int age, Gambol gambol) {
    }

    public class Darvin {
        private Color color;
        private String name;
        private int age;
        private Gambol gambol;

        public Darvin(Color color, String name, int age, Gambol gambol) {
            this.color = color;
            this.name = name;
            this.age = age;
            this.gambol = gambol;
        }

        public Color getColor() {
            return color;
        }

        public Gambol getGambol() {
            return gambol;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }


        public void getInfo() {
            System.out.println("Name: " + name +
                    "\nAge: " + age +
                    "\nEye color: " + color +
                    "\nJob: " + gambol.getGambol());
        }
    }
}
