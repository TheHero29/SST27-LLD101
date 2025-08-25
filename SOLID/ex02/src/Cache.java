public class Cache {
    private Frame last;

    void save(Frame frame) {
        this.last = frame;
        System.out.println("Cached last frame? " + (last != null));
    }

    Frame getLast() {
        return last;
    }
}
