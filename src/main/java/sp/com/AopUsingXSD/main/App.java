package sp.com.AopUsingXSD.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sp.com.AopUsingXSD.services.AccountCreation;
import sp.com.AopUsingXSD.services.BankTransaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context= new ClassPathXmlApplicationContext("/sp/com/AopUsingXSD/resources/ApplicationContext.xml");
     
        
        BankTransaction bt= (BankTransaction) context.getBean("objServices");
        bt.Upipayment();
        System.out.println();
        bt.NetbackingPayement();
        System.out.println();
        bt.WalletPayment();
        System.out.println();
        System.out.println();
        
        AccountCreation ac= (AccountCreation) context.getBean("AccServices");
        ac.accoutCreated();
       
    }
}
