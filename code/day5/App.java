package com.training.day5;

/**
 * Hello world!
 */

abstract class Video{
	protected ProcessingQuality quality;

	public Video(ProcessingQuality quality) {
		this.quality = quality;
	}
	
	public abstract void playVideo();
}

 class PrimeChannel extends Video {
    public PrimeChannel(ProcessingQuality quality) {
		super(quality);
		
	}
 
	@Override
	public void playVideo() {
		
		System.out.println("Play video in prime");
		
	}
 
}
 

 
class YouTube extends Video{
 
	public YouTube(ProcessingQuality quality) {
		super(quality);
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public void playVideo() {
		
		System.out.println("Playing video in YouTube");
		
	}
 
}
 
 

 
interface ProcessingQuality {
 
	public void processVideo(String speed);
		
	
}
 

 
class HDProcessing implements ProcessingQuality{
 
	@Override
	public void processVideo(String speed) {
		
		System.out.println("Video playing with HD Quality");
		
	}
 
}
 
 

 
 class FourKProcessing implements ProcessingQuality{
 
	@Override
	public void processVideo(String speed) {
	
		System.out.println("Video playing with 4k Quality");
		
	}
 
}
 
 
public class App {
    public static void main(String[] args) {
    	Video youtubeHd = new YouTube(new FourKProcessing());
    	Video youtube4k = new YouTube(new FourKProcessing());
    	youtubeHd.playVideo();
    	youtube4k.playVideo();
    }
}
