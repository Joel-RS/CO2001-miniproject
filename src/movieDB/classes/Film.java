package movieDB.classes;

import java.util.*;
import java.util.Map.Entry;

public class Film {
	private static HashMap<Integer, Film> fMap = new HashMap<Integer, Film>();
	private String title = "";
	private int filmId = -1;
	private List<Rating> ratings = new ArrayList<Rating>();
	private List<Tag> tags = new ArrayList<Tag>();
	
	public Film(String n, List<Rating> r, List<Tag> t, int i){
		title = n; ratings = r; tags = t; filmId = i;
	}
	
	public static List<Film> getFilmList(){
		return (List<Film>) fMap.values();
	}
	public void setUserList(HashMap<Integer, Film> f) {
		fMap = f;
	}
	
	public void addFilm(Film f) {
		if(!fMap.containsValue(f)) {
			fMap.put(Collections.max(fMap.keySet()), f);}
	}
	public void delFilm(Film f) {
		if(fMap.containsValue(f)){fMap.remove(getKeyByVal(fMap, f));}
		else{}
	}
	
	public List<Rating> getRatings(){
		return ratings;
	}
	public void addRating(Rating r) {
		ratings.add(r);
	}
	public void delRating(Rating r) {
		ratings.remove(r);
	}
	
	public List<Tag> getTags(){
		return tags;
	}
	public void addTag(Tag t) {
		tags.add(t);
	}
	public void delTag(Tag t) {
		tags.remove(t);
	}
	
	public List<Film> searchFilms(String s){
		List<Film> toRet = new ArrayList<Film>();
		for(Film f:fMap.values()) {
			if(f.getTitle().contains(s)) {toRet.add(f);}
		}return toRet;
	}
		
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public static <T, E> T getKeyByVal(HashMap<T, E> m, Object o){
		for(Entry<T, E> e: m.entrySet()) {
			if(Objects.equals(o, e.getValue())){return e.getKey();}
		}return null;
	}
}
