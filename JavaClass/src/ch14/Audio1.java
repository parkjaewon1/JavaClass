package ch14;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Audio1 extends Frame implements ActionListener{ 
	AudioClip audio; 
	Button play, stop, loop;
	public Audio1() {
		setLayout(new FlowLayout()); stop = new Button("stop");
		play = new Button("play");   loop = new Button("loop");
		audio = Applet.newAudioClip(getClass().getResource("SPACE.AU"));
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);			}		});
		play.addActionListener(this);		stop.addActionListener(this);
		loop.addActionListener(this);
		add(play); add(stop); add(loop);
		setSize(200, 200); setVisible(true);
	}
	public static void main(String[] args) {	new Audio1();	}
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		if (btn==play) audio.play();
		else if (btn==stop) audio.stop();
		else audio.loop();
	}
}