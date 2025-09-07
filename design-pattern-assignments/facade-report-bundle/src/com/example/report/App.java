package com.example.report;
import java.nio.file.*; import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String,Object> data = Map.of("name", "Quarterly");
        Path outputDir = Path.of("out");
        String baseName = "report";
        ReportBundleFacade facade = new ReportBundleFacade();
        System.out.println(facade.export(data, outputDir, baseName));
    }
}
