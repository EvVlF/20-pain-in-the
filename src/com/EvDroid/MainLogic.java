package com.EvDroid;

import com.EvDroid.PlayersEntity.Player;

import java.util.Scanner;

public class MainLogic {

  static final int matchesQuantity = 20;
  static final int FIRST_TURN_COMPUTER_MATCHES_REMOVE = 3;
  static Scanner playerInputScanner = new Scanner(System.in);
  static int matchesRemove = 0;
  static int matchesLeft = matchesQuantity;

  public static void main(String[] args) {
    Player computer =
        new Player("Благородный компухтер", "И восстали машины из пепла ядерного огня...");
    Player player = new Player("кожаный мешок");

    Messages.printStartGame();
    Messages.printRules();
    Messages.printMatchesLeft(matchesLeft);
    matchesLeft = matchesQuantity - FIRST_TURN_COMPUTER_MATCHES_REMOVE;
    computer.printWhoRemoveMatches(FIRST_TURN_COMPUTER_MATCHES_REMOVE, computer.getName());
    Messages.printMatchesLeft(matchesLeft);
    while (matchesLeft > 1) {
      Messages.printEnterHowManyMatchesYouChoose();
      matchesRemove = setInputAndReturnMatchesRemove();
      matchesLeft -= matchesRemove;
      Messages.printMatchesLeft(matchesLeft);
      matchesRemove =
          ComputerLogic.calculateWinStrategyAndReturnQuantityMatchesChosen(matchesRemove);
      computer.printWhoRemoveMatches(matchesRemove, computer.getName());
      matchesLeft -= matchesRemove;
      Messages.printMatchesLeft(matchesLeft);
    }
    Messages.printWinnerLoserAndEndGame(computer.getName(), player.getName());
  }

  public static int setInputAndReturnMatchesRemove() {
    int localForParseInputToInt = 0;
    do {
      try {
        localForParseInputToInt = Integer.parseInt(playerInputScanner.next());
        System.out.println("Глюпий что-ли? Введи число от 1 до 3");
      } catch (NumberFormatException ex) {
        System.out.println("Отличаешь вообще цифры от букв и символов?");
      }
    } while (localForParseInputToInt > 3 || localForParseInputToInt < 1);
    return localForParseInputToInt;
  }
}
