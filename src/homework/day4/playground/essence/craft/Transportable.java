package homework.day4.playground.essence.craft;

public interface Transportable {
    int move(int pointA, int pointB);

}
//- принимает 2 целых числа и печатает в консоль фразу
//"I am N, my name is M and I am moving from point A to point B",
//где N - название класса соответствующего обьекта, М - значение name обьекта,
//А и В - числа, подставляемые из значения передаваемых
//аргументов, и возвращает целое число, являющееся разницей В и А