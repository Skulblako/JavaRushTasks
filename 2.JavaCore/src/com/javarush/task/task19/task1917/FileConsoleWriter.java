package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;


    public FileConsoleWriter(FileDescriptor fileWriter) {
        this.fileWriter = new FileWriter(fileWriter);
    }

    public FileConsoleWriter(String path) throws IOException {
        this.fileWriter = new FileWriter(path);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }
    public FileConsoleWriter(String file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public static void main(String[] args) {

    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        for (int i = off; i < len+off; i++) {
            System.out.print(cbuf[i]);
        }
    }

    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        for (char c : cbuf) {
            System.out.print(c);
        }
    }

    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.println(str);
    }

    public void close() throws IOException {
        fileWriter.close();
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        for (int i = off; i < len+off; i++) {
            System.out.print(str.charAt(i));
        }
    }
}
