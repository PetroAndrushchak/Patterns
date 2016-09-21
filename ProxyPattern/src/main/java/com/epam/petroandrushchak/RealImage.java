package com.epam.petroandrushchak;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RealImage implements Image{

	private BufferedImage image;

	public RealImage(String imagePath) {
		readImage(imagePath);
	}

	private void readImage(String imagePath) {
		try {
			image = ImageIO.read(new File(imagePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public double getImageSquare() {
		return image.getHeight() * image.getWidth();
	}

}
