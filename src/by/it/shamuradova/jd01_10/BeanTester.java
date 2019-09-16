package by.it.shamuradova.jd01_10;

public class BeanTester {
    public static void main(String[] args) throws Exception {
//        Class clazz = Class.forName(Bean.class.getName());
//        Bean bean=(Bean) clazz.newInstance();  //создали экземпляр класса
        processCreate(Bean.class);
    }
        static void processCreate(Class<?> cls){
        if(cls.isAnnotationPresent(Param.class)){    //есть ли аннотация
            Param param =cls.getAnnotation(Param.class);
            cls.getDeclaredAnnotations();





        }





    }
}
