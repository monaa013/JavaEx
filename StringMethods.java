import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        String text = "We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative";

        // charAt()
        System.out.println("charAt(28): " + text.charAt(28));

        // compareTo()
        String str2 = "remember seeing";
        int comparison = text.compareTo(str2);
        System.out.println("compareTo(remember seeing): " + comparison);

        // // concat()
        String str3 = " Priya Dharshini";
        String concatenatedString = text.concat(str3);
        System.out.println("concat(str3=Priya Dharshini): " + concatenatedString);

        // contains()
        boolean containsPenguin = text.contains("Penguin");
        System.out.println("contains(Penguin): " + containsPenguin);

        // endsWith()
        boolean endsWithAlternative = text.endsWith("alternative");
        System.out.println("endsWith(alternative): " + endsWithAlternative);

        // equals()
        boolean isEqual = text.equals("We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative");
        System.out.println("equals(text): " + isEqual);

        // equalsIgnoreCase()
        boolean equalsIgnoreCase = text.equalsIgnoreCase("We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative");
        System.out.println("equalsIgnoreCase(text): " + equalsIgnoreCase);

        // format()
        String formattedString = String.format("The world's cheapest car, the %s, was launched at a starting price of only Rs %d lakh.", "Tata Nano", 1);
        System.out.println("format(): " + formattedString);

        // getBytes()
        byte[] byteArray = text.getBytes();
        System.out.println("getBytes(): " + Arrays.toString(byteArray));

        // getChars()
        char[] charArray = new char[text.length()];
        text.getChars(0, text.length(), charArray, 0);
        System.out.println("getChars(): " + Arrays.toString(charArray));

        // indexOf()
        int indexOfGoal = text.indexOf("goal");
        System.out.println("indexOf(goal): " + indexOfGoal);

        // intern()
        String internedString = text.intern();
        System.out.println("intern(): " + internedString);

        // isEmpty()
        boolean isEmpty = text.isEmpty();
        System.out.println("isEmpty(): " + isEmpty);

        // join()
        String joinedString = String.join(", ", "Tata", "Nano", "car");
        System.out.println("join(,", "Tata", "Nano", "car"): " + joinedString);

        // lastIndexOf()
        int lastIndexOfAlternative = text.lastIndexOf("alternative");
        System.out.println("lastIndexOf(alternative): " + lastIndexOfAlternative);

        // length()
        int length = text.length();
        System.out.println("length(): " + length);

        // replace()
        String replacedString = text.replace("surrounding", "neighboring");
        System.out.println("replace(surrounding, neighboring): " + replacedString);

        // replaceAll()
        String replacedAllString = text.replaceAll("village", "community");
        System.out.println("replaceAll(village, community): " + replacedAllString);

        // split()
        String[] splittedWords = text.split(" ");
        System.out.println("split( ): " + Arrays.toString(splittedWords));

        // startsWith()
        boolean startsWithWe = text.startsWith("We");
        System.out.println("startsWith(We): " + startsWithWe);

        // substring()
        String substring1 = text.substring(20);
        String substring2 = text.substring(10, 20);
        System.out.println("substring(20): " + substring1);
        System.out.println("substring(10, 20): " + substring2);

        // toCharArray()
        System.out.println("toCharArray(): " + Arrays.toString(text.toCharArray()));

        // toLowerCase()
        String toLowerCaseString = text.toLowerCase();
        System.out.println("toLowerCase(): " + toLowerCaseString);

        // toUpperCase()
        String toUpperCaseString = text.toUpperCase();
        System.out.println("toUpperCase(): " + toUpperCaseString);

        // trim()
        String trimmedString = text.trim();
        System.out.println("trim(): " + trimmedString);

        // valueOf()
        int intVal = 10;
        String valueOfString = String.valueOf(intVal);
        System.out.println("valueOf(10): " + valueOfString);
}
}
