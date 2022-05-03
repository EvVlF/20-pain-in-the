
package com.EvDroid.PlayersEntity;

import com.EvDroid.IPlayer;

public class Player implements IPlayer {
    private String name;
    private String additionalInfo;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, String additionalInfo) {
        this.name = name;
        this.additionalInfo = additionalInfo;
    }

    @Override
    public void printWhoRemoveMatches(int matchesRemoved, String player) {
        String wordEnding = matchesRemoved == 1 ? "ку": "ки";
        System.out.println("\n" + player + " убрал " + matchesRemoved + " спич" + wordEnding);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
