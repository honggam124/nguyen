import java.util.*;
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(7);
        a.add(11);
        a.add(14);
        a.add(15);
        a.add(15);
        a.add(15);
        a.add(16);
        a.add(18);
        a.add(18);
        a.add(20);
        a.add(22);
        a.add(22);
        a.add(23);
        a.add(23);
        a.add(25);
        a.add(26);
        a.add(26);
        a.add(26);
        a.add(27);
        a.add(27);
        a.add(28);
        a.add(28);
        a.add(29);
        a.add(29);
        a.add(30);
        a.add(30);
        a.add(31);
        a.add(31);
        a.add(32);
        a.add(33);
        a.add(33);
        a.add(35);
        a.add(35);
        a.add(35);
        a.add(36);
        a.add(36);
        a.add(36);
        a.add(37);
        a.add(37);
        a.add(40);
        a.add(41);
        a.add(41);
        a.add(42);
        a.add(47);
        a.add(48);
        a.add(52);
        a.add(57);
        a.add(58);
        a.add(60);
        a.add(63);
        a.add(70);
        a.add(72);
        a.add(73);
        a.add(79);
        a.add(85);
        a.add(95);
        a.add(111);
        a.add(127);
        a.add(147);
        double sum=0;
        for (int i =0; i<a.size(); i++){
            sum+=(a.get(i)-41.101695)*(a.get(i)-41.101695);
            double tmp = (a.get(i)-41.101695)*(a.get(i)-41.101695);
            // System.out.println(a.get(i)-41.101695);
            // System.out.println(a.get(i));
            System.out.println(sum);
        }
        sum=sum/59.0;
        System.out.println(sum);
    }
}
