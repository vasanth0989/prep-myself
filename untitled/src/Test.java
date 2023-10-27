import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, "CHK", Arrays.asList("A1", "A2")));
        accounts.add(new Account(2, "SVG", Arrays.asList("A3", "A4")));
        accounts.add(new Account(3, "CHK", Arrays.asList("A5", "A6")));
        accounts.add(new Account(4, "SVG", Arrays.asList("A7", "A8")));

        // Problem 1: Group the accounts by its type
        // Map<String, List<Account>>
        Map<String, List<Account>> mp = accounts.stream().collect(Collectors.groupingBy(Account::getType));
        System.out.println(mp);

        //Problem2: Accumulate the NickNames to a String with , delimiter
        String nickname = accounts.stream().flatMap(a -> a.getNickNames().stream()).collect(Collectors.joining(","));
        System.out.println("Nickname:"+nickname);

    }

}

class Account {
    private int id;
    private String type;
    private List<String> nickNames;

    public Account(){}

    public Account(int id, String type, List<String> nickNames) {
        this.id = id;
        this.type = type;
        this.nickNames = nickNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getNickNames() {
        return nickNames;
    }

    public void setNickNames(List<String> nickNames) {
        this.nickNames = nickNames;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", nickNames=" + nickNames +
                '}';
    }
}
