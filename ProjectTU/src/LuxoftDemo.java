import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LuxoftDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("A","B", LocalDate.of(2022,06,11), "abc@xyz.com"));
        list.add(new Person("C","D", LocalDate.of(2022,06,10), ""));
        list.add(new Person("E","F", LocalDate.of(2022,05,9), "ghf@kit.com"));

       List<LocalDate> newList =  list.stream().filter(p-> p.email != null && !p.email.isEmpty()).map(p -> p.dob).collect(Collectors.toList());
        list.stream().filter(p -> p.dob.isAfter(LocalDate.of(2022, 06, 01))).forEach(System.out::println);
    }
    //@Transaction(requiresNew)
    public void outer(){
        inner();
        throw  NullPointerException();
    }

    //@Transaction(requiresNew)
    public void inner(){

    }
}

class Person{
    //fn, ln, dob, id, email
    String fn;
    String ln;
    LocalDate dob;
    String id;
    String email;

    @Override
    public String toString() {
        return "Person{" +
                "fn='" + fn + '\'' +
                ", ln='" + ln + '\'' +
                ", dob=" + dob +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Person(String fn, String ln, LocalDate dob, String email) {
        this.fn = fn;
        this.ln = ln;
        this.dob = dob;
        this.email = email;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFn() {
        return fn;
    }

    public String getLn() {
        return ln;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}