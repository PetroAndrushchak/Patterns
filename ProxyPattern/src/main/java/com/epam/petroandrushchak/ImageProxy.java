package com.epam.petroandrushchak;

public class ImageProxy  implements Image{
	
	private RealImage realImage;
	private String imagePath;
	
	public ImageProxy(String imagePath){
		this.imagePath = imagePath;
	}
	
	public double getImageSquare(){
		if(realImage == null){
			realImage = new RealImage(imagePath);
		}
		return realImage.getImageSquare();
	}
}
