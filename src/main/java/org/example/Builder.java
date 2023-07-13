package org.example;

public class Builder {


    public static String builderString(String word1, String word2, String word3){
        StringBuilder builder = new StringBuilder();
        builder.append(word1);
        builder.append(word2);
        builder.append(word3);

        return builder.toString();

    }

}
