package com.blueFox.map.search;

import java.util.HashMap;
import java.util.Map;

import com.blueFox.exception.EmptyMapException;

public class WordCount {
    private Map<String, Integer> wordCount;

    public WordCount() {
        this.wordCount = new HashMap<>();
    }

    public void addWord(String word, int count) {
        wordCount.put(word, count);
    }

    public void removeWord(String word) throws EmptyMapException {
        if(wordCount.isEmpty()) {
            throw new EmptyMapException("Empty word set");
        }
        wordCount.remove(word);
    }

    public Map<String, Integer> getWordsCount() throws EmptyMapException {
        if(wordCount.isEmpty()) {
            throw new EmptyMapException("Empty word set");
        }
        return wordCount;
    }

    public Map<String, Integer> findMostFrequentWord() throws EmptyMapException {
        if(wordCount.isEmpty()) {
            throw new EmptyMapException("Empty word set");
        }
        String wordMostFrequent = null;
        Integer mostFrequentWord = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> word : wordCount.entrySet()) {
            Integer frequent = word.getValue();
            if(frequent >= mostFrequentWord) {
                mostFrequentWord = frequent;
                wordMostFrequent = word.getKey();
            }
        }

        Map<String, Integer> wordFrequent = new HashMap<>();
        wordFrequent.put(wordMostFrequent, mostFrequentWord);
        return wordFrequent;
    }

    
}
