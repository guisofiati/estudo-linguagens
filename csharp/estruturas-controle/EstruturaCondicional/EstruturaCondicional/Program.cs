namespace EstruturaCondicional
{
    class Program
    {
        static void Main(string[] args)
        {
            int hora;

            Console.Write("Digite uma hora: ");
            hora = int.Parse(Console.ReadLine());

            if (hora >= 0 && hora < 6)
            {
                Console.WriteLine("Boa madrugada!");
            }
            else if (hora < 13)
            {
                Console.WriteLine("Bom dia!");
            }
            else if (hora < 19)
            {
                Console.WriteLine("Boa tarde!");
            }
            else if (hora < 24)
            {
                Console.WriteLine("Boa noite!");
            }
            else
            {
                Console.WriteLine("Hora invalida. Digite uma hora de 0 a 23.");
            }
        }
    }
}