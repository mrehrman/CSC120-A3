//import scanner class to get user input
import java.util.Scanner;


/**
 * The Conversation class creates a chatbot that interacts with user input.
 * @author Maddie Rehrman
 * @version 9/24/24
 */
class Conversation {

  //attribute
  static String[] chatbotResponses = new String[] {"Hmmm.", "That's interesting.", "Mm-hmmm.", "Tell me more.", "Huh.", 
    "I'd like to hear more about that.", "You have a lot to say.", "Hmmm.", "Uh-huh.", "Wow."};

   
  /**
   * Takes in a String and returns a new String with specific words mirrored.
   * @param response The String to modify
   * @return The modified String with words mirrored
   */
  public String mirrorWords(String response){
    String[] words = response.split(" ");
    int length = words.length;
    String[] mirroredResponse = new String[length]; //create a new array to store the response with mirrored words
    for (int i = 0; i < length; i++){
      String word = words[i];
      if (word.equalsIgnoreCase("I")){
        word = "you";
        mirroredResponse[i] = word;
      }
      else if (word.equalsIgnoreCase("me")){
        word = "you";
        mirroredResponse[i] = word;
      }
      else if (word.equalsIgnoreCase("am")){
        word = "are";
        mirroredResponse[i] = word;
      }
      else if (word.equalsIgnoreCase("are")){
        word = "am";
        mirroredResponse[i] = word;
      }
      else if (word.equalsIgnoreCase("you")){
        word = "I";
        mirroredResponse[i] = word;
      }
      else if (word.equalsIgnoreCase("my")){
        word = "your";
        mirroredResponse[i] = word;
      }
      else if (word.equalsIgnoreCase("your")){
        word = "my";
        mirroredResponse[i] = word;
      }
      else{
        mirroredResponse[i] = word;
      }
      
    }
    String chatbotReply = String.join(" ", mirroredResponse);
    return chatbotReply;
  }

  /**
   * Runs the chatbot and prints a transcript of the conversation.
   * @param arguments
   */
  public static void main(String[] arguments) {
    // // You will start the conversation here.

    Conversation newConvo = new Conversation();

    //create scanner to get user input and number of rounds
      Scanner chatbot = new Scanner(System.in);
      System.out.println("How many rounds?");
      Integer rounds = chatbot.nextInt();
      String[] transcript = new String[(rounds*2)+2];
    //start loop with correct number of rounds)
      Scanner chatbot2 = new Scanner(System.in); 
      System.out.println("Hello! Tell me what you're thinking about.");
      int transcriptIndex = 0;
      transcript[transcriptIndex] = "Hello! Tell me what you're thinking about.";

      for (int round_num = 0; round_num < rounds; round_num++) {
        String response = chatbot2.nextLine();
        transcriptIndex = transcriptIndex+1;
        transcript[transcriptIndex] = response;
        String mirroredWords = newConvo.mirrorWords(response);
        if (!mirroredWords.equals(response)){
          System.out.println(mirroredWords);
          transcriptIndex = transcriptIndex + 1;
          transcript[transcriptIndex] = mirroredWords;
        }
        else{
         if (rounds <= 10){
            System.out.println(chatbotResponses[round_num]);
            transcriptIndex = transcriptIndex + 1;
            transcript[transcriptIndex] = chatbotResponses[round_num];
          }
          else{
            System.out.println("Yup.");
            transcriptIndex = transcriptIndex + 1;
            transcript[transcriptIndex] = "Yup.";
            }
        }
      }

      System.out.println("Goodbye");
      transcript[(rounds*2)+1] = "Goodbye";

      System.out.println("");
      System.out.println("TRANSCRIPT: ");
      for (int i = 0; i <= transcriptIndex + 1; i++){
        System.out.println(transcript[i]);
      }



    }

    }

