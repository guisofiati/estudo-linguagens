namespace Exercicios
{
    class Program
    {
        static void Main(string[] args)
        {
            int X, Y, soma, temp;

            Console.WriteLine("Digite dois numeros: ");
            X = int.Parse(Console.ReadLine());
            Y = int.Parse(Console.ReadLine());

            if (X > Y)
            {
                temp = X;
                X = Y;
                Y = temp;
            }

            soma = 0;

            for (int i = X+1; i < Y; i++)
            {
                if (i % 2 != 0)
                {
                    soma = soma + i;
                }
            }

            Console.WriteLine();
            Console.WriteLine("SOMA DOS IMPARES = " + soma);
        }
    }
}