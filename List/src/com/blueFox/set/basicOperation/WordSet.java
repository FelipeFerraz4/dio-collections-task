package com.blueFox.set.basicOperation;

import java.util.HashSet;
import java.util.Set;

import com.blueFox.set.exception.ElementNotFindException;
import com.blueFox.set.exception.EmptySetException;

public class WordSet {
    private Set<String> wordSet;

    public WordSet() {
        this.wordSet = new HashSet<>();
    }

    public void addWord(String word) {
        wordSet.add(word);
    }

    public void removeWord(String word) throws ElementNotFindException, EmptySetException {
        if (!wordSet.isEmpty()) {
            if(wordSet.contains(word)) {
                wordSet.remove(word);
            } else {
                throw new ElementNotFindException("Word Not Find");
            }
        } else {
            throw new EmptySetException("Empty word set");
        }
    }

    public boolean checkWord(String word) {
        return wordSet.contains(word);
    }

    public Set<String> getWords() throws EmptySetException{
        if(!wordSet.isEmpty()) {
            return wordSet;
        } else {
            throw new EmptySetException("Empty word set");
        }
    }
}
