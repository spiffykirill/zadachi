package com.company;
import java.util.*;
import java.util.regex.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;

public class five {
    public static void main(String[] args) {
        System.out.println("\t\t\tПервое задание(Создайте две функции, которые принимают строку и массив и возвращают закодированное или декодированное сообщение.\n" +
                "Первая буква строки или первый элемент массива представляет собой символьный код этой буквы. Следующие элементы-это различия между символами: например, A +3 --> C или z -1 --> y.)");
        System.out.println(Arrays.toString(encrypt("Hello")));
        System.out.println(Arrays.toString(encrypt("Sunshine")));
        System.out.println(decrypt(new int[]{72, 33, -73, 84, -12, -3, 13, -13, -68}));
        System.out.println("\t\t\tВторое задание(Создайте функцию, которая принимает имя шахматной фигуры, ее положение и целевую позицию. Функция должна возвращать true, если фигура может двигаться к цели, и false, если она не может этого сделать.\n" +
                "Возможные входные данные - \"пешка\", \"конь\", \"слон\", \"Ладья\", \"Ферзь\"и \" король\")");
        System.out.println(canMove("Rook", "A8", "H8"));
        System.out.println(canMove("Bishop", "A7", "G1"));
        System.out.println(canMove("Queen", "C4", "D6"));
        System.out.println("\t\t\tТретье задание(Входная строка может быть завершена, если можно добавить дополнительные буквы, и никакие буквы не должны быть удалены, чтобы соответствовать слову. Кроме того, порядок букв во входной строке должен быть таким же, как и порядок букв в последнем слове.\n" +
                "Создайте функцию, которая, учитывая входную строку, определяет, может ли слово быть завершено.)");
        System.out.println(canComplete("butl"));
        System.out.println(canComplete("butlz"));
        System.out.println(canComplete("tulb"));
        System.out.println("\t\t\tЧетвертое задание(Создайте функцию, которая принимает числа в качестве аргументов, складывает их вместе и возвращает произведение цифр до тех пор, пока ответ не станет длиной всего в 1 цифру.)");
        System.out.println(sumDigProd(16, 28));
        System.out.println(sumDigProd(0));
        System.out.println(sumDigProd(1, 2, 3, 4, 5, 6));
        System.out.println("\t\t\tПятое задание(Напишите функцию, которая выбирает все слова, имеющие все те же гласные (в любом порядке и / или количестве), что и первое слово, включая первое слово.)");
        System.out.println(Arrays.toString(sameVowelGroup(new String[]{"toe", "ocelot", "maniac"})));
        System.out.println(Arrays.toString(sameVowelGroup(new String[]{"many", "carriage", "emit", "apricot", "animal"})));
        System.out.println(Arrays.toString(sameVowelGroup(new String[]{"hoops", "chuff", "bot", "bottom"})));
        System.out.println("\t\t\tШестое задание(Создайте функцию, которая принимает число в качестве аргумента и возвращает true, если это число является действительным номером кредитной карты, а в противном случае-false.\n" +
                "Номера кредитных карт должны быть длиной от 14 до 19 цифр и проходить тест Луна, описанный ниже:\n" +
                "– Удалите последнюю цифру (это\"контрольная цифра\").\n" +
                "– Переверните число.\n" +
                "– Удвойте значение каждой цифры в нечетных позициях. Если удвоенное значение имеет более 1 цифры, сложите цифры вместе (например, 8 x 2 = 16 ➞ 1 + 6 = 7).\n" +
                "– Добавьте все цифры.\n" +
                "– Вычтите последнюю цифру суммы (из шага 4) из 10. Результат должен быть равен контрольной цифре из Шага 1.)");
        System.out.println(validateCard("1234567890123456"));
        System.out.println(validateCard("1234567890123452"));
        System.out.println("\t\t\tСедьмое задание(Напишите функцию, которая принимает положительное целое число от 0 до 999 включительно и возвращает строковое представление этого целого числа, написанное на английском языке.)");
        System.out.println(numToEng(0));
        System.out.println(numToEng(18));
        System.out.println(numToEng(126));
        System.out.println(numToEng(909));
        System.out.println("\t\t\tВосьмое задание(Хеш-алгоритмы легко сделать одним способом, но по существу невозможно сделать наоборот. Например, если вы хешируете что-то простое, например, password123, это даст вам длинный код, уникальный для этого слова или фразы. В идеале, нет способа сделать это в обратном порядке. Вы не можете взять хеш-код и вернуться к слову или фразе, с которых вы начали.\n" +
                "Создайте функцию, которая возвращает безопасный хеш SHA-256 для данной строки. Хеш должен быть отформатирован в виде шестнадцатеричной цифры.)");
        System.out.println(getSha256Hash("password123"));
        System.out.println(getSha256Hash("Fluffy@home"));
        System.out.println(getSha256Hash("Hey dude!"));
        System.out.println("\t\t\tДевятое задание(Напишите функцию, которая принимает строку и возвращает строку с правильным регистром для заголовков символов в серии \"Игра престолов\".\n" +
                "Слова and, the, of и in должны быть строчными. Все остальные слова должны иметь первый символ в верхнем регистре, а остальные-в Нижнем.)");
        System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
        System.out.println(correctTitle("sansa stark, lady of winterfell."));
        System.out.println(correctTitle("TYRION LANNISTER, HAND OF THE QUEEN."));
        System.out.println("\t\t\tДесятое задание(Как указано в онлайн-энциклопедии целочисленных последовательностей: Гексагональная решетка - это привычная двумерная решетка, в которой каждая точка имеет 6 соседей.\n" +
                "                     \n" +
                "Центрированное шестиугольное число - это центрированное фигурное число, представляющее шестиугольник с точкой в центре и всеми другими точками, окружающими центральную точку в шестиугольной решетке.)");
        System.out.println(hexLattice(1));
        System.out.println(hexLattice(7));
        System.out.println(hexLattice(19));
        System.out.println(hexLattice(21));
    }

