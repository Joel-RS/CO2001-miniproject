package movieDB.classes;

public class Rating {
	
	private int filmId, userId;
	private double rating;
		
	public Rating(int f, int u, double r) {
		filmId = f;
		userId = u;
		rating = r;
	}

	public int getFilmId() {return filmId;}
	public void setFilmId(int filmId) {this.filmId = filmId;}

	public int getUserId(){return userId;}
	public void setUserId(int userId){this.userId = userId;}

	public double getRating(){return rating;}
	public void setRating(double rating){this.rating = rating;}
}
