package com.blueFox.map.basicOperation;

import com.blueFox.exception.ElementNotFindException;
import com.blueFox.exception.EmptyMapException;

public class DictionaryTest {
    public static void main(String[] args) {
        try {
            Dictionary dictionary = new Dictionary();

            dictionary.addWord("screenshot", "an image of the display on a screen, used when showing how a program works.");
            dictionary.addWord("milk", "the white liquid produced by cows, goats and some other animals as food for their young and used as a drink by humans.");

            System.out.println(dictionary.getWords());
            System.out.println(dictionary.searchByWord("milk"));

            dictionary.removeWord("milk");

            System.out.println(dictionary.getWords());

        } catch (EmptyMapException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ElementNotFindException e) {
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
