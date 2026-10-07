package edu.ccrm.util;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
/**
 * File utility methods.
 */
public final class FileUtils {
    private FileUtils() {
    }
    /**
     * Returns total size of all files.
     */
    public static long directorySize(Path path) throws IOException {

        if (path == null || Files.notExists(path)) {
            return 0L;
        }
        try (var paths = Files.walk(path)) {
            return paths
                    .filter(Files::isRegularFile)
                    .mapToLong(file -> {
                        try {
                            return Files.size(file);
                        } catch (IOException e) {
                            return 0L;
                        }
                    })
                    .sum();
        }
    }
    /**
     * Counts regular files.
     */
    public static long fileCount(Path path) throws IOException {
        if (path == null || Files.notExists(path)) {
            return 0;
        }
        try (var paths = Files.walk(path)) {
            return paths
                    .filter(Files::isRegularFile)
                    .count();
        }
    }
}
