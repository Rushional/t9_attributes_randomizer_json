package com.rushional.t9_attr_randomizer_json.services;

import java.util.Random;

public class RollD6 {
    public static int call() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }
}
