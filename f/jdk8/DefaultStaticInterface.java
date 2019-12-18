package f.jdk8;

public interface DefaultStaticInterface {
    static final String name = "GodOfJavaBook";
    static final int since = 2013;
    String getName();
    int getSince();
    default String getEMail(){
        return name+"@godofjava.com";
    }
}
