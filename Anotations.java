class Aaa {
    public void show() {
        System.out.println("In B show");
    }
}

class Bbb extends Aaa {
    @Override
    public void show1() {
        System.out.println("In B show");
    }
}

public class Anotations {
    public static void main(String[] args) {
        Bbb b = new Bbb();
        b.show();
    }
}
