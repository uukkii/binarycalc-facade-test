## Домашнее задание к занятию 1.2: Структурные шаблоны. Adapter, Proxy, Decorator, Facade, Flyweight

# Задача Двоичный фасад

**v 1.0**

Задание реализовано. 

Код класса Main:
```
public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println("The result of SUM is " + binOps.sum("1010", "1101"));
        System.out.println("The result of MULT is " + binOps.mult("1010", "1101"));
    }
}
```

Вывод в консоль после выполнения:
```
3:16:00 PM: Executing task ':Main.main()'...

> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes

> Task :Main.main()
The result of SUM is 10111
The result of MULT is 10000010

Deprecated Gradle features were used in this build, making it incompatible with Gradle 8.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

See https://docs.gradle.org/7.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 1s
2 actionable tasks: 2 executed
3:16:02 PM: Task execution finished ':Main.main()'.
```