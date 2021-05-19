package main;

import database.SQL_bean;
import database.SQL_connection;

public class SQL_Start {

	public static void main(String[] args) {
		
		
		if (SQL_connection.connectSQL()){
			
					
			
			System.out.println("Actors in the movie Seven: ");			
			SQL_connection.stateSQL(SQL_bean.actorSeven(), SQL_bean.requestQuery(), SQL_bean.id1());
			System.out.println("");
			System.out.println("Movies that has gotten an Oscar: ");
			SQL_connection.stateSQL(SQL_bean.oscarMovies(), SQL_bean.requestQuery2(), SQL_bean.id2());
			System.out.println("");
			System.out.println("Brad Pitts movies: ");
			SQL_connection.stateSQL(SQL_bean.bradMovies(), SQL_bean.requestQuery3(), SQL_bean.id3());
			System.out.println("");
			System.out.println("Brad Pitts award movies: ");
			SQL_connection.stateSQL(SQL_bean.pittAwards(), SQL_bean.requestQuery4(), SQL_bean.id4());
			
		}
		
	}
}
