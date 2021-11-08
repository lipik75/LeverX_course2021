package com.leverx.homework1.countwords.words;

import java.util.*;
import java.util.stream.Collectors;

public class Words {

    public String countWords(List<String> lines) {

        Map<String, Integer> mapOfWords = new TreeMap<>();

        List<String> list = lines.stream()
                .map(value -> value
                        .replaceAll("[…,:;'?!@().]", " "))
                .map(newValue -> newValue
                        .replaceAll("[^A-Za-z ]+", "")
                        .toLowerCase()
                        .split("\\s+"))
                .flatMap(Arrays::stream).filter(s -> s.length() > 3)
                .collect(Collectors.toList());
        list.forEach(word -> mapOfWords.put(word, mapOfWords.containsKey(word) ? mapOfWords.get(word) + 1 : 1));

        Map<String, Integer> sotedMap = mapOfWords.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        StringBuilder stringBuilder = new StringBuilder();

        sotedMap.entrySet().stream().filter(entry -> entry.getValue() >= 5)
                .forEachOrdered(entry -> stringBuilder
                .append(entry.getKey())
                .append(" - ")
                .append(entry.getValue())
                .append("\n"));

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
