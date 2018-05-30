package com.example.springbootexperiments.file;

import java.io.IOException;

import org.apache.tika.Tika;
import org.apache.tika.detect.TypeDetector;
import org.apache.tika.mime.MimeTypes;
import org.springframework.web.multipart.MultipartFile;

public final class FileContentTypeUtil {

    /** Instance of Tika facade class with default configuration. */
    private static final Tika defaultTika = new Tika();
    /** Instance of Tika facade class with MimeTypes detector. */
    private static final Tika mimeTika = new Tika(new MimeTypes());
    /** Instance of Tika facade class with Type detector. */
    private static final Tika typeTika = new Tika(new TypeDetector());

    private FileContentTypeUtil() {}

    public static void printContentTypeWithFileContentType(MultipartFile file) {
        if (file != null) {
            System.out.println("# - File content type for : " +  file.getOriginalFilename() + " >>> " + file.getContentType());
        }
    }

    public static void printContentTypeWithApacheTika(MultipartFile file) throws IOException {
        if (file != null) {
            System.out.println("# - File content type for : " + file.getOriginalFilename() + " >>> " + defaultTika.detect(file.getInputStream()));
        }
    }
}
