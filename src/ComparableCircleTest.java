import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle [] circles=new ComparableCircle[4];
        circles[0]=new ComparableCircle(3.6);
        circles[1]=new ComparableCircle();
        circles[2]=new ComparableCircle(4.6);
        circles[3]= new ComparableCircle(9.2,"yellow",false);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle:circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);
        System.out.println("Apter-sorted:");
        for (ComparableCircle circle:circles){
            System.out.println(circle);
        }

    }
}
