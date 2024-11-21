
package Chuong3.Circle;
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }
    @Override
    public int resize(int percent) {
        int s =(int)(this.radius*percent)/100;
        return s;
    }
    
    
}
