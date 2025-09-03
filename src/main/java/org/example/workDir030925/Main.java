package org.example.workDir030925;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Fee> fees = List.of(new Fee(null));
        String s = fees.stream()
                .map(Fee::getDescription)
                .filter(Objects::nonNull)
                .findFirst()
                .orElse("1");
        System.out.println(s);
    }


    public static class Fee {
        private String description;

        public Fee(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}
