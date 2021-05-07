package knn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Knn algorithm implementation
 */
public class KNN_Implementation {

	// created lists for storing training and testing datasets label and features.

	private List<double[]> trainfeatures = new ArrayList<>();
	private List<String> trainlabel = new ArrayList<>();

	private List<double[]> testfeatures = new ArrayList<>();
	private List<String> testlabel = new ArrayList<>();
	/*
	 * sc object for getting user input
	 */

	Scanner sc = new Scanner(System.in);
	int knn_value = 1;
	int DistanceMetricsSelction = 0;
	int totalNumberOfLabel = 0;

	/*
	 * loading training data and extracting features and label for training dataset
	 */
	void loadtrainData(String filename) throws NumberFormatException, IOException {


		File file = new File(filename);

		try {
			BufferedReader readFile = new BufferedReader(new FileReader(file));
			String line;
			while ((line = readFile.readLine()) != null) {

				String[] split = line.split(",");
				double[] feature = new double[split.length - 1];
				for (int i = 0; i < split.length - 1; i++)
					feature[i] = Double.parseDouble(split[i]);
				
				trainfeatures.add(feature);
				trainlabel.add(split[feature.length]);
			}
			readFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * loading testing data and extracting features and label for training dataset
	 * 
	 */
	void loadtestData(String testfilename) throws NumberFormatException, IOException {

		File testfile = new File(testfilename);

		try {
			BufferedReader testreadFile = new BufferedReader(new FileReader(testfile));
			PrintWriter pw = new PrintWriter("RealLabel.txt");
			String testline;
			while ((testline = testreadFile.readLine()) != null) {

				String[] split = testline.split(",");
				double[] feature = new double[split.length - 1];
				for (int i = 0; i < split.length - 1; i++)
					feature[i] = Double.parseDouble(split[i]);
				testfeatures.add(feature);
				testlabel.add(split[feature.length]);
				// writing original label for test data to file and counting number of label.
				pw.println(split[feature.length]);
				totalNumberOfLabel++;

			}
			pw.close();
			testreadFile.close();
		}

		catch (FileNotFoundException e) {
			// TODO Auto catch block
			e.printStackTrace();
		}

	}

	/*
	 * Based on user input, calling algorithm to calculate distance
	 */
	void distanceCalcualte() throws IOException {


		if (DistanceMetricsSelction == 1) {
			euclideanDistance();
			// calling accuracy method to show accuracy of model.
			accuracy();
		}

		else if (DistanceMetricsSelction == 2) {
			manhattanDistance();
			accuracy();
		}

		else {
			// if user selecting invalid options then they must select correct option.
			System.out.println("Invalid Selection");
			getKValueandDistMetrics();
			distanceCalcualte();
		}
	}

	/*
	 * EuclideanDistance Calling euclidean method to calculate distance and writing
	 * output to file.
	 * 
	 */

	@SuppressWarnings("unchecked")
	void euclideanDistance() throws FileNotFoundException {

		KNN_Distance euclidean = new KNN_Distance();

		Iterator<double[]> testITR = testfeatures.iterator();

		PrintWriter pw = new PrintWriter("EuclideanResult.txt");

		while (testITR.hasNext()) {
			
			double testF[] = testITR.next();
			
			Iterator<double[]> trainITR = trainfeatures.iterator();
			int noOfobject = 0;
			ArrayList<DistanceAndFeatures> ts = new ArrayList<>();
			while (trainITR.hasNext()) {
				double trainF[] = trainITR.next();
				double dist = 0;
				dist = euclidean.getEuclideanDistance(trainF, testF);

				String trainFeat = trainlabel.get(noOfobject);
				DistanceAndFeatures DfObject = new DistanceAndFeatures(dist, trainFeat);
				ts.add(DfObject);
				Collections.sort(ts);
				noOfobject++;

			}

			/*
			 * counting top predicted label based on k value
			 */
			int flag = 0, IR_Setsosa = 0, IR_Versicolor = 0, IR_Virginica = 0;

			while (flag < knn_value) {
				DistanceAndFeatures s = ts.get(flag);
				String s1 = s.getLabel();
				if (s1.equals("Iris-setosa"))
					IR_Setsosa++;
				else if (s1.equals("Iris-versicolor"))
					IR_Versicolor++;
				else if (s1.equals("Iris-virginica"))
					IR_Virginica++;
				flag++;

			}

			/*
			 * counting label and selecting highest label count as prediction label and
			 * writing to output file.
			 */
			if (IR_Setsosa > IR_Versicolor && IR_Setsosa > IR_Virginica) {
				//System.out.println("Iris_Sestosa=" + IR_Setsosa);
				pw.println("Iris-setosa");

			} else if (IR_Versicolor > IR_Setsosa && IR_Versicolor > IR_Virginica) {
				//System.out.println("Iris_Versicolor=" + IR_Versicolor);
				pw.println("Iris-versicolor");
			}

			else if (IR_Virginica > IR_Setsosa && IR_Virginica > IR_Versicolor) {
				//System.out.println("Iris_Virginica=" + IR_Virginica);
				pw.println("Iris-virginica");
			}
		}
		pw.close();
	}

	/*
	 * Manhattan Distance
	 * 
	 * Calling Manhattan method to calculate distance and writing output to file.
	 * 
	 */

	@SuppressWarnings("unchecked")
	void manhattanDistance() throws FileNotFoundException {
		KNN_Distance euclidean = new KNN_Distance();

		Iterator<double[]> testITR = testfeatures.iterator();

		PrintWriter pw = new PrintWriter("ManhattanResult.txt");

		while (testITR.hasNext()) {
			double testF[] = testITR.next();
			Iterator<double[]> trainITR = trainfeatures.iterator();
			int noOfobject = 0;
			ArrayList<DistanceAndFeatures> ts = new ArrayList<>();
			while (trainITR.hasNext()) {
				double trainF[] = trainITR.next();
				double dist = 0;
				dist = euclidean.getManhattanDistance(trainF, testF);

				String trainFeat = trainlabel.get(noOfobject);
				DistanceAndFeatures DfObject = new DistanceAndFeatures(dist, trainFeat);
				ts.add(DfObject);
				Collections.sort(ts);
				noOfobject++;

			}

			/*
			 * counting top predicted label based on k value
			 */

			int flag = 0, IR_Setsosa = 0, IR_Versicolor = 0, IR_Virginica = 0;

			while (flag < knn_value) {
				DistanceAndFeatures s = ts.get(flag);
				String s1 = s.getLabel();
				if (s1.equals("Iris-setosa"))
					IR_Setsosa++;
				else if (s1.equals("Iris-versicolor"))
					IR_Versicolor++;
				else if (s1.equals("Iris-virginica"))
					IR_Virginica++;
				flag++;

			}

			/*
			 * counting label and selecting highest label count as prediction label and
			 * writing to output file.
			 */

			if (IR_Setsosa > IR_Versicolor && IR_Setsosa > IR_Virginica) {
				System.out.println("Iris_Sestosa=" + IR_Setsosa);
				pw.println("Iris-setosa");

			} else if (IR_Versicolor > IR_Setsosa && IR_Versicolor > IR_Virginica) {
				System.out.println("Iris_Versicolor=" + IR_Versicolor);
				pw.println("Iris-versicolor");
			}

			else if (IR_Virginica > IR_Setsosa && IR_Virginica > IR_Versicolor) {
				System.out.println("Iris_virginica=" + IR_Virginica);
				pw.println("Iris-virginica");
			}
		}
		pw.close();
	}

	/*
	 * method to get K value and Distance metrics.
	 */

	void getKValueandDistMetrics() {

		System.out.println("Enter the K value of KNN ");
		knn_value = sc.nextInt();
		// Restricted k value less 50.
		if (knn_value > 50) {
			System.out.println("K Value is out of range.");
			getKValueandDistMetrics();
		} else {

			System.out.println(
					"Select below distance metric(1 or 2)\n1 Eucildean Distance Metrics\n2 Manhanttan Distance Metrics");
			DistanceMetricsSelction = sc.nextInt();

		}

	}

	/*
	 * Calculating accuracy for model based Euclidean and Manhattan distance.
	 */
	void accuracy() throws IOException {
		int count = 0;
		File file = null;
		if (DistanceMetricsSelction == 1) {
			file = new File("EuclideanResult.txt");
		}

		else if (DistanceMetricsSelction == 2) {
			file = new File("ManhattanResult.txt");

		}

		BufferedReader rf = new BufferedReader(new FileReader(file));
		BufferedReader label = new BufferedReader(new FileReader(new File("RealLabel.txt")));
		String s = rf.readLine();
		while (s != null) {
			String lab = label.readLine();
			if (s.equals(lab)) {

			} else {
				count++;
			}

			s = rf.readLine();
		}

		System.out.println("Accuracy is: " + ((float) 100 - (((float) count / totalNumberOfLabel) * 100)) + "%");
		rf.close();
		label.close();
	}

}
