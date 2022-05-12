
public class FuncoesString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG     ";
		String frase = "BANANA MELANCIA MORANGO";
		
		// Formatacao
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.toUpperCase().trim();
		
		// Recortar
		String s05 = original.substring(2);
		String s06 = original.substring(2, 9); 
		
		// Substituir
		String s07 = original.replace('a', 'x');
		String s08 = original.replace("abc", "xy");
		
		// Buscar
		int x = original.indexOf("bc");
		int y = original.lastIndexOf("bc");
		
		// Split
		String[] vet = frase.split(" ");
		
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("toUpperCase e trim: -" + s04 + "-");
		System.out.println();
		System.out.println("substring(2): -" + s05 + "-");
		System.out.println("substring(2, 9): -" + s06 + "-");
		System.out.println();
		System.out.println("replace('a', 'x'): -" + s07 + "-");
		System.out.println("replace('abc', 'xy'): -" + s08 + "-");
		System.out.println();
		System.out.println("indexOf 'a': " + x);
		System.out.println("LastIndexOf 'a': " + y);
		System.out.println();
		
		for (int i=0; i<vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
}