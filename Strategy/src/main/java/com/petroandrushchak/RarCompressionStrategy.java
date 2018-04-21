package com.petroandrushchak;

import java.io.File;

public class RarCompressionStrategy implements CompressionStrategy {
  public void compressFile(File file) {
    System.out.println("Compress RAR file");
  }
}