package com.gmail.pavelvdotsenko;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TasksWithArraysTest {
    @Test
    void testFindNExistsExist() {
        assertThat(new TasksWithArrays().findNumberExists(new int[]{-1, 10, 7, 9, 5, 0, 10}, 10)).isEqualTo(true);
    }

    @Test
    void testFindNExistsNotExists() {
        assertThat(new TasksWithArrays().findNumberExists(new int[]{-1, 10, 7, 9, 5, 0, 10}, 12)).isEqualTo(false);
    }

    @Test
    void testFindStrExistsExist() {
        assertThat(new TasksWithArrays().findStringExists(new String[]{"Hi", "me", "home", "love", "yes"}, "Hi")).isEqualTo(true);
    }

    @Test
    void testFindStrExistsNotExists() {
        assertThat(new TasksWithArrays().findStringExists(new String[]{"Hi", "me", "home", "love", "yes"}, "ol")).isEqualTo(false);
    }

}