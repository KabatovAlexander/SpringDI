package com.test;

import com.test.autowire.byName.Department;
import com.test.autowire.byType.Location;
import com.test.autowire.constructor.Performer;
import com.test.autowire.no.Driver;
import com.test.factory.CarFactory;
import com.test.factory.ICar;
import com.test.lookupInjection.RequestProcess;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ///////////////////////object and primitive\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        //for right results it's necessary to comment beans "lionLife" or "textEditor" in applicationContext.xml
        //SI for object
        /*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();*/

        //CI for object
        /*LionLife lion = (LionLife) context.getBean("lionLife");
        lion.location();*/

        //primitives CI - not ready
        /*System.out.println("primitive CI");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("someOperation.xml");
        AddOperation add = (AddOperation) context2.getBean("add");*/

        ////////////////////////////collections\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        //List CI
        //for right results it's necessary to comment all beans except assortment and adidas in someShop.xml
        /*ApplicationContext context1 = new ClassPathXmlApplicationContext("someShop.xml");
        Adidas adidas = (Adidas) context3.getBean("adidas");
        adidas.sold();*/

        //List SI
        //for right results it's necessary to comment all beans except assortment and nike in someShop.xml
        /*Nike nike = (Nike) context1.getBean("nike");
        nike.sold();*/

        //Set CI
        //for right results it's necessary to comment all beans except assortment and puma in someShop.xml
        /*Puma puma = (Puma) context1.getBean("puma");
        puma.sold();*/

        //Set SI
        //for right results it's necessary to comment all beans except assortment and reebok in someShop.xml
        /*Reebok reebok = (Reebok) context1.getBean("reebok");
        reebok.sold();*/

        //Map CI
        //for right results it's necessary to comment all beans except assortment and lonsdale in someShop.xml


        //Map SI
        //for right results it's necessary to comment all beans except assortment and everlast in someShop.xml

        //SI Injection
        //ApplicationContext context3 = new ClassPathXmlApplicationContext("someShop.xml");
        /*CollectionInjectionSI collectionInjectionSI = (CollectionInjectionSI) context3.getBean("collectionInjectionSI");
        collectionInjectionSI.getList();
        collectionInjectionSI.getSet();
        collectionInjectionSI.getMap();*/

        //CI Injection
        //CollectionInjectionCI collectionInjectionCI = (CollectionInjectionCI) context3.getBean("collectionInjectionCI");

        ///////////////////////////parent bean\\\\\\\\\\\\\\\\\\\\\
        /*ApplicationContext context = new ClassPathXmlApplicationContext("inheritBean.xml");
        Size size = (Size) context.getBean("size");
        Sneakers sneakers = (Sneakers) context.getBean("sneakers");
        System.out.println(size.getSizeS());
        System.out.println(sneakers.isClean());
        System.out.println(sneakers.breakIn(44));*/

        ///////////////////////////Spring Expression Language\\\\\\\\\\\\\\\\\\\\\\
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spEL.xml");
        SpELConfig spELConfig = (SpELConfig) applicationContext.getBean("myProfile");
        System.out.println(applicationContext.getBean("myProfile").toString());*/

        ///////////////////////////Autowire\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire.xml");
        //byName
        Department department = (Department) applicationContext.getBean("department");
        System.out.println(department);

        //byType
        Location location = (Location) applicationContext.getBean("location");
        System.out.println(location);

        //constructor
        Performer performer = (Performer) applicationContext.getBean("performer");
        System.out.println(performer);

        //no
        Driver driver = (Driver) applicationContext.getBean("driver");
        System.out.println(driver);*/

        /////////////////////////factory\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        /*ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("factory.xml");
        //factory-method
        ICar iCar = (ICar) applicationContext1.getBean("factory");
        iCar.accelerate();

        //factory-method + factory-bean
        ICar iCar1 = (ICar) applicationContext1.getBean("getCars");
        iCar1.accelerate();*/

        //lookupMethodInjection
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lookupInjection.xml");
        RequestProcess requestProcess = (RequestProcess) applicationContext.getBean("process");
        System.out.println("The CoreSecond process: " + requestProcess.getCoreSecond());
        System.out.println("The CoreFirst process: " + requestProcess.getCoreFirst());

    }
}
