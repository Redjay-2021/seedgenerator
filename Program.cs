using System.Diagnostics;
using System.Runtime.CompilerServices;

int amount = 0;
if (0 < Environment.GetCommandLineArgs().Length) {
    Console.WriteLine("How many seeds do you want to generate?");
    string amount1 = Console.ReadLine();
    amount = int.Parse(amount1);
} else {
    amount = int.Parse(Environment.GetCommandLineArgs()[0]);
}

Process java = Process.Start("seed\\jre\\bin\\java", "seed.Main " + amount.ToString());
java.WaitForExit();
Process.Start("cmd", "/c pause");