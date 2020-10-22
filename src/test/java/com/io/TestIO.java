package com.io;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestIO {
    @Test
    public void givenDirectoryWhenWatchedListsAllTheActivities() throws IOException {
        Path dir = Paths.get("F:\\PThings");
        Files.list(dir).filter(Files::isRegularFile).forEach(System.out::println);
        new WatchServiceExample(dir).processEvents();

    }
}
