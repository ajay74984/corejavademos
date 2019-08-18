package regex;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HackerRankProblems {

    public static void main(String[] args) {
        HackerRankProblems problems = new HackerRankProblems();
        //problems.testAPI();
       // problems.testHackerTweet();
        //problems.extractEmail();
        problems.aliensUsername();
    }


   public void testAPI(){
       String format = "http[s]?://([a-zA-Z0-9.]+)";
       Pattern pattern = Pattern.compile(format);
       Scanner sc = new Scanner(System.in);
       Set<String> strings = new TreeSet<>();
       int telecast = sc.nextInt();
       sc.nextLine();
       for (int i = 0; i < telecast; i++) {
           String ac = sc.nextLine();
           Matcher matcher = pattern.matcher(ac);
           while(matcher.find()){
           final String group = matcher.group(1);
               final String s = StringUtils.stripStart(group, "www.");
               strings.add(s);
           }
       }
       strings.forEach(System.out::println);
   }

   /*
    Input Sample:

    */
   public void testHackerTweet(){
       String format = "[hH][aA][cC][kK][eE][rR]{2}[aA][nN][kK]";
       //Alternative is (?i)hackerrank -> mode modifier to case insensitive
       Pattern pattern = Pattern.compile(format);
       Scanner sc = new Scanner(System.in);
       int count = 0;
       int telecast = sc.nextInt();
       sc.nextLine();
       for (int i = 0; i < telecast; i++) {
           String ac = sc.nextLine();
           Matcher matcher = pattern.matcher(ac);
           while(matcher.find()){
              count++;
           }
       }
       System.out.println(count);
   }
    public void extractEmail(){
        String format = "([a-zA-Z0-9._-]+@[a-zA-Z._-]+\\.[a-zA-Z_.-]+)";
        Pattern pattern = Pattern.compile(format);
        Scanner sc = new Scanner(System.in);
        Set<String> strings = new TreeSet<>();
        int telecast = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < telecast; i++) {
            String ac = sc.nextLine();
            Matcher matcher = pattern.matcher(ac);
            while(matcher.find()){
                final String group = matcher.group(1);
                strings.add(group);
            }
        }
            System.out.println(String.join(";", strings));
    }

    public void aliensUsername(){
        String format = "^[_.][0-9]+[a-zA-Z]*_?$";
        Pattern pattern = Pattern.compile(format);
        Scanner sc = new Scanner(System.in);
        int telecast = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < telecast; i++) {
            boolean isMatch = false;
            String ac = sc.nextLine();
            Matcher matcher = pattern.matcher(ac);
            while(matcher.find()){
                isMatch = true;
            }
            if(isMatch){
                System.out.println("\nVALID");
            }else{
                System.out.println("INVALID");
            }
        }
    }

}
