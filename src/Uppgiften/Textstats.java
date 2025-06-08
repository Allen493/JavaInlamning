package Uppgiften;

public class Textstats {
    //gör ett attribut
    private int totalChars = 0;
    private int numberOfLines = 0;

    public void readLine(String line) {
        totalChars += line.length();
        numberOfLines++;
    }

    public boolean checkForStop(String line) {
        return line.equalsIgnoreCase("stop");
    }

    //returnerar värdet på attributen
    public int getTotalCharacters() {
        return totalChars;
    }

    public int getTotalLines() {
        return numberOfLines;
    }
}
