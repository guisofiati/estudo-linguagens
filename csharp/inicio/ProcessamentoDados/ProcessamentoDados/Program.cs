using System.Globalization;

namespace ProcessamentoDados
{
    class Program
    {
        static void Main(string[] agrs)
        {
            CultureInfo CI = CultureInfo.InvariantCulture;

            int a, b;
            a = 5;
            b = 2 * a;

            Console.WriteLine(a);
            Console.WriteLine(b);

            Console.WriteLine("***********");

            int c;
            double d;

            c = 5;
            d = 2 * c;

            Console.WriteLine(c);
            Console.WriteLine(d.ToString("F1", CI));

            Console.WriteLine("***********");

            double b1, b2, h, area;

            b1 = 6.0;
            b2 = 8.0;
            h = 5.0;

            area = (b1 + b2) / 2.0 * h;

            Console.WriteLine(area.ToString("F1", CI));

            Console.WriteLine("***********");

            int e, f, resultado;

            a = 5;
            b = 2;

            resultado = a / b;

            Console.WriteLine(resultado);

            Console.WriteLine("***********");

            int e2, f2;
            double resultado2;

            e2 = 5;
            f2 = 2;

            resultado2 = (double)e2 / f2;

            //Console.WriteLine(resultado2);
            Console.WriteLine(resultado2.ToString("F1", CI));

            Console.WriteLine("***********");

            double i;
            int j;

            i = 5.0;
            //j = i;
            j = (int)i;

            Console.WriteLine(j);
        }
    }
}