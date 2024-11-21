
package Chuong3.Circle;
public class Test {
    public static void main(String[] args) {
        ResizableCircle rc1=new ResizableCircle(3);
        System.out.println("Chu vi la: "+rc1.getPerimeter());
        System.out.println("Dien tich la: "+rc1.getArea());
        System.out.println("Resize: "+rc1.resize(10));
    }
}
