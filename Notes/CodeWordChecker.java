
/**
 * Write a description of class CodeWordChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CodeWordChecker implements StringChecker
{
    int min;
    int max;
    String disallowed;

    public CodeWordChecker(int min, int max, String disallowed){
        this.min = 6;
        this.max = 20;
        this.disallowed = disallowed;
    }

    public CodeWordChecker(String str){

    }

    public boolean isValid(String str){
        if(str.length() <= max && str.length() >= min){
            if(str == disallowed){
                return true;
            }else{
                return false;
            }
        }
        
    }
}

