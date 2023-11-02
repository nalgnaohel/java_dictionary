package com.example.java_dictionary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("dictionary.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Dictionary App");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        //ArrayList<Word> wordsList = new ArrayList<Word>();
        launch();
        /*
        try {
            FileReader fr = new FileReader("src/main/resources/data/dictionaries.txt");
            BufferedReader br = new BufferedReader(fr);
            String engWord = br.readLine();
            engWord = engWord.replace("|", "");
            engWord = engWord.trim();
            String line;
            String meaning = "";
            while ((line = br.readLine()) != null) {
                if (!line.startsWith("|")) {
                    meaning += line.trim() + "\n";
                } else {
                    //an E word
                    Word word = new Word(engWord, meaning);
                    wordsList.add(word);
                    meaning = "";
                    engWord = line.replace("|", "");
                    engWord = engWord.trim();
                }
            }
            Word word = new Word(engWord, meaning);
            wordsList.add(word);
        } catch (IOException e) {
            System.out.println("Cannot find the file!\n");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
        for (int i = 0; i < 10; i++) {
            Word curWord = wordsList.get(i);
            System.out.println(curWord.getWordTarget());
            System.out.println(curWord.getWordMeaning());
        }*/
    }
}