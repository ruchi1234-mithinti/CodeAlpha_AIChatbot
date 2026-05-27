public class ResponseHandler {

    public String getResponse(String input) {

        if (input.contains("hello") || input.contains("hi")) {

            return "Hello! How can I help you?";
        }

        else if (input.contains("name")) {

            return "I am a Java AI Chatbot.";
        }

        else if (input.contains("java")) {

            return "Java is an object-oriented programming language.";
        }

        else if (input.contains("course")) {

            return "I can help answer basic programming questions.";
        }

        else if (input.contains("bye")) {

            return "Goodbye! Have a nice day.";
        }

        else {

            return "Sorry, I do not understand that.";
        }
    }
}