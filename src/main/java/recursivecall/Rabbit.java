package recursivecall;

public class Rabbit {

    private static int count = 0;

    public static void main(String[] args) {

        int count = count(5);
        System.out.println(count);
    }


    public static int count(int count) {
        if (count <= 1) {
            return count;
        }
        System.out.println("count次"+ ++Rabbit.count );
        return count(count - 1) + count(count - 2);

    }
}
