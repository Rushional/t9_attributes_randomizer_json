package com.rushional.t9_attr_randomizer_json.models;

import com.rushional.t9_attr_randomizer_json.services.RollD6;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class StatRoll {
    List<Integer> diceRolls;
    final int rollResult;

    public StatRoll() {
        diceRolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            diceRolls.add(RollD6.call());
        }
        diceRolls.sort(Collections.reverseOrder());
        rollResult = diceRolls.get(0) + diceRolls.get(1) + diceRolls.get(2);
    }

    //    TODO: make sure there are exactly 4 elements ordered highest to lowest
}
