package com.rushional.t9_attr_randomizer_json.models;

import com.rushional.t9_attr_randomizer_json.services.RollD6;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class StatRoll {
    List<Integer> rollsList;
    final int rollResult;

    public StatRoll() {
        rollsList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rollsList.add(RollD6.call());
        }
        rollsList.sort(Collections.reverseOrder());
        rollResult = rollsList.get(0) + rollsList.get(1) + rollsList.get(2);
    }

    //    TODO: make sure there are exactly 4 elements ordered highest to lowest
}
