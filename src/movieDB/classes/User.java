package movieDB.classes;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class User implements Serializable{
	
	private static final long serialVersionUID = -3490218767856592143L;
	private static HashMap<Integer, User> uMap = new HashMap<Integer, User>();
	private String userName, gender, password;
	private int userId, age;
	
	public User(String n, String g, String p, int a) {
		userName = n; gender = g; password = p;	age = a;
	}
	
	public static List<User> getUserList()		{
		return  new ArrayList<User>(uMap.values());}	
	public static void setUserList(HashMap<Integer, User> m){
		uMap = m;}
	public static void addUser(User u) 				{
		if(!uMap.containsValue(u)){
			if(!(uMap.keySet().size() < 1)) {
				uMap.put(Collections.max(uMap.keySet()), u);}else{uMap.put(0,u);}}
	}
	public void delUser(User u)					{
		if(!uMap.containsValue(u)){/* throw new userDontExist exception */}
		else{uMap.remove(getKeyByVal(uMap, u));}}
		
	public String getUserName()					{return userName;}
	public void setUserName(String userName)	{this.userName = userName;}

	public String getGender()					{return gender;}
	public void setGender(String gender) 		{this.gender = gender;}

	public String getPassword()					{return password;}
	public void setPassword(String password)	{this.password = password;}
	
	public int getAge() 						{return age;}
	public void setAge(int age) 				{this.age = age;}

	public int getUserId() 						{return userId;}
	public void setUserId(int userId) 			{this.userId = userId;}
	
	public static HashMap<Integer, User> getUMap(){
		return uMap;
	}
	
	/*
	public String toString() 					{
		String toRet;
		toRet = userName+","+gender+","+password+","+age;
		return toRet;
	}
	
	public static void saveUsers() {
		File users = new File("users/userList");
		users.getParentFile().mkdirs();
		try {
			FileWriter fw = new FileWriter(users);
			for(Entry<Integer, User> e: uMap.entrySet()){fw.write(e.getKey()+","+e.getValue().toString()+"\n"); fw.close();}
		}catch (IOException e) {e.printStackTrace();}
		
	}
	public static void loadUsers() throws FileNotFoundException {
		File users = new File("users/userList");
		try {
			BufferedReader buf = new BufferedReader(new FileReader(users));
			HashMap<Integer, User> h = new HashMap<Integer, User>();
			for(String s; (s = buf.readLine()) != null;) {
				String[] u = s.split("\\s*,\\s*");
				h.put(Integer.parseInt(u[0]), new User(u[1], u[2], u[3], Integer.parseInt(u[4])));
			}
			setUserList(h);
			buf.close();
		}catch (IOException e) {e.printStackTrace();}
	}
	*/
	
	public static <T, E> T getKeyByVal(HashMap<T, E> m, Object o){
		for(Entry<T, E> e: m.entrySet()) {
			if(Objects.equals(o, e.getValue())){return e.getKey();}
		}return null;
	}

}
