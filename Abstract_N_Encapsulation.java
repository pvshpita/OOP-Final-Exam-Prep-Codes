//Q-11

abstract class Season {
    abstract void flower();
}

class Spring extends Season {
    void flower() {
        System.out.println("Krishnochura");
    }
}

class Cat {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Abstract_N_Encapsulation {
    public static void main(String[] args) {
        Spring spring = new Spring();
        spring.flower();

        Cat kitty = new Cat();
        kitty.setName("Whiskers");
        System.out.println("Cat's name: " + kitty.getName());
    }
}