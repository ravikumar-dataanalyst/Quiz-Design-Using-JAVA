    import java.util.Scanner; 
    import java.util.Random; 
    import java.util.*;
    public class Quiz1 { 
    public static void main(String[] args)
    { 
     
      HashMap<String, String> map = new HashMap<>();
          Scanner din=new Scanner(System.in);
         Scanner din1=new Scanner(System.in);
        // Adding elements to the Map
        // using standard put() method
        map.put("vishal", "abcd");
        map.put("sachin", "xyz");
        map.put("vaibhav", "pqr");
        
        System.out.println("Enter username");
        String username=din.nextLine();
        
       // System.out.println(username);
        
        System.out.println("Enter the password");
        String password=din1.nextLine();
        
      // System.out.println(password);
      // System.out.println(map.containsKey(username));
      // System.out.println(map.containsValue(password));
       if(map.containsKey(username) && map.containsValue(password))
       {         
         
         System.out.println("==========================Hi!! welcome  " + username +"============================================================================================");
         System.out.println("");
         
        String q1 = "What is hardware?\n" 
              + "(a)virtual machine\n(b)the physical machine\n(c)applications such as browsers\n(d)part of the processor\n"; 
     
        String q2 = "What does counter++; do?\n" 
              + "(a)Adds 1 to counter\n(b)Adds 2 to counter\n(c)Gets the sum\n(d)Multiplies the numbers\n"; 
     
        String q3 = "What is a loop that never stops?\n" 
              + "(a)For Loop\n(b)Infinite Loop\n(c)Do-While Loop\n(d)Full Loop\n"; 
     
        String q4 = "In a while loop, if the boolean expression is true, what will the loop do?\n" 
              + "(a)Break\n(b)Program will exit\n(c)Repeat\n(d)Continue through program\n"; 
     
        String q5 = "What special value is designated for controlling a loop?\n" 
              + "(a)Control value\n(b)Mutator Method\n(c)Accessor Method\n(d)Sentinel Value\n"; 
     
           String q6 = "What is a method?\n" 
          + "(a)A collection of statements grouped together to perform an operation\n(b)A value returned from a method using the return statement\n(c)The portion of the program where the variable can be accessed.\n(d)The combination of the name of a method and the list of its parameters\n"; 
 
    String q7 = "What is an object?\n" 
          + "(a)Representation of an entity in the real world that can be distinctly identified\n(b)A static method can be called without creating an instance of the class\n(c)Instance variable/instance mthod\n(d)A template, blueprint or contract that defines what an object's data fields and methods will be.\n"; 
 
    String q8 = "What is an array?\n" 
          + "(a)Numbers of items ArrayList can store without increasing its size\n(b)Number used as an index to pinpoint a specfic element within an array\n(c)Object that can store a group of values, all of the same type\n(d)Method of locating a specific item in a larger collection of data\n"; 
 
    String q9 = "You use this statement to throw an exception manually.\n" 
          + "(a)Throw\n(b)call stack\n(c)try block\n(d)thrown\n"; 
 
    String qF = "When an exception is generated, it is said to have been what?\n" 
          + "(a)Created\n(b)Called\n(c)Thrown\n(d)Generated\n"; 
 
     
        Question [] questions = { 
                new Question(q1, "b"), 
                new Question(q2, "a"), 
                new Question(q3, "b"), 
                new Question(q4, "c"), 
                new Question(q5, "d"), 
                new Question(q6, "a"), 
            new Question(q7, "a"), 
            new Question(q8, "c"), 
            new Question(q9, "a"), 
            new Question(qF, "c") 
        }; 
        
        
        System.out.println("Welcome to Quiz Program");
        System.out.println("============================================================================================================================================");
        
        takeTest(questions,username); 
        
        
       
        System.out.println("1. Restart the Quiz");
        System.out.println("2. Exit the Quiz");
        
        System.out.println("Enter your Choice");
        
        Scanner ans=new Scanner(System.in);
        int response=ans.nextInt();
        
        switch(response)
        {
        
        		case 1 :
        		takeTest(questions,username);
        		break;
        		case 2:
        		break;
        		default:
        		break;
        }
        }
        else
        {
        
        System.out.println("invalid login");
        
        }
        
        
        			
        
        
     
     
    } 
     
     
    public static void takeTest(Question [] questions,String user)
    { 
        int score = 0; 
        Scanner keyboardInput = new Scanner(System.in); 
         
        int[] array = { 0,1,2,3,4,5,6,7,8,9 };
		
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		} 
         
         
         
         
         
         
     
        for(int i = 0; i < questions.length; i++)
         {  
            System.out.print(i+1);
            System.out.print(". ");
            System.out.println(questions[array[i]].prompt); 
            String answer = keyboardInput.nextLine(); 
            if(answer.equals(questions[array[i]].answer))
             { 
                score++; 
                System.out.println("*********Feedback:Your Anwer is true************");
            } 
            else
            {
            System.out.println("***************Feeback:oh !!! no your answer is wrong************");
            
            }
            System.out.println("============================================================================================================================================");
        } 
        System.out.println("******************************************************************************************************");
        
        System.out.print("Hi  " +user);
        System.out.println("   You score is ===============>" + score + "/" + questions.length); 
          System.out.println("******************************************************************************************************");
    }} 
    
    
    
        class Question{ 
    String prompt; 
    String answer; 
     
    public Question(String prompt, String answer) { 
        this.prompt = prompt; 
        this.answer = answer; 
    }} 
