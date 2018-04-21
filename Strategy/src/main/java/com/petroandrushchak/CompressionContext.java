package com.petroandrushchak;

import java.io.File;

public class CompressionContext {

  private CompressionStrategy strategy;

  public void setCompressionStrategy(CompressionStrategy strategy) {
    this.strategy = strategy;
  }

  public void createArchive(File file) {
    strategy.compressFile(file);
  }
}