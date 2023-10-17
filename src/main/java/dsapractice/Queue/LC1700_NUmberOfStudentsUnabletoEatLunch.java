package dsapractice.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LC1700_NUmberOfStudentsUnabletoEatLunch {
	
	/*
	 * The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively. 
	 * All students stand in a queue. Each student either prefers square or circular sandwiches.
     *The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack. At each step:
     *If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.
     *Otherwise, they will leave it and go to the queue's end.
     *This continues until none of the queue students want to take the top sandwich and are thus unable to eat.
     *You are given two integer arrays students and sandwiches where sandwiches[i] is the type of the 
     *i​​​​​​th sandwich in the stack (i = 0 is the top of the stack) and students[j] is the preference of the j​​​​​​th student in the initial queue (j = 0 is the front of the queue). 
     *Return the number of students that are unable to eat.
     *
     *
     *Pseudocode
     *->Initialize queue for students list
     *->Initialize queue for sandwiches types
     *->Iterate using for loop and add it to corresponding queues
     *  
     *
     *
	 */
	
	public int countStudents(int[] students, int[] sandwiches) {
		
		
	       Queue<Integer> q=new LinkedList<Integer>();
	        for(int i:students)
	            q.add(i);
	        Queue<Integer> s=new LinkedList<Integer>();
	        for(int i:sandwiches)
	            s.add(i);
	        while(s.size()>0 && wants(q,s))
	        {
	            int sw=q.remove();
	            if(sw==s.peek())
	            {
	                int i=s.remove();
	            }
	            else
	            {
	                q.add(sw);
	            }
	        }
	        return q.size();
	        
	    }
	    public boolean wants(Queue st,Queue sn)
	    {
	        if(st.contains(sn.peek()))
	            return true;
	        return false;
	    }  
	    

}
