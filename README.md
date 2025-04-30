Предложена реализация интерпретатора для Minilang подобного языка программирования, реализованного с помощью ANTLR4.
Язык состоит из:
Переменных Типа Int и String.
Арифметических операций и операций сравнения.
Оператор ветвления с факультативной ветвью else.
while

Примеры программы
```
x = 10
y = x + 5
y       # Выведет: EVI: 15

```
Интерпретатор реализован через Visitors ANTL4:<br>
    EvalVisitor - обрабатывает числовые операции.
    EvalVisitorString - обрабатывает строковые операции.

Каждое правило грамматики помечено тегом. По тегу определяется какой именно метод необходимо вызвать для элемента дерева.
```
x = 1
if x > 5 then {
  z = 1
} else {
  z = 0
}
z # Выведет: EVI: 0
```
область видимости переменных только глобальная

```
did = "1"
didd = "2"
did + didd   # Выведет: EVS: "12"
```

```
:> Данные символы обозначают комментарий в MINILANG.
```
Обработка ошибок:

    Проверка типов (нельзя умножать и делить строки)

    переменная которая была объявлена как строка или как число нельзя записать противоположный тип
Сначала идет объявленние всех строковых переменных затем целочисленных
```
a = 12
a = "as"
a
EVS: as
Variable a already defined as String

```

  

Особенности реализации:

    Разделение типов данных:

        Числа хранятся в EvalVisitor.memory

        Строки хранятся в EvalVisitorString.memoryString

    Проверка типов:
    java

    if (EvalVisitorString.IsKeyExistInMemoryString(id)) {
        System.out.printf("Variable %s already defined as String\n", id);
    }

    Обработка блоков кода:

        visitMultiple_logic_block() - для блоков в {}

        visitSingle_logic_block() - для одиночных операторов

    Специальные значения:

        Integer.MAX_VALUE - маркер ошибки типа

        Пустая строка ("") - аналогично для строковых операций

Пример полного выполнения:

Входной код:
```
x = 10
name = "Alice"
hello = "HEllo "
if x > 5 then {
  hello + name
}
```

Шаги выполнения:

    x = 10 → сохраняет 10 в memory (EvalVisitor)

    name = "Alice" → сохраняет "Alice" в memoryString (EvalVisitorString)
    hello = "HEllo" → сохраняет "HEllo " в memoryString (EvalVisitorString)

    Проверяет условие x > 5 (true)

    Выполняет блок then, вычисляет hello + "Alice"

    Выводит "EVS: HEllo Alice"

Эта система эффективно разделяет обработку разных типов данных и предоставляет базовые конструкции программирования.

Команда для создания базового интерфейса визитора.
```
 antlr4 -no-listener -visitor LabeledExpr.g4
```
Запуск
```
javac Calc <PATH-TO-FILE>
javac Calc ( в этом случае данные читаются из STDIN)

```

Пример дерева
```
antlr4-parse LabeledExpr.g4 prog -tree
x = 5
if ( 3>1 ) then {
2
}
(prog:1 (stat:2 x = (expr:6 5) \n) (stat:3 (ifStat:1 if (expr:5 ( (expr:3 (expr:6 3) > (expr:6 1)) )) then (block:1 { (stat:5 \n) (stat:1 (expr:6 2) \n) }))) (stat:5 \n))

```
![image](https://github.com/user-attachments/assets/94aac320-c0fb-4abb-8eac-26d3253b8ecd)


