package f.jdk8;

import java.util.StringJoiner;

public class StringJoinerSample {
    public static void main(String[] args){
        StringJoinerSample sample = new StringJoinerSample();
        sample.joinStringOnlyComma(new String[]{"StudyHard","GodOfJava","Book"});
    }
    
    public void joinStringOnlyComma(String[] stringArray){
        StringJoiner joiner = new StringJoiner(",","(",")");
        for(String string:stringArray){
            joiner.add(string);
        }
        System.out.println(joiner);
    }
}
