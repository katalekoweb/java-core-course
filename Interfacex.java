class Developer {
    public void devApp (MyComputer computer) {
        computer.code();
        System.out.println("Coding...");
    }
}

interface Person {
    int age = 30; // final and static
    String area = "Benguela"; // final and static

    void show ();
    void config ();
}

interface MyComputer {
    // by default, all mehtods in interface are public abstract
    void code ();
}

interface Machine1 {
    void run ();
}

class Lap implements MyComputer, Machine1 {

    public void code () {
        System.out.println("Code, compile and run!");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}

class Desktop implements MyComputer {
    public void code () {
        System.out.println("Code, compile and run : Faster");
    }
}

public class Interfacex {
    public static void main(String[] args) {

        // class -> class : extends
        // class -> interface : implements
        // interface -> interface : extends
        
        MyComputer lap = new Lap();
        MyComputer desktop = new Desktop();

        Developer kata = new Developer();
        kata.devApp(desktop);

        // person interface
        System.out.println(Person.age);
        System.out.println(Person.area);
    }
}
