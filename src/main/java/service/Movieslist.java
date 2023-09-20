package service;

import org.springframework.stereotype.Service;

import model.Movies;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class Movieslist {
	
	
	List<Movies> movielist = Arrays.asList(new Movies("One","1o1","Jaip"),
			new Movies("two","102","delhi"));
	
	
	
	public List<Movies> getMovies() {
		return movielist;};
	
	
		
		public void addMovie() {};
		
		
		
		
		public void updateMovies(Movies mv, String id)
		{
			
			for(int i=0;i<movielist.size();i++)
				
			{
				
				Movies m = movielist.get(i);
				
				if(m.getMid().equals(id))
				{
					
					movielist.set(i, m);
					break;
				}
			
		}
		}
		
		
		public List<Movies> getMoviesbyDate(Date dt) {
			
			
			return movielist;};
		
	

}
