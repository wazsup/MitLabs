package lab1_cont;

/**
 * Created with IntelliJ IDEA.
 * User: ebaza
 * Date: 29.07.13
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */
public class MAIN {
    public static void main(String[] args) {
        Box box = new Box(12);
        Ball b = new Ball(1,1);
        box.add(b);
        System.out.println(box.getBallsFromSmallest().next().getCapacity());
    }
}
