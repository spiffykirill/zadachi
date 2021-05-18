package com.company;


public class one {

    public static void main(String[] args) {
        int otv;
        int[] a= new int[]{1, 5, 9};
		int[] b= new int[]{3, 4, 5};
		int[] c= new int[]{2};
		int[] d= new int[]{'\0'};
		boolean res;
        char[] mat;
		System.out.println("\t\t1 задание(Первый параметр, разделенный на второй параметр, будет иметь остаток, возможно, ноль. Верните это значение.)\n ");
	System.out.println(remainder(1,3));
	otv=remainder(3,4);
	System.out.println(otv);
	otv=remainder(-9,45);
	System.out.println(otv);
	otv=remainder(5,5);
	System.out.println(otv);
	////////////////////////
		System.out.println("\t\t2 задание(которая принимает основание и высоту треугольника и возвращает его площадь.)");
		otv=triArea(3, 2);
		System.out.println(otv);
		otv=triArea(7, 4);
		System.out.println(otv);
		otv=triArea(10, 10);
		System.out.println(otv);
		//////////////////////////
		System.out.println("\t\t3 задание(функцию, которая возвращает общее количество ног всех животных.)");
		otv=animals(2,3,5);
		System.out.println(otv);
		otv=animals(1,2,3);
		System.out.println(otv);
		otv=animals(5,2,8);
		System.out.println(otv);
		////////////
		System.out.println("\t\t4 задание(принимает три аргумента (prob, prize, pay) и возвращает true, если prob * prize > pay; в противном случае возвращает false.)");
		res=profitableGamble(0.2,50,9);
		System.out.println(res);
		res=profitableGamble(0.9,1,2);
		System.out.println(res);
		res=profitableGamble(0.9,3,2);
		System.out.println(res);
		//////////////////////////
		System.out.println("\t\t5 задание(принимает 3 числа и возвращает, что нужно сделать с a и b: они должны быть сложены, вычитаны, умножены или разделены, чтобы получить N)");
		mat=operation(24, 15, 9);
		System.out.println(mat);
		mat=operation(24, 26, 2);
		System.out.println(mat);
		mat=operation(15, 11, 11);
		System.out.println(mat);
		///////////////////////
		System.out.println("\t\t6 задание(Создайте функцию, которая возвращает значение ASCII переданного символа)");
		otv=ctoa('A');
		System.out.println(otv);
		otv=ctoa('m');
		System.out.println(otv);
		otv=ctoa('[');
		System.out.println(otv);
		otv=ctoa('/');
		System.out.println(otv);
		//////////////////////
		System.out.println("\t\t7 задание(которая берет последнее число из последовательного списка чисел и возвращает сумму всех чисел до него и включая его.)");
		otv=addUpTo(3);
		System.out.println(otv);
		otv=addUpTo(10);
		System.out.println(otv);
		otv=addUpTo(7);
		System.out.println(otv);
		////////////////////////
		System.out.println("\t\t8 задание(которая находит максимальное значение третьего ребра треугольника, где длины сторон являются целыми числами)");
		otv=nextEdge(8,10);
		System.out.println(otv);
		otv=nextEdge(5,7);
		System.out.println(otv);
		otv=nextEdge(9,2);
		System.out.println(otv);
		////////////////////////
		System.out.println("\t\t9 задание(оторая принимает массив чисел и возвращает сумму его кубов.)");
		otv=sumOfCubes(a);
		System.out.println(otv);
		otv=sumOfCubes(b);
		System.out.println(otv);
		otv=sumOfCubes(c);
		System.out.println(otv);
		otv=sumOfCubes(d);
		System.out.println(otv);
		///////////////////////
		System.out.println("\t\t10 задание(будет для данного a, b, c выполнять следующие действия:\n" +
				"– Добавьте A к себе B раз.\n" +
				"– Проверьте, делится ли результат на C.)");
		res=abcmath(42,5,10);
		System.out.println(res);
		res=abcmath(5,2,1);
		System.out.println(res);
		res=abcmath(1,2,3);
		System.out.println(res);
	}
    public static int remainder(int a,int b){
		return a%b;
    }
    public static int triArea(int a,int b){
    	return (a*b)/2;
	}
	public static int animals(int chickens,int cows,int pigs){
		return chickens*2+ cows*4+ pigs*4;

	}
	public static boolean profitableGamble(double prob,double prize,double pay){
		return prob * prize > pay;
	}
	public static char[] operation(int a,int b, int c){

    	if ((a + b) == c) return new char[]{'s','u','m','m'};
		if ((a * b) == c) return new char[]{'u','m','n','o','j'};
		if ((a - b) == c) return new char[]{'a','d','d','e','d'};
		if ((b - a) == c) return new char[]{'s','u','b','t','r','a','c','t','e','d'};
		if ((a / b) == c) return new char[] {'d','e','l','l'};
		if ((b / a) == c) return new char[] {'d','e','l','l'};
		return new char[]{'n','o','n','e'};

	}
	public static int ctoa(char a){
	return (int) a;
	}
	public static int addUpTo(int a){
    	for(int i=a-1;i>0;i--)
		a+=i;
    	return a;
	}
	public static int nextEdge(int a, int b){
    	return (a+b-1);
	}
	public static int sumOfCubes(int[] a){
    	int d=0;
		for (int j : a) d += j * j * j;
    	return d;
	}
	public static boolean abcmath(int a, int b, int c){
    	for(int i=0;i<b;i++)
    		a+=a;
		return a % c == 0;
	}
}
