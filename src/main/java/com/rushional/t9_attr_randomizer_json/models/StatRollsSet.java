package com.rushional.t9_attr_randomizer_json.models;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
public class StatRollsSet {
    List<StatRoll> statRollsList;

    public StatRollsSet() {
        statRollsList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            statRollsList.add(new StatRoll());
        }
        statRollsList.sort(Comparator.comparingInt(StatRoll::getRollResult).reversed());
    }
}
