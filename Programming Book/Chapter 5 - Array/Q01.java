//Q1. Initialize 5 students percentage and display the highest percentage

public class Q01 {
    public static void main(String[] args) {
        double[] per = {78.05, 65.87, 45.67, 76.43, 98.08};
        double big = per[0];

        for(int i=0; i<per.length; i++) {
            if(per[i] > big) {
                big = per[i];
            }
        }

        System.out.println("The highest percentage is: " + big + "%");
    }
}
