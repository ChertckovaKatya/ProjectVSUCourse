package Cathedra.Model;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FileProcessing {


    public void  parsingFile (String name) throws IOException {

        File file = new File(name);
        if (file.isFile()){
            List<String> lines;
            Path filePars = Paths.get("D://ProjectCathedra//src//main//java//AllFilesTXT",name);
            lines = Files.readAllLines(filePars, StandardCharsets.UTF_8);
            Stream<String> QuestionsAnswer = lines.stream();
            String FirstLine = String.valueOf(QuestionsAnswer.limit(1).toArray());
            ArrayList arrayFirstLine= new ArrayList(Arrays.asList(FirstLine.split("|")));
            String Subject = arrayFirstLine.get(1).toString(); //Название предмета
            Integer NumberOfQuestions = (Integer)arrayFirstLine.get(2); // Количество вопросов
            Integer LeadTime = (Integer)arrayFirstLine.get(3); // Время выполнения теста
            Integer TotalScore = (Integer)arrayFirstLine.get(4); //Общий балл за тест

            List<String> ListOfQuestionsAnswers = Arrays.asList((String.valueOf(QuestionsAnswer.skip(1))).split(","));








        }
    }
}
