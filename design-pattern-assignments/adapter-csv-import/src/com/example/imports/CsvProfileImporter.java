package com.example.imports;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class CsvProfileImporter implements ProfileImporter {
    NaiveCsvReader naiveCsvReader;
    ProfileService profileService;

    CsvProfileImporter(NaiveCsvReader naiveCsvReader, ProfileService profileService) {
        this.naiveCsvReader = naiveCsvReader;
        this.profileService = profileService;
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> file = naiveCsvReader.read(csvFile);
        int cnt = 0;
        for (String[] line : file) {
            try {
                Objects.requireNonNull(line[0], "id");
                if (line[0].isEmpty())
                    throw new IllegalArgumentException("empty id");
                Objects.requireNonNull(line[1], "email");
                if (line[1].isEmpty())
                    throw new IllegalArgumentException("empty email");
                if (!line[1].contains("@"))
                    throw new IllegalArgumentException("bad email");
                profileService.createProfile(line[0], line[1], line[2]);
                cnt++;
            } catch (Exception e) {
                System.err.println("Invalid field: " + e.getMessage());
            }
        }
        return cnt;
    }
}
