public class AccountExampleTest {
    public static final String[] validAccount = new String[] {"123abc_", "_abc123", "_______", "123456","abcdefgh"};
    public static final String[] invalidAccount = new String[] {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String account:validAccount){
            boolean invalid = accountExample.validate(account);
            System.out.println("Account is" + account + "is valid" + invalid);
        }
        for (String account:invalidAccount){
            boolean invalid = accountExample.validate(account);
            System.out.println("Account is " + account + "is valid" + invalid);
        }
    }
}
