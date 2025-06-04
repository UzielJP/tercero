package ar.edu.unlp.oo1.ejercicio1.impl;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

import otros.PasarAMayusculas;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean isFeatured;
	Logger logger = Logger.getLogger("mi.logger"); 

	public WallPostImpl() {
		this.text = "Undefined post";
		FileHandler fl = new FileHandler("logfile.log");
		fl.setFormatter(new PasarAMayusculas());
		logger.addHandler(fl);
	}

	public WallPostImpl(String text, int likes, boolean isFeaured) {
		this.text = text;
		this.likes = likes;
		this.isFeatured = isFeaured;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;

	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		this.likes = this.likes + 1;
		if(this.likes==10)
		{
			logger.warning("Likes llegaron a 10");
		}
	}

	@Override
	public void dislike() {
		if (likes > 0) {
			this.likes = this.likes - 1;
		}
		else
		{
			logger.warning("Likes llegaron a 0");
		}

	}

	@Override
	public boolean isFeatured() {
		return this.isFeatured;
	}

	@Override
	public void toggleFeatured() {
		this.isFeatured = !this.isFeatured;

	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
	 * forma adecuada
	 */

	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}
