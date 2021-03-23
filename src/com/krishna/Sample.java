//https://github.com/krshna18/week9Classpractice


package com.krishna;

public class Sample {
    public static void main(String[] args)
    {
        String input="hello hello how Are you HELLO are there happy test you";
        String[] words=input.split(" ");
        int wordcount=1;

        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {

                if(words[i].equals(words[j]))
                {
                    wordcount=wordcount+1;
                    words[j]="0";
                }
            }
            if(words[i]!="0")
                System.out.println(words[i]+"--"+wordcount);
            wordcount=1;

        }

    }
}
