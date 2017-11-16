package movieDB.classes;

public class Tag{

	private int filmId, userId;
	private String tag;
		
	public Tag(int u, String t){
		userId = u;
		tag = t;
	}

	public int getUserId(){return userId;}
	public void setUserId(int userId){this.userId = userId;}

	public String getTag(){return tag;}
	public void setTag(String tag){this.tag = tag;}
	

}
