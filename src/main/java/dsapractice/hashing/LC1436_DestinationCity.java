package dsapractice.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class LC1436_DestinationCity {
	
	/*
	 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. 
	 * Return the destination city, that is, the city without any path outgoing to another city.
     *It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
     *
     *
     *Input - list of String
     *Output - String
     *
     * 
     * 
     * 5.Pseudo code 
     * ->initialize set
     * ->iterate until length of given path and add it to set
     *  ->Iterate until length
     *    ->get path of one and store into temp variable
     *    ->if set doesn't contains temp variables
     *    ->return temp variable
     *  ->else return empty string
     * 
     * 
     * Time Complexity - O(n)
     * Space Complexity -


	 */
	 @Test
	    public void test1() {
	        List<List<String>> inputList = Arrays.asList(
	                Arrays.asList("London", "New York"),
	                Arrays.asList("New York", "Lima"),
	                Arrays.asList("Lima", "Sao Paulo"));

	        String result = destCity(inputList);

	        Assert.assertEquals("Sao Paulo", result);
	    }
	
	 
	 @Test
	    public void test2() {
	        List<List<String>> inputList = Arrays.asList(
	                Arrays.asList("A", "Z"));

	        String result = destCity(inputList);

	        Assert.assertEquals("Z", result);
	    }
	 
	 
	 @Test
	    public void test3() {
	        List<List<String>> inputList = Arrays.asList(
	                Arrays.asList("B", "C"),
	                Arrays.asList("D", "B"),
	                Arrays.asList("C", "A"));

	        String result = destCity(inputList);

	        Assert.assertEquals("A", result);
	    }
	
	public String destCity(List<List<String>> paths) {
		   Set<String> cities = new HashSet<String>(); 
	        for (List<String> path : paths) {
	            cities.add(path.get(0)); 
	        }
	        for (List<String> path : paths) {
	            String dest = path.get(1); 
	            if (!cities.contains(dest)) {
	                return dest; 
	            }
	        }
	        return "";
    }

}
