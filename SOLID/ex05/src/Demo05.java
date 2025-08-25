
public class Demo05 {
    static int areaAfterResize(Rectangle r){
        r.setWidth(5); r.setHeight(4); return r.area();
    }
    public static void main(String[] args) {
        System.out.println(areaAfterResize(new Rectangle())); // 20
        // System.out.println(areaAfterResize(new Square()));    // compiletime error won't accept square where rectangle is needed
    }
}
