package com.example.report;

import java.nio.file.Path;
import java.util.Map;

public class ReportBundleFacade {
    private final JsonWriter jsonWriter;
    private final Zipper zipper;
    private final AuditLog auditLog;

    public ReportBundleFacade() {
        this.jsonWriter = new JsonWriter();
        this.zipper = new Zipper();
        this.auditLog = new AuditLog();
    }

    public Path export(Map<String, Object> data, Path outputDir,  String baseName) {
        Path json = jsonWriter.write(data, outputDir, baseName);
        Path zip = zipper.zip(json, outputDir.resolve(baseName + ".zip"));
        auditLog.log("exported " + zip);
        return zip;
    }
}
