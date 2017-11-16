package movieDB.classes;

import java.io.*;
import java.util.*;

public class Reg {

	public static void saveFilm() {
		File f = new File("data/filmList");
		f.getParentFile().mkdirs();
		FileOutputStream foo;
		ObjectOutputStream ooo;
		
		try {
			
			foo = new FileOutputStream(f);
			ooo = new ObjectOutputStream(foo);			
			
			ooo.writeObject(Film.getFMap());
			
			ooo.close(); foo.close();
		}catch (Exception e) {e.printStackTrace();}
	}
	public static void saveUser() {
		File f = new File("data/userList");
		f.getParentFile().mkdirs();
		FileOutputStream foo;
		ObjectOutputStream ooo;
		
		try {			
			foo = new FileOutputStream(f);
			ooo = new ObjectOutputStream(foo);			
			
			ooo.writeObject(User.getUMap());
			
			ooo.close(); foo.close();
		}catch (Exception e) {e.printStackTrace();}
	}
	
	@SuppressWarnings("unchecked")
	public static void loadFilm() {
		File f = new File("data/filmList");
		HashMap<Integer, Film> h = new HashMap<Integer, Film>();
		FileInputStream fii;
		ObjectInputStream oii;
		
		try {
			fii = new FileInputStream(f);
			oii = new ObjectInputStream(fii);
	
			h = (HashMap<Integer, Film>)oii.readObject();
			Film.setFilmList(h);
			
		} catch (Exception e) {e.printStackTrace();}
	}
	@SuppressWarnings("unchecked")
	public static void loadUser() {
		File f = new File("data/userList");
		HashMap<Integer, User> h = new HashMap<Integer, User>();
		FileInputStream fii;
		ObjectInputStream oii;
		
		try {
			fii = new FileInputStream(f);
			oii = new ObjectInputStream(fii);
	
			h = (HashMap<Integer, User>)oii.readObject();
			User.setUserList(h);
			
		} catch (Exception e) {e.printStackTrace();}
	}
}