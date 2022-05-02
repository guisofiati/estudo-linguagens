namespace EstruturaFor
{
    class Program
    {
        static void Main(string[] args)
        {
            int N, X, soma;

            Console.Write("Quantos numeros serao digitados? ");
            N = int.Parse(Console.ReadLine());

            soma = 0;

            for (int i = 0; i < N; i++)
            {
                Console.Write("Digite um numero: ");
                X = int.Parse(Console.ReadLine());

                soma = soma + X;
            }

            Console.WriteLine();
            Console.WriteLine("SOMA = " + soma);
        }
    }
}