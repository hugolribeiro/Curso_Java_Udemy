public class ForEach {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int index = 0; index < vect.length; index++){
            System.out.println(vect[index]);
        }

        System.out.println("----------------------------");
        for (String name : vect){
            System.out.println(name);
        }
    }
}
