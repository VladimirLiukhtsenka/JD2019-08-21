package by.it.kiturka.jd01_10;

// Определяем время действии аннотации и для каких элементов она может определяться.

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Выбираем RUNTIME т.к НАША аннотация будет применяться в момент раблоты программы
@Target(ElementType.METHOD)// Будет стоять над методом
public @interface Param {
    int a();
    int b();
}
