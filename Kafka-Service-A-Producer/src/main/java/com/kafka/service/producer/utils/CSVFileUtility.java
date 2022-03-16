package com.kafka.service.producer.utils;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class CSVFileUtility<T> {
    //fucntion to read csv file which has header
    public CsvToBean readCSVFile(String filePath,T classObject) throws IOException {
        Reader readFile = Files.newBufferedReader(Paths.get(filePath.trim()));
       CsvToBean records = new CsvToBeanBuilder(readFile).withType(classObject.getClass())
                .withIgnoreLeadingWhiteSpace(true)
                .withSkipLines(1)
                .build();
        return  records;

    }

    public void trimFile(String filepath){
        File file = new File(filepath);

        try {
            String[] trim = {};
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);
            writer.writeNext(trim);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
