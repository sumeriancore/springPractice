/**
 * 
 */
package ru.stepan.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Stsiapan Ausianikau
 *
 */
public class TestSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		Music music = context.getBean("musicBean", Music.class);
//		MusicPlayer musicPlayer = new MusicPlayer(music);

		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

		musicPlayer.playMusic();

//		System.out.println("Name: " + musicPlayer.getName());
//		System.out.println("Volume: " + musicPlayer.getVolume());

		context.close();
	}

}
