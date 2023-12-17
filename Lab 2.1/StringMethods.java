import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        String text = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative";

        // charAt()
        System.out.println("1.charAt(28): " + text.charAt(28));

        // compareTo()
        String str2 = "remember seeing";
        int comparison = text.compareTo(str2);
        System.out.println("2.compareTo(remember seeing): " + comparison);

        // // concat()
        String str3 = " Priya Dharshini";
        String concatenatedString = text.concat(str3);
        System.out.println("3.concat(str3=Priya Dharshini): " + concatenatedString);

        // contains()
        boolean containsPenguin = text.contains("Penguin");
        System.out.println("4.contains(Penguin): " + containsPenguin);

        // endsWith()
        boolean endsWithAlternative = text.endsWith("alternative");
        System.out.println("5.endsWith(alternative): " + endsWithAlternative);

        // equals()
        boolean isEqual = text.equals("We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative");
        System.out.println("6.equals(text): " + isEqual);

        // equalsIgnoreCase()
        boolean equalsIgnoreCase = text.equalsIgnoreCase("We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative");
        System.out.println("7.equalsIgnoreCase(text): " + equalsIgnoreCase);

        // format()
        String formattedString = String.format("The world's cheapest car, the %s, was launched at a starting price of only Rs %d lakh.", "Tata Nano", 1);
        System.out.println("8.format(): " + formattedString);

        // getBytes()
        byte[] byteArray = text.getBytes();
        System.out.println("9.getBytes(): " + Arrays.toString(byteArray));

        // getChars()
        char[] charArray = new char[text.length()];
        text.getChars(0, text.length(), charArray, 0);
        System.out.println("10.getChars(): " + Arrays.toString(charArray));

        // indexOf()
        int indexOfGoal = text.indexOf("goal");
        System.out.println("11.indexOf(goal): " + indexOfGoal);

        // intern()
        String internedString = text.intern();
        System.out.println("12.intern(): " + internedString);

        // isEmpty()
        boolean isEmpty = text.isEmpty();
        System.out.println("13.isEmpty(): " + isEmpty);

        // join()
        String joinedString = String.join(", ", "Tata", "Nano", "car");
        System.out.println("14.join(',', 'Tata', 'Nano', 'car'): " + joinedString);

        // lastIndexOf()
        int lastIndexOfAlternative = text.lastIndexOf("alternative");
        System.out.println("15.lastIndexOf(alternative): " + lastIndexOfAlternative);

        // length()
        int length = text.length();
        System.out.println("16.length(): " + length);

        // replace()
        String replacedString = text.replace("surrounding", "neighboring");
        System.out.println("17.replace(surrounding, neighboring): " + replacedString);

        // replaceAll()
        String replacedAllString = text.replaceAll("village", "community");
        System.out.println("18.replaceAll(village, community): " + replacedAllString);

        // split()
        String[] splittedWords = text.split(" ");
        System.out.println("19.split( ): " + Arrays.toString(splittedWords));

        // startsWith()
        boolean startsWithWe = text.startsWith("We");
        System.out.println("20.startsWith(We): " + startsWithWe);

        // substring()
        String substring1 = text.substring(20);
        String substring2 = text.substring(10, 20);
        System.out.println("21(a).substring(20): " + substring1);
        System.out.println("21(b).substring(10, 20): " + substring2);

        // toCharArray()
        System.out.println("22.toCharArray(): " + Arrays.toString(text.toCharArray()));

        // toLowerCase()
        String toLowerCaseString = text.toLowerCase();
        System.out.println("23.toLowerCase(): " + toLowerCaseString);

        // toUpperCase()
        String toUpperCaseString = text.toUpperCase();
        System.out.println("24.toUpperCase(): " + toUpperCaseString);

        // trim()
        String trimmedString = text.trim();
        System.out.println("25.trim(): " + trimmedString);

        // valueOf()
        int intVal = 10;
        String valueOfString = String.valueOf(intVal);
        System.out.println("26.valueOf(10): " + valueOfString);
}
}
