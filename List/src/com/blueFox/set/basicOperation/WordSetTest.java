package com.blueFox.set.basicOperation;

import com.blueFox.set.exception.ElementNotFindException;
import com.blueFox.set.exception.EmptySetException;

public class WordSetTest {
    public static void main(String[] args) {
        try {
            WordSet wordSet = new WordSet();

            // System.out.println(wordSet.getWords());
            // wordSet.removeWord("Olá");
            System.out.println(String.format(null, args));

            wordSet.addWord("Olá");
            wordSet.addWord("Gato");
            wordSet.addWord("Cachorro");
            
            wordSet.removeWord("Elefante");

            System.out.println(wordSet.checkWord("Gato"));
            System.out.println(wordSet.checkWord("Elefante"));
            
            wordSet.removeWord("Olá");

            System.out.println(wordSet.getWords());

        } catch (EmptySetException e) {
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
