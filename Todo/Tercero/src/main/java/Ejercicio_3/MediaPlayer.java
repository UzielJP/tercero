package Ejercicio_3;

import java.util.List;

public class MediaPlayer {

	private List<Media> media;
	
	public void play()
	{
		this.media.getFirst().play();
	}
	
}
