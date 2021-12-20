package com.te.abstraction;

abstract class MediaPlayer {
	void PlaySong(String songname)
	{
		System.out.println("Its playing the mediaPlayer");
	}
	abstract void Control();
	abstract  void controler();
}
