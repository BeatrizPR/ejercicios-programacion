/**Ejercicio 9, dibujar algo, por ejemplo Jigglypuff del codigo ascii con color
*/
public class Ejercicio9color {
  public static void main(String[] args) {
    
    String rosa = "\033[38;5;218m";
    String blanco = "\033[38;5;256m";
    String azul = "\033[38;5;87m";


    
    System.out.printf("%3s\n", rosa + " ,..__\n");
    System.out.printf("%31s\n", "|  _  `--._                                  _.--\"\"\"`.");
    System.out.printf("%31s\n", "|   |._    `-.        __________         _.-'    ,|' |");
    System.out.printf("%31s\n", "|   |  `.     `-..--\"\"_.        `\"\"-..,-'      ,' |  |");
    System.out.printf("%31s\n", "L   |    `.        ,-'                      _,'   |  |");
    System.out.printf("%31s\n",   ".  |     ,'     ,'            .           '.     |  |");
    System.out.printf("%31s\n",   "|  |   ,'      /               \\            `.   |  |");
    System.out.printf("%31s\n",   "|  . ,'      ,'                |              \\ /  j");
    System.out.printf("%31s\n",   "`   \"       ,                  '               `   /");
    System.out.printf("%31s\n",    "`,         |                ,'                  '+");
    System.out.printf("%31s\n",    "/          |             _,'                     `\n");
    System.out.printf("%31s\n",   "/     .-\"\"\"'L          ,-' \\  ,-'\"\"\"\"`-.           `");
    System.out.printf("%31s\n",  "j    ,' ,.+--.\\        '    ',' ,.,-\"--._`.          \\");
    System.out.printf("%31s\n",  "|   / .'  L    `.        _.'/ .'  |      \\ \\          .");
    System.out.printf("%31s\n", "j   | | `--'     |`+-----'  . j`._,'       L |         |");
    System.out.printf("%31s\n", "|   L .          | |        | |            | |         |");
    System.out.printf("%31s\n", "|   `\\ \\        / j         | |            | |         |");
    System.out.printf("%31s\n", "|     \\ `-.._,.- /           . `         .'  '         |");
    System.out.printf("%31s\n", "l      `-..__,.-'             `.`-.....-' _.'          '");
    System.out.printf("%31s\n", "'                               `-.....--'            j");
    System.out.printf("%31s\n",  ".                  -.....                            |");
    System.out.printf("%31s\n",   "L                  `---'                            '");
    System.out.printf("%31s\n",    "\\                                                 /");
    System.out.printf("%31s\n",     "` \\                                        ,   ,'");
    System.out.printf("%31s\n",      "`.`.    |                        /      ,'   .");
    System.out.printf("%31s\n",        ". `._,                        |     ,'   .'");
    System.out.printf("%31s\n",         "`.                           `._.-'  ,-'");
    System.out.printf("%31s\n",    "_,-\"\"\"\"`-,                             _,'\"-.._");
    System.out.printf("%31s\n",  ",'          `-.._                     ,-'        `.");
    System.out.printf("%31s\n", "/             _,' `\"-..___     _,..--\"`.            `.");
    System.out.printf("%31s\n","|         _,.-'            `\"\"\"'         `-._          \\");
    System.out.printf("%31s\n","`-....---'                                   `-.._      |");
    System.out.printf("%31s\n","                                                  `--...'" +blanco);
  }
}
