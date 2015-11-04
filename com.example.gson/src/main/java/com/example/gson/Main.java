package com.example.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	public static void main(String[] args) {

		Student obj = new Student("Jack", "James", 10, 200);

		Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();

		Gson uglyJson = new Gson();

		String pretJson = prettyGson.toJson(obj);

		System.out.println("Pretty printing: " + pretJson);

		String ugJason = uglyJson.toJson(obj);

		System.out.println("\nUgly printing: " + ugJason);

	}
}
