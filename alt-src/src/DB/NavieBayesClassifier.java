/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;

import Analayse.whether.forcast.opensource.classifiers.NaiveBayes;
import Analayse.whether.forcast.opensource.dataobjects.NaiveBayesKnowledgeBase;
import static Analayse.whether.forcast.opensource.examples.NaiveBayesExample.readLines;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DKG
 */
public class NavieBayesClassifier {
    public static void main(String args[]){
    analayseData("63	1	4	130	254	0	2	147	0	1.4	2	1	7");
    }
     public static String replaceWords(String text) {
        text = text.replaceAll("\\bI\\b", "").trim();
        text = text.replaceAll("\\ba\\b", "").trim();
        text = text.replaceAll("\\bthe\\b", "").trim();
        text = text.replaceAll("\\bis\\b", "").trim();
        text = text.replaceAll("\\bam\\b", "").trim();
        text = text.replaceAll("\\bare\\b", "").trim();
        text = text.replaceAll("\\bthey\\b", "").trim();
        text = text.replaceAll("\\bthose\\b", "").trim();
        text = text.replaceAll("\\bthis\\b", "").trim();
        text = text.replaceAll("\\bwas\\b", "").trim();
        text = text.replaceAll("\\bit\\b", "").trim();
        text = text.replaceAll("\\s+", " ");
        return text;
    }
     //-0.3502594241041286
    public static String analayseData(String input){
      // input= replaceWords(input.toLowerCase());
       System.out.println("input "+input);
          String output = null;
        try{
          Map<String, URL> trainingFiles = new HashMap<String, URL>();
        trainingFiles.put("overcastl", NavieBayesClassifier.class.getResource("/datasets/overcastl.txt"));
        trainingFiles.put("rainy", NavieBayesClassifier.class.getResource("/datasets/rainy.txt"));
        trainingFiles.put("sunny", NavieBayesClassifier.class.getResource("/datasets/sunny.txt"));
        
      
        
        //loading examples in memory
        Map<String, String[]> trainingExamples = new HashMap<String, String[]>();
        for(Map.Entry<String, URL> entry : trainingFiles.entrySet()) {
            trainingExamples.put(entry.getKey(), readLines(entry.getValue()));
        }
        
        //train classifier
        NaiveBayes nb = new NaiveBayes();
        nb.setChisquareCriticalValue(1.67); //0.01 pvalue
        nb.train(trainingExamples);
        
        //get trained classifier knowledgeBase
        NaiveBayesKnowledgeBase knowledgeBase = nb.getKnowledgeBase();
        
        //nb = null;
      //  trainingExamples = null;
        
        
        //Use classifier
        nb = new NaiveBayes(knowledgeBase);
        
         output = nb.predict(input);
         double d=nb.getChisquareCriticalValue();
         double d1=nb.getMaxScore();
            System.out.println("critical values="+d+" max score="+d1);
       // System.out.format("The company \"%s\" was classified as \"%s\".%n", exampleEn, outputEn);
          System.out.format("The Moode  \"%s\" was classified as \"%s\".%n", input, output);
        }catch(Exception e){}
    return output;
    }
}

