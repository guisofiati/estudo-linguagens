namespace Exercicios
{
    class Program
    {
        static void Main(string[] args)
        {
            int X, Y;

            Console.WriteLine("Digite dois numeros:");
            X = int.Parse(Console.ReadLine());
            Y = int.Parse(Console.ReadLine());

            while (X != Y)
            {
                if (X > Y)
                {
                    Console.WriteLine("DECRESCENTE!");
                }
                else
                {
                    Console.WriteLine("CRESCENTE!");
                }

                Console.WriteLine("Digite outros dois numeros: ");
                X = int.Parse(Console.ReadLine());
                Y = int.Parse(Console.ReadLine());
            }
        }
    }
}