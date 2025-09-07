package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    private SharpenAdapter sharpenAdapter ;
    private FilterEngine filterEngine;
    private Decoder decoder;
    private Encoder encoder;
    public VideoPipelineFacade() {
        sharpenAdapter = new SharpenAdapter();
        filterEngine = new FilterEngine();
        decoder = new Decoder();
        encoder = new Encoder();
    }

    public Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength) {
        Frame[] frames = decoder.decode(src);
        if (gray) {
            frames = filterEngine.grayscale(frames);
        }
        frames = filterEngine.scale(frames, scale);
        frames = sharpenAdapter.sharpen(frames, sharpenStrength);
        return encoder.encode(frames, out);
    }
}
