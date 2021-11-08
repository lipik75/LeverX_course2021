package homework1;

import com.leverx.homework1.countwords.words.Words;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Files.readAllLines;
import static org.junit.Assert.assertEquals;

public class WordsExerciseTest {

    @Test
    public void testWords() throws IOException {
        final String result = readPathToString(Paths.get("src/test/resources/sherlockResult.txt"));

        final List<String> lines = Stream.concat(
                Files.lines(Paths.get("src", "test", "resources", "sherlock12.txt"), Charset.forName("windows-1251")),
                Files.lines(Paths.get("src", "test", "resources", "sherlock34.txt"), Charset.forName("windows-1251"))
        ).collect(Collectors.toList());

        assertEquals(result, new Words().countWords(lines));
    }

    private String readPathToString(final Path path) {
        try {
            return String.join("\n", readAllLines(path, StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

}
