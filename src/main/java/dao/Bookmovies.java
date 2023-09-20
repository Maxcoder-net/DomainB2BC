package dao;

import java.util.Date;
import java.util.List;

import model.Movies;

public interface Bookmovies {
	
	@SuppressWarnings("unchecked")
	public default List<Movies> browsemovies(Date dt, String city) {
		
		if (dt != null && city != null)
		{
			//
		}
		
		
		return (List<Movies>) new Movies();
	
	}

}
