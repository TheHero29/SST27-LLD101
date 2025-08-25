public class Square implements Shape {
    int side;

    void setSide(int side){
        this.side=side;
    }

    public int area() {
        return side * side;
    }
}