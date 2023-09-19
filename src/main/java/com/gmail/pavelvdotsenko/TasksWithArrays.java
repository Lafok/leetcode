package com.gmail.pavelvdotsenko;

public class TasksWithArrays {
    public boolean findNumberExists(int[] source, int target) {
//        for (int i = 0; i < source.length; i++) {
//            if (source[i] == target) {
//                return true;
//            }
//        }
        for (var s : source) {
            if (s == target) {
                return true;
            }
        }
        return false;
    }

    public boolean findStringExists(String[] source, String target) {
//        for (int i = 0; i < source.length; i++) {
//            if (source[i].equalsIgnoreCase(target)) {
//                return true;
//            }
//        }
        for (var s : source) {
            if (s.equals(target)) {
                return true;
            }
        }

        return false;
    }
}