    static int[] encrypt(String str) {
        char[] ch = str.toCharArray();
        int[] otv = new int[str.length()];
        otv[0] = ch[0];
        for (int i = 1; i < ch.length; i++)
            otv[i] = (int) ch[i] - (int) ch[i - 1];
        return otv;
    }

    static String decrypt(int[] zad) {
        StringBuilder otv = new StringBuilder();
        otv.append((char) zad[0]);
        for (int i = 1; i < zad.length; i++) {
            zad[i] += zad[i - 1];
            otv.append((char) zad[i]);
        }
        return otv.toString();
    }

    static boolean canMove(String figura, String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        switch (figura) {
            case ("Rook"):
                if (aa[0] == bb[0] || aa[1] == bb[1]) return true;
                break;
            case ("Bishop"):
                if (Math.abs((int) aa[0] - (int) bb[0]) == Math.abs(aa[1] - bb[1])) return true;
                break;
            case ("Queen"):
                if (Math.abs((int) aa[0] - (int) bb[0]) == Math.abs(aa[1] - bb[1]) || aa[0] == bb[0] || aa[1] == bb[1])
                    return true;
                break;
            case ("Pawn"):
                if ((aa[1] == '2' || aa[1] == '7') && (bb[1] == '4' || bb[1] == '5')) return true;
                else if (bb[1] - aa[1] == 1) return true;
                break;
        }
        return false;
    }

    static boolean canComplete(String a) {
        char[] str1 = a.toCharArray();
        char[] str2 = "beautiful".toCharArray();

        Map<Character, Integer> chrs1 = new HashMap<>();
        Map<Character, Integer> chrs2 = new HashMap<>();

        for (char c : str1) {
            chrs1.put(c, 0);
        }
        for (char c : str1) {
            chrs1.put(c, chrs1.get(c) + 1);
        }
        for (char c : str2) {
            chrs2.put(c, 0);
        }
        for (char c : str2) {
            chrs2.put(c, chrs2.get(c) + 1);
        }

        for (char c : str1) {
            if (chrs2.containsKey(c) && chrs2.get(c) >= chrs1.get(c)) ;
            else
                return false;
        }
        int index = 0;
        for (int i = 0; i < a.length(); i++) {
            if (str1[i] != str2[i]) {
                boolean flag = false;
                for (int j = index; j < str2.length; j++) {
                    if (str1[i] == str2[j]) {
                        index = j;
                        flag = true;
                        break;
                    }
                }
                if (flag) continue;
                return false;
            }
        }
        return true;
    }

    static int sumDigProd(int... arg) {
        int otv = 0;
        for (int j : arg) otv += j;
        while (otv < -10 || otv > 10) {
            int otv2 = otv;
            otv = 1;
            while (otv2 > 9 || otv2 < -9) {
                while (otv2 >= 1) {
                    otv *= otv2 % 10;
                    otv2 /= 10;
                }
            }
        }
        return otv;
    }

