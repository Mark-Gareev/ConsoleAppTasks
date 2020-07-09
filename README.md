# ConsoleAppTasks
Мое первое консольное приложение, которое я осмелился залить на гитхаб.
Приложения связывает мои маленькие учебные задачи в одно приложение. По мере выполнения, буду прикреплять задачи сюда, когда задач накопится больше, буду доделывать болеее функциональное меню.

Весь ввод организован через соответствующие файлы в /Resources


-----------------------
Первая задачка на декодирование шифра Цезаря.
Имеется исходный текст, некоторые слова из него зашифрованы с промощью циклического сдвига по алфавиту. Каждое слово может быть зашифрованно со своим сдвигом. Задача -- восстановить исходные слова.

Ввод:

В первой строке -- незашифорванный текст(набор слов), состоящий из латинских букв в нижнем регистре, разделенных одиночным пробелом.
Во второй строке -- количество зашифрованных слов из первой строки.
В третьей -- сами зашифрованные слова, разделенные одиночным пробелом.

Вывод -- расшифрованные слова на отдельных строках

Решал исходя из преположения, что в зашифрованном тексте имеется только один способ расшифровки слова.

-----------------------
Вторая задача -- поиск площади между графиками составных функций F и G,с количеством частей N и M , части которых представляют из себя многочлены второй степени с коэфициентами a,b,c.

Ввод:

В первой строке -- числа N и M, разделенные пробелом.
Во второй строке -- N+1 целых чисел, пределов интегрирования для F, M+1 целых чисел, пределов интегрирования для G
В третьей -- коэффициеты для многочленов. N * 3 чисел, коэффициентов для частей F, M * 3 чисел, коэффициентов для частей G.Читаются как "a1 b1 c1 a2 b2...".

Вывод -- число(площадь)

Точки разрыва не обрабатывал, решал из предположения, что функция непрерывна.

-----------------------
Третья -- преписывание простых математических операций при помощи сложения. Алгоритм пока не обрабатывает деление на отрицательные числа, все кроме деления работает с целыми числами.

Ввод -- два целых числа, a и b, разделенных пробелом.

Внутреннее меню:
"Divide" -- делить a на b

"Multiply" -- умножить a на b

"Substract" -- вычесть b из a

"Add" -- сложить a и b

"e" -- выход

Вывод -- результат операции

-----------------------
Четвертая -- переписывание строки ВВидеВерблюда. Предполагается, что строка разделена на слова одними и теми же разделителями. (" ", "_", "-").

Ввод -- одна строка для преобразования

Вывод -- преобразованная строка

-----------------------
