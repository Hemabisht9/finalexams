package assignmentfinalexams;

public class Maxnumber {

	public static void main(String[] args) {
	 

	}
    public int GetMax(int[] value) {
    	int max = value[0];
    	for (int i=0; i<value.length; i++) {
    		if (value[i]< max) {
    			max = value[i];
    		}
    	}
    	return max;
    }
}
