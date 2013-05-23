package Generice;

public class TeorieBunaGenerice {
/*
Cel mai mare avantaj al genericelor este faptul ca compilatorul urmareste tipul parametrilor pentur noi. Tot compilatorul
face verificarile de tip si castingurile pentru operatii --> compilatorul se asigura ca cast-urile nu vor fail/aduce erori.
In loc sa trebuiasca sa tinem noi minte tipurile de obiecte si sa avem grija la paranteze, ceea ce ar putea sa complice mult
lucrurile, compilatorul face mult mia multe verificari si detecteaza mai multe erori la compilare(in loc de rulare)

Facilitatea de a folosi generice introduce conceptul de variabila tip. O variabila tip/variable type este un identificator
 neidentificat/ unqualified identifier de:
- Generic Class Declarations / declaratii generice de clase
- Generic Interface Declarations / declaratii generice de interfete
- Generic Method Declarations / declaratii generice de metode
- Generic Constructor Declarations / declaratii generice de constructor
Clase si Interfete Generice
O clasa sau o interfata este enerica daca are una sau mai multe variabile tip. Tipul variabila este delimitat de <> si este
plasat imediat dupa numele clasei sau interfetei.
	public interface List<T> extends Collection<T>
Variabilele tip se comporta ca parametri si ofera informatiile necesare compilatorului pentru verificari.
ex: signatura generica a get method a interfetei List:
	T get (int index);
Metoda get returneaza un obiect de tipul T, unde T este variabila tip specificata in declaratia listei List<T>
Metode Generice si Constructori Generici
La fel ca si clasele si interfetele, metodele si constructori pot fi generice daca declara unul sau mai multe variabile tip.
ex:		public static <t> T getFirst(List<T> list)
Aceasta metoda va accepta o referinta la o LIST<T> si va returna un obiect de tip T.
Iterarea
Multe clasa din libraria java, cum ar fi Iterator<T>, sunt generice. Metoda iterator() a interfetei List<T> returneaza un Iterator<T> care poate fi folosit fara paranteze pentru obiectul pe care il returneaza metoda sa T.next()
	for (Iterator<String> iter = str.iterator(); iter.hasNext();) {
		String s = iter.next();
		System.out.print(s);
	}

Sintaxa ForEach
	for (String s: str) {
		System.out.print(s);
	}

Autoboxing/Autounboxing
Aceste doua facilitati ale Java sunt folosite automat cand folosim generice.
	List<Integer> ints = new ArrayList<Integer>();
	ints.add(0);
	ints.add(1);

	int sum = 0;
	for (int i : ints) {
		sum += i;
	}
 */




}
