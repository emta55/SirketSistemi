
package SQLIslemleri;

import MailConfig.MailIslemleri;
import javax.mail.MessagingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLKullaniciIslemleri {
    
    private String mailAtilacakAdres = "";
    private String unutulanSifre = "";
    
    MailIslemleri mail = new MailIslemleri();


    
    
    
    public void kullaniciBul(String kullaniciAdi){
        
        this.mailAtilacakAdres = "emta55@hotmail.com";
        this.unutulanSifre = "123456";
        
    }
    
    public void sifremiUnuttum(String kullaniciAdi) throws MessagingException{
        
        kullaniciBul(kullaniciAdi);
        
        if(!mailAtilacakAdres.equals("")){
            
            System.out.println("Mail Gönderme Islemlerine Devam Edilecek..");
            mail.mailGonder(mailAtilacakAdres);
            
        }else{
            
            System.out.println("Kullanici Maili Bulunamadi");
            
        }
        
        
    }
    
    
}
