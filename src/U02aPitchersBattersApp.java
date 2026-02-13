public class U02aPitchersBattersApp {
    public static void main(String[] args) {
      System.out.println("-=-=-=-=-=-=-=-=-PART 1");
      // PART 1: construct two different pitchers, the first pitcher's name MUST start with a vowel and the second's name MUST start with a consonant
      // DONE 
      Pitcher pitcher1 = new Pitcher("Eli");
      Pitcher pitcher2 = new Pitcher("Tyler");
      // DONE 
      Pitcher pitcher3 = new Pitcher("AJ");
      Pitcher pitcher4 = new Pitcher("Blake");
      // DONE invoke the nextPitch method on the first pitcher and print what the method returns
      System.out.println(pitcher1.nextPitch());
      System.out.println(pitcher2.nextPitch());
      // DONE invoke the nextPitch method on the second pitcher and print what the method returns
      System.out.println(pitcher3.nextPitch());
      System.out.println(pitcher4.nextPitch());
      System.out.println("-=-=-=-=-=-=-=-=-PART 2");
      // PART 2: construct two different batters, the first batter's name MUST start with a vowel and the second's name MUST start with a consonant
      // DONE 
      Batter batter1 = new Batter("Aaron");
      // DONE 
      Batter batter2 = new Batter("Bobby");
      // DONE invoke the nextSwing method on the first batter and print what the method returns
      System.out.println(batter1.nextSwing());
      // DONE invoke the nextSwing method on the second batter and print what the method returns
      System.out.println(batter2.nextSwing());
      System.out.println("-=-=-=-=-=-=-=-=-PART 3");
      // PART 3: The nextPitch method is NOT random. It's using the player's name to decide if it's a good pitch or a bad pitch. 
      // Documentation for the class is here: 
      // https://bradleycodeu.github.io/apcsa/112_using_objects/U02aPitchersBatters/doc/index-all.html  
      // Print your answers to the following 2 questions... 
      System.out.println("Q1)   Which of the following names would make the best pitcher and why? 1) \"Tyler\" 2) \"Louie\" 3) \"Aaron\" 4) \"Steven\"");
      // DONE 
      System.out.println("1, Tyler would be the best pitcher because his name starts with a consonant and has 5 letters, which means he would throw a good pitch.");
      System.out.println("Q2)   Sarah throws 10 pitches. How many of the pitches are GREAT?");
      // DONE
      System.out.println("Sarah would throw 5 GREAT pitches because her name starts with a consonant and has 5 letters, which means she would throw a good pitch every other time.");
      System.out.println("-=-=-=-=-=-=-=-=-PART 4");
      // Finally, simulate a series of three pitches and swings between pitcher 1 and batter 1. Don't forget to print each time.
      System.out.println("-=-=-=-=-=-=-=-=-");
      // 1st pitch and 1st swing
      // DONE 
      System.out.println(pitcher1.nextPitch());
      // DONE 
      System.out.println(batter1.nextSwing());
      System.out.println("-=-=-=-=-=-=-=-=-");
      // 2nd pitch and 2nd swing
      // DONE 
      System.out.println(pitcher1.nextPitch());
      // DONE 
      System.out.println(batter1.nextSwing());
      System.out.println("-=-=-=-=-=-=-=-=-");
      // 3rd pitch and 3rd swing
      // DONE 
      System.out.println(pitcher1.nextPitch());
      // DONE 
      System.out.println(batter1.nextSwing());
      System.out.println("-=-=-=-=-=-=-=-=-");
    }
  }