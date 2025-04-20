package b_12_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import inputTools.InputTools;

public class Primzahlen {
	public static void main(String[] args) {
//		Primzahlen p1 = new Primzahlen(5, 50, "Test.txt");
//		p1.PAusgabe("Test.txt");
		Primzahlen p2 = new Primzahlen(InputTools.readInteger("Beginn des Intervalls: "),
				InputTools.readInteger("Ende des Intervalls: "), InputTools.readString("Dateiname: "));
		p2.PAusgabe("test.jpg");
	}
	//bei ints mit dataoutputstream normalerweise

	public void PAusgabe(String dateiName) {
		try {
			File datei = new File(dateiName);
			FileReader fr = new FileReader(datei);
			BufferedReader br = new BufferedReader(fr);
			String zeile;
			while (br.ready()) { // nicht-blockierendes Lesen
				int i = 0;
				while (i < 3) {
					if (br.ready() == false) {
						break;
					}
					System.out.printf("%-10s", br.readLine());
					i++;
				}
				System.out.println();
			}
			br.close();
			fr.close();
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}

	public Primzahlen(int a, int b, String dateiName) {
		write(PrimzahlenIntervall(a, b), dateiName);
		System.out.println("Finished! wrote to " + dateiName);
	}

	private int[] PrimzahlenIntervall(int a, int b) { // returns an array with all Prims in the intervall
		int[] arr = new int[b];
		int j = 0;
		for (int i = a; i < b; i++) {
			int x = checkPrim(i);
			if (x != 0) {
				arr[j] = x;
				j++;
			}
		}
		return arr;
	}

	private void write(int[] arr, String dateiName) { // writes to File
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 0) {
//				break;
//			}
//			System.out.println(arr[i]);
//		}
		try {
			File datei = new File(dateiName);
			FileWriter fw = new FileWriter(datei);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					break;
				}
				bw.write("" + arr[i]);
				bw.newLine();
			}
			bw.flush();
			fw.close();
			bw.close();
		} catch (IOException ioe) {
			System.out.println(ioe);
		} finally {
			System.out.println("Finished writing");
		}
	}

	private int checkPrim(int x) { // checks if a given number is a prim, returns 0 if false
		for (int j = (x - 1); j > 1; j--) {
			if (x % j == 0) {
				x = 0;
				break;
			}
		}
		return x;
	}
}
