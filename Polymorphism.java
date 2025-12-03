class Aa {
    public void show() {
        System.out.println("In A show");
    }
}

class Bb extends Aa {
    public void show() {
        System.out.println("In B show");
    }
}

class Cc extends Aa {
    public void show() {
        System.out.println("In C show");
    }
}

class Computer {

}

class Laptop extends Computer {

}

public class Polymorphism {

    public static void main(String[] args) {
        Aa obj = new Aa();
        obj.show();

        obj = new Bb();
        obj.show();

        obj = new Cc();
        obj.show();
    }

}
