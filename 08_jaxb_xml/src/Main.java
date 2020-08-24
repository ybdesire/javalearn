import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.*;
import javax.xml.bind.annotation.*;

class Account{
    public int accountNumber;
    public String firstName;
    public String lastName;
    public double balance;

    public Account(){this(0,"","",0.0);}
    public Account(int a, String f, String l, double b)
    {
        accountNumber = a;
        firstName = f;
        lastName = l;
        balance = b;
    }
}

@XmlRootElement
class Accounts{
    @XmlElement(name="account")
    private List<Account> accounts = new ArrayList<>();
    public List<Account> getAccounts(){return accounts;}
}
public class Main {

    public static void main(String[] args) {
        try {
            BufferedWriter output = Files.newBufferedWriter(Paths.get("client.xml"));
            JAXBContext jaxbContext     = JAXBContext.newInstance( Accounts.class );
            Marshaller jaxbMarshaller   = jaxbContext.createMarshaller();

            Accounts as = new Accounts();
            Account a1 = new Account(1,"a1","b1",1.0);
            Account a2 = new Account(2,"a2","b2",2.0);
            Account a3= new Account(3,"a3","b3",3.0);
            as.getAccounts().add(a1);
            as.getAccounts().add(a2);
            as.getAccounts().add(a3);
            jaxbMarshaller.marshal(as,output);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
