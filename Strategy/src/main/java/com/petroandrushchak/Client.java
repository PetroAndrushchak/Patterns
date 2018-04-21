package com.petroandrushchak;

import java.io.File;

public class Client {
  public static void main(String[] args) {
    CompressionContext ctx = new CompressionContext();
    //we could assume context is already set by preferences
    ctx.setCompressionStrategy(new ZipCompressionStrategy());
    //get a list of files...
    ctx.createArchive(new File("path to the file"));
  }
}