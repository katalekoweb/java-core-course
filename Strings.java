public class Strings {
    public static void main(String[] args) {
        String name = "Kataleko";
        String name2 = new String("JFK");

        System.out.println(name.toUpperCase());
        System.out.println(name.hashCode());
        // concatenante
        System.out.println("Name: " + name);
        System.out.println(name.concat(" Julian"));
        System.out.println(name2.concat(" Kataleko"));

        String s1 = "Navin";
        String s2 = "Navin";

        System.out.println(s1 == s2);

        StringBuffer sb = new StringBuffer("Kataleko");
        sb.append(" JFK");

        System.out.println(sb);
        System.out.println(sb.length());

        // String str = sb.toString();
        // sb.deleteCharAt(2);
        sb.insert(0, "Java ");
        sb.setLength(30);
        sb.ensureCapacity(100);

        System.out.println(sb);
    }
}
