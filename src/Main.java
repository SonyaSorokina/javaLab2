// Написать регулярное выражение, определяющее является ли данная строка GUID с или без скобок. Где GUID это строчка, состоящая из 8, 4, 4, 4, 12 шестнадцатеричных цифр разделенных тире.
//– пример правильных выражений: e02fd0e4-00fd-090A-ca30-0d00a0038ba0.
//– пример неправильных выражений: e02fd0e400fd090Aca300d00a0038ba0.
import java.util.*;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        CharSequence stroka = in.next();
//        CharSequence stroka = "e02fd0e4-00fd-090A-ca30-0d00a0038ba0";
        Pattern pattern = Pattern.compile("[a-f|A-F|\\d]{8}(-)(([a-f|A-F|\\d]){4}(-)){3}[a-f|A-F|\\d]{12}");
        Pattern pattern2 = Pattern.compile("\\([a-f|A-F|\\d]{8}(-)(([a-f|A-F|\\d]){4}(-)){3}[a-f|A-F|\\d]{12}\\)");
        Matcher matcher = pattern.matcher(stroka);
        Matcher matcher2 = pattern2.matcher(stroka);
        if (matcher.matches() || matcher2.matches()){
            if (matcher2.matches()){
                System.out.println("Данные имеют верный формат и содержат скобки");
            } else{
                System.out.println("Данные имеют верный формат и НЕ содержат скобки");
            }
       } else{
            System.out.println("Данные имеют НЕ верный формат");
        }
    }
}
