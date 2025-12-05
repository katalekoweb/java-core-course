class NewException extends Exception {
    public NewException (String string) {
        super(string);
    }
}

class Julian {
    public void show () throws ClassNotFoundException {

        Class.forName("Demo");

        // try {
        //     Class.forName("Demo");
        // } catch (ClassNotFoundException e) {
        //     System.out.println(e);
        // }
    }
}

public class Exceptions {
    public static void main(String[] args) {
        // Type of errors
        // - Compiling time errors - Sintatical errors
        // - Logical errors - the app work but the output is wrong, bugs
        // - Runtime error - the app stops

        Julian obj = new Julian();

        try {
            obj.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        // Statements - normal, critical
        int i = 20; // normal
        int j = 0;

        try {
            j = 18/i; // critical
            if (j == 0) 
                throw new NewException("I dont want to print zero");
            

        } catch (NewException e) {
            j = 18/1;
            System.out.println("Thats the default output: " + e);
            // System.out.println("Something went wrong with division: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        System.out.println(j); 
        System.out.println("Bye"); // bye doesnt apper because the execution whas stopped
    }
}
