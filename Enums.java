enum Status {
    Running, Failed, Pending, Success;
}

enum Laptop2 {
    Macbook(9000), XPS(800), Surface(900), ThinkPad(1500);

    private int price;

    private Laptop2 () {
        this.price = 100;
    }

    private Laptop2 (int price) {
        this.price = price;
    }

    public int getPrice () {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enums {
    public static void main(String[] args) {
        // Status[] ss = Status.values();
        // System.out.println(ss[0]);

        // for (Status s: ss) {
        //     System.out.println(s + " " + s.ordinal());
        // }

        // Status s = Status.Success;

        // switch (s) {
        //     case Running -> System.out.println("All good");
            
        //     case Failed -> System.out.println("Try again");

        //     case Pending -> System.out.println("Please wait");

        //     default -> System.out.println("Done");
        // }

        // switch (s) {
        //     case Running:
        //         System.out.println("All good");
        //         break;
            
        //     case Failed:
        //         System.out.println("Try again");
        //         break;

        //     case Pending:
        //         System.out.println("Please wait");
        //         break;

        //     default:
        //         System.out.println("Done");
        //         break;

        // if (s == Status.Running) {
        //     System.out.println("All Good");
        // } else if (s == Status.Failed) {
        //     System.out.println("Try again");
        // } else if (s == Status.Pending) {
        //     System.out.println("Please Wait");
        // } else 
        //     System.out.println("Done");

        Laptop2 lap = Laptop2.ThinkPad;
        System.out.println(lap + " : " + lap.getPrice());

        for (Laptop2 l: Laptop2.values()) {
            System.out.println(l + " : " + l.getPrice());
        }
    }
}
