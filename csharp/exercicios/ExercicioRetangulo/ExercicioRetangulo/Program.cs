using System.Globalization;

namespace Exercicios
{
    class Program
    {
        static void Main(string[] args)
        {
            CultureInfo CI = CultureInfo.InvariantCulture;

            double b, altura, area, perimetro, diagonal;

            Console.Write("Base do retangulo: ");
            b = double.Parse(Console.ReadLine(), CI);
            Console.Write("Altura do retangulo: ");
            altura = double.Parse(Console.ReadLine(), CI);

            area = b * altura;
            perimetro = 2 * (b + altura);
            diagonal = Math.Sqrt(Math.Pow(b, 2) + Math.Pow(altura, 2));

            Console.WriteLine();
            Console.WriteLine("AREA = " + area.ToString("F4", CI));
            Console.WriteLine("PERIMETRO = " + perimetro.ToString("F4", CI));
            Console.WriteLine("DIAGONAL = " + diagonal.ToString("F4", CI));
        }
    }
}