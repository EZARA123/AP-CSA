
/**
 * Write a description of class CodeRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CodeRunner
{
    public static void codeRunner(){
        StringChecker sc1 = new CodeWordChecker(5, 8, "$");
        
        System.out.println(sc1.isValid("happy"));
    }
}