    static String[] sameVowelGroup(String[] strs) {
        List<String> res = new ArrayList<>();
        String uu = "euoiay";
        Pattern p = Pattern.compile(uu);
        Matcher m1 = p.matcher(strs[0]);

        String ss1 = m1.replaceAll("");
        res.add(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            m1 = p.matcher(strs[i]);
            char[] s = m1.replaceAll("").toCharArray();
            boolean flag = false;
            for (char c : s) {
                if (!uu.contains(String.valueOf(c))) continue;
                if (!ss1.contains(String.valueOf(c))) {
                    flag = true;
                    break;
                }
            }
            if (!flag) res.add(strs[i]);
        }
        String[] r = new String[res.size()];
        res.toArray(r);
        return r;
    }

    static boolean validateCard(String a) {
        if (a.length() > 19 || a.length() < 14) return false;
        int[] ch = new int[a.length() - 1];
        int control;
        int res = 0;
        for (int i = 0; i < a.length() - 1; i++)
            ch[i] = Integer.parseInt(String.valueOf(a.toCharArray()[i]));
        control = Integer.parseInt(String.valueOf(a.toCharArray()[a.length() - 1]));
        int[] ch2 = new int[a.length() - 1];
        for (int i = 0, j = a.length() - 2; i < a.length() - 1; i++, j--)
            if (i == 0) ch2[i] = ch[j];
            else if (i % 2 == 0) ch2[i] = ch[j];
            else {
                ch2[i] = ch[j] * 2;
                if (ch2[i] > 9) ch2[i] = ch2[i] % 10 + ch2[i] / 10;
            }
        for (int i = 0; i < a.length() - 1; i++)
            res += ch2[i];
        return control == 10 - res % 10;
    }

    static String numToEng(int a) {
        String[][] words = {{"", "сто ", "двести ", "триста ", "четыреста ", "пятьсот ", "шестьсот ", "семьсот ", "восемсот ", "девятьсот ", "äåâÿòüñîò"},
                {"", " ", "двадцать ", "тридцать ", "сорок ", "пятьдесят ", "шестьдесят ", "семьдесят ", "восемьдесят ", "девяносто"},
                {"", "один ", "два ", "три ", "четыре ", "пять ", "шесть ", "семь ", "восемь ", "девять"},
                {"десять ", "одиннадцать ", "двенадцать ", "тринадцать ", "четырнадцать ", "пятнадцать ", "шестнадцать ", "семнадцать ", "восемнадцать ", "девятнадцать"}};
        if (a < 0 || a > 999)
            return "не верно введено";
        else if (a == 0)
            return "ноль";
        else if (a < 10)
            return words[2][a];
         else if (a < 20)
            return words[3][a - 10];
        else if (a < 100)
            return words[1][a / 10] + words[2][a % 10];
        else
            return words[0][a / 100] + words[1][a / 10 % 10] + words[2][a % 10];

    }
        static String getSha256Hash(String a){
            try {
                MessageDigest md = MessageDigest.getInstance( "SHA-256" );

                md.update( a.getBytes( StandardCharsets.UTF_8 ) );
                byte[] digest = md.digest();

                return String.format( "%064x", new BigInteger( 1, digest ) );
            } catch(NoSuchAlgorithmException e) {
                return "error occured";
            }
        }
        static String correctTitle(String word){
        word=word.toLowerCase();
        StringBuilder otv= new StringBuilder();
        StringBuilder otv2= new StringBuilder();
        String[] words=word.split(" ");
            for (String s : words)
                if (s.equals("and") || s.equals("the") || s.equals("of") || s.equals("in")) otv2.append(s).append(" ");
                else {
                    otv.append(s.substring(0, 1).toUpperCase()).append(s.substring(1));
                    otv2.append(otv).append(" ");
                    otv = new StringBuilder();
                }
            return otv2.toString();
    }
    static String hexLattice(int a){
        StringBuilder otv= new StringBuilder();
        if (a==1) return otv + "\t\t\to\n";
        if (a%6-1==0){
            for(int i=2;i<a;i++) if(a%i==0) return otv + "недопустимое";}
        else return otv + "недопустимое";
            int nom= (3+(int) Math.sqrt(9-12*(1-a)))/6;
            int y=nom, we;
            otv.append("\t\t");
            for(int i=0;i<nom;i++){
                we=nom-1;
                we-=i;
                while(we>0){
                    otv.append(" ");we--;}
                otv.append("o ".repeat(Math.max(0, y)));
                otv.append("\n\t\t");
                y++;
        }
            y-=2;
        for(int i=0;i<nom-1;i++){
                we=1;
                we+=i;
                while(we>0){
                    otv.append(" ");we--;}
            otv.append("o ".repeat(Math.max(0, y)));
                otv.append("\n\t\t");
                y--;
            }
            return otv.toString();
        }
}



