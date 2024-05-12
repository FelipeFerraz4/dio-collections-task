package com.blueFox.map.basicOperation;

import java.util.HashMap;
import java.util.Map;

import com.blueFox.exception.ElementNotFindException;
import com.blueFox.exception.EmptyMapException;

public class Dictionary {
    private Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addWord(String word, String definition) {
        dictionary.put(word, definition);
    }

    public void removeWord(String word) throws EmptyMapException {
        if (dictionary.isEmpty()) {
            throw new EmptyMapException("Empty dictionary");
        }
        dictionary.remove(word);
    }

    public Map<String, String> getWords() throws EmptyMapException {
        if (dictionary.isEmpty()) {
            throw new EmptyMapException("Empty dictionary");
        }
        return dictionary;
    }

    public String searchByWord(String word) throws EmptyMapException, ElementNotFindException {
        if (dictionary.isEmpty()) {
            throw new EmptyMapException("Empty dictionary");
        }

        String definitionByWord = null;
        definitionByWord = dictionary.get(word);
        
        if (definitionByWord == null) {
            throw new ElementNotFindException("Word not find");
        }

        return definitionByWord;
    }
}
