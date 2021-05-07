package knn;

import java.io.IOException;
import java.util.Scanner;

public class KNN_main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Welcome, This program is implementation of KNN algorthim for IRIS Dataset");
		Scanner sc=new Scanner(System.in);
		KNN_Implementation trn_ds=new KNN_Implementation();
		System.out.println("Enter training dataset file name");
		
		String trainfilename=sc.nextLine();
		System.out.println("Enter test dataset file name");
		String testfilename=sc.nextLine();
		trn_ds.getKValueandDistMetrics();
		  
		trn_ds.loadtrainData(trainfilename);
		trn_ds.loadtestData(testfilename);
		 // trn_ds.loadtrainData("knn_train.txt");
		  //trn_ds.loadtestData("knn_test.txt");
		  trn_ds.distanceCalcualte();
		 
		 
		 
		  sc.close();
		  
	}

}


