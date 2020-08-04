/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_4;

import java.util.HashMap;
import java.util.Map;



/**
 *
 * @author divan4ik42
 */
public class UnickWordsCount_1 {
    public static void main(String[] args) {
        
        String text = "я ленивая задница, мне лень потратить 10 минут на решение простейшей задачи. Я лучше пойду поем.";
        String [] words = text.toLowerCase().replaceAll("[-.?!),:]", "").split("\\s");
        
        Map<String, Integer> counter = new HashMap<>();
        for (String word : words){
            if(!word.isEmpty()){
                Integer count = counter.get(word);
                if(count == null){
                    count = 0;
                }
                counter.put(word, ++count);
            }
              
        }
        for(String word : counter.keySet()){
            System.out.println(word + ": " + counter.get(word));
        }
    
    
}
}
