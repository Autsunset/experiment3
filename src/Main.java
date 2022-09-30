import experiment3.area.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.print("请选择您要计算的面积\n");
        System.out.print("1：计算三角形面积；2：计算圆形面积；3：计算矩形面积；4：则计算梯形面积；5：退出计算：");
            int X = input.nextInt();
            if (X == 1) {
                System.out.print("输入三角形底Sd1=");
                double Sd1 = input.nextDouble();
                System.out.print("输入三角形高Sg1=");
                double Sh1 = input.nextDouble();
                double triangle1 = triangle.trianglearea(Sd1, Sh1);
                System.out.println("三角形面积为" + triangle1);
            } else if (X == 2) {
                System.out.print("输入圆形半径r=");
                double r1 = input.nextDouble();
                double circle1 = circle.circlearea(r1);
                System.out.println("圆形面积为" + circle1);
            } else if (X == 3) {
                System.out.print("输入矩形长jc1=");
                double jc1 = input.nextDouble();
                System.out.print("输入矩形宽jk1=");
                double jk1 = input.nextDouble();
                double rectangle1 = rectangle.rectanglearea(jc1, jk1);
                System.out.println("矩形面积为" + rectangle1);
            } else if (X == 4) {
                System.out.print("输入梯形上底tsd1=");
                double tsd1 = input.nextDouble();
                System.out.print("输入梯形下底txd1=");
                double txd1 = input.nextDouble();
                System.out.print("输入梯形高th1=");
                double th1 = input.nextDouble();
                double trapezoid1 = trapezoid.trapezoidarea(tsd1, txd1, th1);
                System.out.println("梯形面积为" + trapezoid1);
            }
            else if (X == 5){
                System.out.print("退出计算");
                break;
            }
            else {
                System.out.print("选择错误");
            }

        }
    }
}