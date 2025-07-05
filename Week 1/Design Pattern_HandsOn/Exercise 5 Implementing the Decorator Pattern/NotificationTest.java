package ImplementingDecoratorPattern;

public class NotificationTest{
	public static void main(String[] args) 
	{
	        Notifier emailOnly = new EmailNotifier();
	        emailOnly.send("Hello via Email!");
	        System.out.println("\n----\n");
	        Notifier emailSMS = new SMSNotifierDecorator(new EmailNotifier());
	        emailSMS.send("Hello via Email + SMS!");
	        System.out.println("\n----\n");
	        Notifier allChannels = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
	        allChannels.send("Hello via Email + SMS + Slack!");
	}
}