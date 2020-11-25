/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class WordDictionary {
    
    private static class Word
    {
        private int idToken;
        private String palavraReservada;
        
        Word(int id, String palavraReservada)
        {
            this.idToken=id;
            this.palavraReservada = palavraReservada;
        }
    }
    
    private static ArrayList<Word> lstWord;
        
    public WordDictionary()
        {
              this.lstWord = new ArrayList<Word>();
              BuildDictionary();
        }
    
        private static void BuildDictionary()
        {
            lstWord.add(new Word(0,"programa"));
            lstWord.add(new Word(1,"declare"));
            lstWord.add(new Word(2,"leia"));
            lstWord.add(new Word(3,"escreva"));
            lstWord.add(new Word(4,"se"));
            lstWord.add(new Word(5,"entao"));
            lstWord.add(new Word(6,"senao"));
            lstWord.add(new Word(7,"fimprog"));
        }
        
        public static int SearchReservedWord(String key)
        {
            return -1;
        }
    }
    
    
    
    

