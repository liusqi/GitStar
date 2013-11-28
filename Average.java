
public class Average {

    public static void main(String[] args) {
        int average = 0;
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++)
                average += Integer.parseInt(args[i]);
            average = average / args.length;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No Arguments");
            System.exit(1);
        }
    }
}
