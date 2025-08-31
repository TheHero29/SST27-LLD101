package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": reflection+serialization-friendly.
 */
public class AppSettings implements Serializable {
    private static class PropsHolder {
        private static Properties props = new Properties();
    }
    private static class AppsHolder {
        private static AppSettings appSettings = new AppSettings();
    }

    private AppSettings() {}

    public static AppSettings getInstance() {
        return AppsHolder.appSettings;
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            PropsHolder.props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return PropsHolder.props.getProperty(key);
    }
}
