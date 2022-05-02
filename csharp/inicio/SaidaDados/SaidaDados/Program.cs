// Lib para poder definir o padrao de separador decimais
using System.Globalization;

namespace SaidaDados
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Bom dia");
            Console.Write("Boa noite");

            Console.WriteLine();
            Console.WriteLine("************");

            Console.WriteLine("Bom dia");
            Console.WriteLine("Boa noite");

            Console.WriteLine("************");

            int x, y;
            x = 10;
            y = 20;

            Console.WriteLine(x);
            Console.WriteLine(y);

            Console.WriteLine("************");

            double z = 2.3456;

            // Console.WriteLine(z); imprime com ',' e com o tanto de casas decimais definido
            Console.WriteLine(z.ToString("F2", CultureInfo.InvariantCulture));

            Console.WriteLine("************");

            CultureInfo CI = CultureInfo.InvariantCulture;

            int idade;
            double salario;
            string nome;
            char sexo;

            idade = 32;
            salario = 4560.9;
            nome = "Maria Silva";
            sexo = 'F';

            Console.WriteLine("A funcionaria " + nome + ", sexo " + sexo + ", ganha " 
                + salario.ToString("F2", CI) + " e tem " + idade + " anos.");
        }
    }
}