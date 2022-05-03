
package com.EvDroid;

public class ComputerLogic {

  public static int calculateWinStrategyAndReturnQuantityMatchesChosen(int matchesHumanRemove) {
    final int PART_OF_WIN_EXPRESSION = 4; // 4 -(minus) how_many_matches_player_remove
    return PART_OF_WIN_EXPRESSION - matchesHumanRemove;
  }
}
