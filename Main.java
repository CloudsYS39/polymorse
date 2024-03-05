

public class Main {
    public static void main(String[] args) {
        String emailPenerima = "CYS39@gmail.com";
        String nomerHp = "08123456789";
        String mobileId = "andriod-39";

        EmailNotification emailNotif = new EmailNotification();
        SMSNotification smsNotif = new SMSNotification();
        PushNotification pushNotif = new PushNotification();

        String message = "p balap";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}