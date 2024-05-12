package com.blueFox.map.search;

import com.blueFox.exception.EmptyMapException;

public class WordCountTest {
    public static void main(String[] args) {
        try {
            WordCount wordCount = new WordCount();

            wordCount.addWord("Milk", 7);
            wordCount.addWord("Bread", 9);
            wordCount.addWord("Screen", 5);

            System.out.println(wordCount.getWordsCount());
            System.out.println(wordCount.findMostFrequentWord());

            wordCount.removeWord("Screen");

            System.out.println(wordCount.getWordsCount());

        } catch (EmptyMapException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
