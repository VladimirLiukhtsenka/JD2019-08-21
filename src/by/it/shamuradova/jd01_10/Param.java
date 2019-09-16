package by.it.shamuradova.jd01_10;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//определяем время действия аннотации и
// для каких элементов она может применяться

@Retention(RetentionPolicy.RUNTIME) //runtime, п.ч. аннотация применяется в момент работы программы

//выбираем цель, для чего эта аннотация может применяться
@Target(ElementType.METHOD)

public @interface Param {

    //если при аннотировании обязательно
// нужно будет указывать, чему будет равно а, то ничего не пишется.
// если а должно или может иметь какое-либо число по умолчанию, то int a () default 100:
    int a();     //a и b дожны быть обязательными;
    int b();
}
