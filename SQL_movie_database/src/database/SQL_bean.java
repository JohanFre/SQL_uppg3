package database;

public class SQL_bean {
	
	private static String actorSeven = "Seven";
	private static String oscarMovies = "Oscar";
	private static String bradMovies = "Brad Pitt";
	private static String pittAwards = "Brad Pitt";
	
	static String requestQuery = "SELECT `movies_actor_id` FROM `movies` WHERE `movies_id` = ?";
	static String requestQuery2 = "SELECT `movies_id` FROM `movies` WHERE `movies_award` = ?";
	static String requestQuery3 = "SELECT `movies_id` FROM `movies` WHERE `movies_actor_id` = ?";
	static String requestQuery4 = "SELECT `movies_prizes` FROM `movies` WHERE `movies_actor_id` = ?";
	static String id1 = "movies_actor_id";
	static String id2 = "movies_id";
	static String id3 = "movies_id";
	static String id4 = "movies_prizes";
	
	public static String actorSeven() {
		return actorSeven;
	}
	
	public static String oscarMovies() {
		return oscarMovies;
	}
	
	public static String bradMovies() {
		return bradMovies;
	}
	
	public static String pittAwards() {
		return pittAwards;
	}
	public static String requestQuery() {
		return requestQuery;
	}
	public static String requestQuery2() {
		return requestQuery2;
	}
	public static String requestQuery3() {
		return requestQuery3;
	}
	public static String requestQuery4() {
		return requestQuery4;
	}
	public static String id1() {
		return id1;
	}
	public static String id2() {
		return id2;
	}
	public static String id3() {
		return id3;
	}
	public static String id4() {
		return id4;
	}
	

}
