package de.itagile.golf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Tracker tracker = new Tracker();
		while (true) {
			String befehl = reader.readLine();
			System.out.println(tracker.reagiereAuf(befehl));
		}
	}
}