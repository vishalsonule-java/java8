package com.mphasis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) throws IOException {
		Path path= Paths.get("f:/vishal.txt");
		Stream<String> lines = Files.lines(path);
	 List<String> list=  lines.flatMap(line->Stream.of(line.split(" ")))
			 .filter(word->Character.isUpperCase(word.charAt(0)))
			 .collect(Collectors.toList());
	list.forEach(System.out::println);
	}
}
