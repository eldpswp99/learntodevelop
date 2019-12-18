package f.jdk8;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateTimeSample {
    public static void main(String[] args){
        DateTimeSample sample = new DateTimeSample();
        //sample.printDayWeek();
        sample.printLocalesSunday();
    }
    
    private void printDayWeek(){
        DayOfWeek[] dayOfweeks = DayOfWeek.values();
        Locale locale = Locale.getDefault();
        
        for(DayOfWeek day : dayOfweeks){
            System.out.print(day.getDisplayName(TextStyle.FULL,locale)+" ");
            System.out.print(day.getDisplayName(TextStyle.NARROW,locale)+" ");
            System.out.println(day.getDisplayName(TextStyle.SHORT,locale)+" ");
        }
    }
    
    private void printLocalesSunday(){
        DayOfWeek day = DayOfWeek.SUNDAY;
        Locale[] locales = Locale.getAvailableLocales();
        
        for(Locale locale : locales){
            System.out.print(locale.getCountry()+" ");
            System.out.print(day.getDisplayName(TextStyle.FULL,locale)+" ");
            System.out.print(day.getDisplayName(TextStyle.NARROW,locale)+" ");
            System.out.println(day.getDisplayName(TextStyle.SHORT,locale)+" ");
        }
    }
}
