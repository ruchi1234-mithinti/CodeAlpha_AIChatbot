import java.util.Scanner;

public class ChatBot {

    private ResponseHandler handler = new ResponseHandler();

    public void startChat() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI Chatbot =====");
        System.out.println("Type 'exit' to end the chat.\n");

        while (true) {

            System.out.print("You: ");

            String userInput = sc.nextLine().toLowerCase();

            if (userInput.equals("exit")) {

                System.out.println("Bot: Chat ended.");
                break;
            }

            String response = handler.getResponse(userInput);

            System.out.println("Bot: " + response);
        }

        sc.close();
    }
}