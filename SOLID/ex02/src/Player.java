public class Player {
    private UI ui;
    private Cache cache;
    Player(UI ui, Cache cache){
        this.ui = ui;
        this.cache = cache;
    }
    void play(byte[] fileBytes){
        // decode
        Frame f = new Frame(fileBytes); // pretend decoding
        // draw UI
        ui.draw(f);
        // cache
        cache.save(f);
    }
}