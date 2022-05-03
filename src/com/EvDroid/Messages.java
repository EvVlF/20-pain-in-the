
package com.EvDroid;

public class Messages {

  public static void printStartGame() {
    System.out.println("Игра началась!");
  }

  public static void printEnterHowManyMatchesYouChoose() {
    System.out.println("\nТвоя очередь. Сколько спичек нужно убрать?\nВведи число от 1 до 3:");
  }

  public static void printMatchesLeft(int matchesLeft) {
    System.out.println("Спичек осталось: " + matchesLeft);
  }

  public static void printWinnerLoserAndEndGame(String winner, String loser) {
        System.out.println("\nПобедитель как всегда " + winner + ". А ты, " + loser + ", проиграл");
  }

  public static void printRules() {
    System.out.println("\nВ начале игры на столе лежит 20 спичек. " +
            "\nИгроки ходят по очереди, убирая на выбор 1, 2 или 3 спички. " +
            "\nПроигравшим считается тот, кто возьмет со стола последнюю спичку\n");
  }

}
