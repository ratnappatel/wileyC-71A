package knn;

/*
 * This class is for calculating  Euclidean and Manhattan distance. 
 *   */

// DATA SET : PICKUP ONLY NUMERIC VALUES 

public class KNN_Distance {
	
	public double getEuclideanDistance( double[] features1,  double[] features2) {
        double sum = 0;
        for (int i = 0; i < features1.length; i++)
        {  //System.out.println(features1[i]+" "+features2[i]);
        	//applied Euclidean distance formula
        	
            sum += Math.pow(features1[i] - features2[i], 2);
        }
        return Math.sqrt(sum);
    }
	
	public double getManhattanDistance(final double[] features1, final double[] features2) {
        double sum = 0;
        for (int i = 0; i < features1.length; i++)
        	//Applied Manhattan distance formula
            sum += Math.abs(features1[i] - features2[i]);
        return sum;
    }


}
