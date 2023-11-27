package homework.week04.wordcounter;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class WordCounter {
    public static void main(String[] args) {
        String inputFile = "src/main/resources/inputText.txt";
        String outputFile = "src/main/resources/uniqueWordNumber.txt";

        try {
            List<String> inputLines = FileUtils.readLines(new File(inputFile), StandardCharsets.UTF_8);
            String inputText = StringUtils.join(inputLines, StringUtils.SPACE);
            String[] allWords = StringUtils.split(inputText);
            Set<String> uniqueWords = Arrays.stream(allWords)
                    .map(String::toLowerCase)
                    .collect(Collectors.toSet());

            FileUtils.writeStringToFile(new File(outputFile), "Number of unique words: " + uniqueWords.size(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("The file does not exist or invalid path: " + e.getMessage());
        }
    }
}