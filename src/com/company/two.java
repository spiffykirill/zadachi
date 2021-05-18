package com.company;


public class two {
    public static void main(String[] args) {
    char[] str= new char[]{'m', 'i', 'c', 'e'};
    char[] str2= new char[]{'h', 'e', 'l', 'l','o'};
    char[] str3= new char[]{'s', 't', 'o', 'p'};
    int otv;
    char faf;
    boolean prov;
    String sad="ratio", das="orator";
    int[] otv2={10, 4, 1, 4, -10, -50, 32, 21};
    int[] otv3={44, 32, 86, 19};
    int[] zad1={1, 3};
    int[] zad2={1, 2,3,4};
    int[] zad3={1, 5,6};
    int[] zad4={1, 1,1};
    int[] zad5={9, 2, 2, 5};
    int[] nom={1,2,3};
    int[] nom2={1,-2,3};
    int[] nom3={3,3,-2,408,3,3};
    System.out.println("\t\tПервое задание(повторяет каждый символ в строке n раз)");
    str=repeat(str,5);
    System.out.println(str);
    str2=repeat(str2,3);
    System.out.println(str2);
    str3=repeat(str3,1);
    System.out.println(str3);
    /////////////////////////
        System.out.println("\t\tВторое задание(принимает массив и возвращает разницу между самыми большими и самыми маленькими числами)");
     otv=differenceMaxMin(otv2);
     System.out.println(otv);
     otv=differenceMaxMin(otv3);
     System.out.println(otv);
    /////////////////////////
        System.out.println("\t\tТретье задание(принимает массив в качестве аргумента и возвращает true или false в зависимости от того, является ли среднее значение всех элементов массива целым числом или нет.)");
         prov=isAvgWhole(zad1);
        System.out.println(prov);
        prov=isAvgWhole(zad2);
        System.out.println(prov);
        prov=isAvgWhole(zad3);
        System.out.println(prov);
        prov=isAvgWhole(zad4);
        System.out.println(prov);
        prov=isAvgWhole(zad5);
        System.out.println(prov);
        ////////////////////////
        System.out.println("\t\tЧетвертое задание(который берет массив целых чисел и возвращает массив, в котором каждое целое число является суммой самого себя + всех предыдущих чисел в массиве.)");
        nom=cumulativeSum(nom);
        viviod(nom);
        nom2=cumulativeSum(nom2);
        viviod(nom2);
       nom3=cumulativeSum(nom3);
        viviod(nom3);
        ///////////////////////
        System.out.println("\t\tПятое задание(которая возвращает число десятичных знаков, которое имеет число (заданное в виде строки). Любые нули после десятичной точки отсчитываются в сторону количества десятичных знаков.)");
        str= new char[]{'4', '3','.','2','0'};
        faf=getDecimalPlaces(str);
        System.out.println(faf);
        str= new char[]{'4', '0','0'};
        faf=getDecimalPlaces(str);
        System.out.println(faf);
        str= new char[]{ '3','.','1'};
        faf=getDecimalPlaces(str);
        System.out.println(faf);
        //////////////////////////
        System.out.println("\t\tШестое задание(которая при заданном числе возвращает соответствующее\n" +
                "число Фибоначчи.)");
        otv=Fibonacci(3);
        System.out.println(otv);
        otv=Fibonacci(7);
        System.out.println(otv);
        otv=Fibonacci(12);
        System.out.println(otv);
        /////////////////////////
        System.out.println("\t\tСедьмое задание(Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку, напишите функцию, чтобы определить, является ли вход действительным почтовым индексом. Действительный почтовый индекс выглядит следующим образом:\n" +
                "– Должно содержать только цифры (не допускается использование нецифровых цифр). – Не должно содержать никаких пробелов.\n" +
                "– Длина не должна превышать 5 цифр.)");
        str= new char[]{'5', '9','0','0','1'};
        prov=isValid(str);
        System.out.println(prov);
        str= new char[]{'8', '5','3','a','7'};
        prov=isValid(str);
        System.out.println(prov);
        str= new char[]{'7', '3','2','\0','3','2'};
        prov=isValid(str);
        System.out.println(prov);
        str= new char[]{'3', '9','3','9','3','9'};
        prov=isValid(str);
        System.out.println(prov);
////////////////////////////////
        System.out.println("\t\tВосьмое задание(Пара строк образует странную пару, если оба из следующих условий истинны: – Первая буква 1-й строки = последняя буква 2-й строки.\n" +
                "– Последняя буква 1-й строки = первая буква 2-й строки.\n" +
                "– Создайте функцию, которая возвращает true, если пара строк представляет собой странную пару, и false в противном случае.)");
        prov=isStrangePair(sad,das);
        System.out.println(prov);
        sad="sparkling";
        das="groupw";
        prov=isStrangePair(sad,das);
        System.out.println(prov);
        ///////////////////////////
        System.out.println("\t\tДевятое задание(Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).\n" +
                "– isPrefix должен возвращать true, если он начинается с префиксного аргумента. – isSuffix должен возвращать true, если он заканчивается аргументом суффикса. – В противном случае верните false.)");
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));
        ///////////////////////////
        System.out.println("\t\tДесятое задание(Создайте функцию, которая принимает число (шаг) в качестве аргумента и возвращает количество полей на этом шаге последовательности.)\n");
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
    }
    public static char[] repeat(char[] str, int a){
        char[] otv=new char[30];
        int c=0;
        for (char value : str) {
            for (int b = 0; b < a; b++) {
                otv[c] = value;
                c++;
            }
        }
            return otv;
    }
    public static int differenceMaxMin(int[] mas){
        int max=-10_000,min= 10_000;
        for (int ma : mas) {
            if (max < ma) max = ma;
            if (min > ma) min = ma;
        }
        return (max-min);
    }
    public static boolean isAvgWhole(int[] a){
        int s=0;
        for (int j : a) s += j;
        return s % a.length == 0;
    }
    public static int[] cumulativeSum(int[] mas){
        int[] otv = new int[mas.length];
        int uu=0;
        for(int i=0;i<mas.length;i++) {
            uu+=mas[i];
            otv[i]=uu;
        }
        return otv;
    }
    public static void viviod(int[] mas){
        for(int j : mas)
            System.out.print(j +"\t");
        System.out.println();
    }
    public static char getDecimalPlaces(char[] a){
        char otv='0';
        for(int i=0;i<a.length;i++)
            if(a[i]=='.')otv=a[i+1];
        return otv;
    }
    public static int Fibonacci(int a){
        int[] fib=new int[15];
        fib[0]=1;
        fib[1]=2;
        for(int i=2;i<15;i++)
            fib[i]=fib[i-1]+fib[i-2];
        return fib[a-1];
    }
    public static boolean isValid(char[] q){
        if(q.length>5) return false;
        for (char c : q) {
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' &&
                    c != '7' && c != '8' && c != '9' && c != '0') return false;
        }
        return true;
    }
    public static boolean isStrangePair(String a, String b){
        int r=b.length()-1;
        int y=a.length()-1;
        if(a.charAt(0)==b.charAt(r))
            return b.charAt(0) == a.charAt(y);
            return false;
    }
    public static boolean isPrefix(String a,String b){
        String s=a.substring(0,b.length()-1);
        return b.startsWith(s);

    }
    public static boolean isSuffix(String a,String b){
        String s=a.substring(1);
        return b.endsWith(s);
    }
    public static int boxSeq(int n){
        return n%2==0 ? n : n+2;
    }
}
