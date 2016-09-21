package com.epam.petroandrushchak;

import java.io.IOException;

public class Client {
	
	public static String IMAGE_PATH = "src/main/resources/image.jpg";
	
	public static void main(String[] args) throws IOException {
			
		Image image = new ImageProxy(IMAGE_PATH);
		System.out.println(image.getImageSquare());
	}

}
