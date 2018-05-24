package com.example.springbootexperiments.model;

import org.springframework.web.multipart.MultipartFile;

public class Welcome {

    private long id;
    private String content;
    private MultipartFile file1;
    private MultipartFile file2;
    private MultipartFile file3;
    private MultipartFile file4;
    private MultipartFile file5;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MultipartFile getFile1() {
        return file1;
    }

    public void setFile1(MultipartFile file1) {
        this.file1 = file1;
    }

    public MultipartFile getFile2() {
        return file2;
    }

    public void setFile2(MultipartFile file2) {
        this.file2 = file2;
    }

    public MultipartFile getFile3() {
        return file3;
    }

    public void setFile3(MultipartFile file3) {
        this.file3 = file3;
    }

    public MultipartFile getFile4() {
        return file4;
    }

    public void setFile4(MultipartFile file4) {
        this.file4 = file4;
    }

    public MultipartFile getFile5() {
        return file5;
    }

    public void setFile5(MultipartFile file5) {
        this.file5 = file5;
    }

}
