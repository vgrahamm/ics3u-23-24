package lesson3;

public class FRQ {
    public static void main(String str) {
    int maxStreak = 0;
    String currentChar = str.substring(0,1);
    int currentStreak = 1;
    for (int i = 1; i < str.length(); i++) {
  if (str.substring(i,i+1) == str.substring(0,1)) {
    currentStreak++;
  } else {
    currentChar = str.substring(i,+1);
      currentStreak = 1;
  } if (currentStreak > maxStreak) {
    maxStreak = currentStreak;
  }
}
System.out.println(currentChar + " " + maxStreak);
}
}