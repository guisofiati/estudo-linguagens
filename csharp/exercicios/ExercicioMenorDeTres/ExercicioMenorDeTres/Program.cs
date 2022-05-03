namespace Exercicios
{
    class Program
    {
        static void Main(string[] args)
        {
            int n1, n2, n3, menor;

            Console.Write("Primeiro valor: ");
            n1 = int.Parse(Console.ReadLine());
            Console.Write("Segundo valor: ");
            n2 = int.Parse(Console.ReadLine());
            Console.Write("Terceiro valor: ");
            n3 = int.Parse(Console.ReadLine());

            if (n1 <= n2 && n1 <= n3)
            {
                menor = n1;
            }
            else if (n2 <= n3)
            {
                menor = n2;
            }
            else
            {
                menor = n3;
            }

            Console.WriteLine();
            Console.WriteLine("MENOR = " + menor);
        }
    }
}