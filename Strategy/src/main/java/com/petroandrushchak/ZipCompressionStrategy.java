package com.petroandrushchak;

import java.io.File;

public class ZipCompressionStrategy implements CompressionStrategy {
  public void compressFile(File file) {
    System.out.println("Compress ZIP file");
  }
}