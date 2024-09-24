//import scanner class to get user input
import java.util.Scanner;

class Conversation {

  //attributes of class conversation
  static String[] chatbotResponses = new String[] {"Hmmm.", "That's interesting.", "Mm-hmmm.", "Tell me more.", "Huh.", 
    "I'd like to hear more about that.", "You have a lot to say.", "Hmmm.", "Uh-huh.", "Wow."};

  //methods 
  public String isMirror(String response){
    String[] words = response.split(" ");
    int length = words.length;
    String[] mirroredResponse = new String[length];
    for (int i = 0; i < length; i++){
      String word = words[i];
      if (word.equals("I")){
        word = word.replace("I", "you");
        mirroredResponse[i] = word;
      }
      else if (word.equals("me")){
        word = word.replace("me", "you");
        mirroredResponse[i] = word;
      }
      else if (word.equals("am")){
        word = word.replace("am", "are");
        mirroredResponse[i] = word;
      }
      else if (word.equals("you")){
        word = word.replace("you", "I");
        mirroredResponse[i] = word;
      }
      else if (word.equals("my")){
        word = word.replace("my", "your");
        mirroredResponse[i] = word;
      }
      else if (word.equals("your")){
        word = word.replace("your", "my");
        mirroredResponse[i] = word;
      }
      else{
        mirroredResponse[i] = word;
      }
      
    }
    String chatbotReply = String.join(" ", mirroredResponse);
    return chatbotReply;
  }

  public static void main(String[] arguments) {
    // // You will start the conversation here.

    // //create scanner to get user input and number of rounds
    //   Scanner chatbot = new Scanner(System.in);
    //   System.out.println("How many rounds?");
    //   Integer rounds = chatbot.nextInt();
    // //start loop with correct number of rounds)
    //   System.out.println("Hello! Tell me what you're thinking about.");
    

    //   for (int round_num = 0; round_num < rounds; round_num++) {
    //     String response = chatbot.next();
    //     if (rounds <= 10){
    //       System.out.println(chatbotResponses[round_num]);
    //     }
    //     else{
    //       System.out.println("Yup.");
    //     }
    //   }

    //   System.out.println("Goodbye");

    public String isMirror(String response){
      String[] words = response.split(" ");
      int length = words.length;
      String[] mirroredResponse = new String[length];
      for (int i = 0; i < length; i++){
        String word = words[i];
        if (word.equals("I")){
          word = word.replace("I", "you");
          mirroredResponse[i] = word;
        }
        else if (word.equals("me")){
          word = word.replace("me", "you");
          mirroredResponse[i] = word;
        }
        else if (word.equals("am")){
          word = word.replace("am", "are");
          mirroredResponse[i] = word;
        }
        else if (word.equals("you")){
          word = word.replace("you", "I");
          mirroredResponse[i] = word;
        }
        else if (word.equals("my")){
          word = word.replace("my", "your");
          mirroredResponse[i] = word;
        }
        else if (word.equals("your")){
          word = word.replace("your", "my");
          mirroredResponse[i] = word;
        }
        else{
          mirroredResponse[i] = word;
        }
        
      }
      String chatbotReply = String.join(" ", mirroredResponse);
      return chatbotReply;
    }
    // String response = "My name is Maddie";

    // response.isMirror(response);




    }

    }

