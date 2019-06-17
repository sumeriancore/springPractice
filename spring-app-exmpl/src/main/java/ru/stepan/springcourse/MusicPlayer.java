/**
 * 
 */
package ru.stepan.springcourse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Stsiapan Ausianikau
 *
 */
public class MusicPlayer {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Value("#{'${musicPlayer.musicList}'.split(',')}")
	private List<Music> musicList = new ArrayList();
	private String name;
	private int volume;

	public MusicPlayer() {

	}

	// IoC
	public MusicPlayer(List<Music> musicList) {
		this.musicList = musicList;
	}

	public void playMusic() {
		musicList.stream().forEach(m -> System.out.println(m.getSong()));
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}

	public List<Music> getMusicList() {
		return musicList;
	}

	public void setMusicList(List<Music> musicList) {
		this.musicList = musicList;
	}

}
