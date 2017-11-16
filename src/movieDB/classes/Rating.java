package movieDB.classes;

public class Rating {
	
	private int filmId, userId;
	private double rating;
		
	public Rating(int u, double r) {
		userId = u;
		rating = r;
	}

	public int getUserId(){return userId;}
	public void setUserId(int userId){this.userId = userId;}

	public double getRating(){return rating;}
	public void setRating(double rating){this.rating = rating;}
}
