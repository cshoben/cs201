public class HashTaggery {
    public String maxTag(String[] tags, String[] messages) {
        int total = tags.length;
        int count = 0;
        Set<String> tagSet = new HashSet<>(tags);

       for (String s : messages) {
           String[] words = s.split(" ");
           for (String word : words) {
               if (word.contains("#") && tagSet.contains(word)) {
                   count++;
                   break;
               }
           }
       }

       if (count/total >= 0.75) {
           return "tagged";

       }

       return "missed";

   }


   /**
 * @param args
 */
public static void main(String[] args) {

       HashTaggery h = new HashTaggery();

       String expected1 = "tagged";
       // TODO - Create your test input

       String[] tags = {"#duke", "#compsci", "#fun", "hashtag", "#hash", "#tag"};

       String[] messages = {"We are @duke and #duke #compsci is #hashtag fun!",
       "We are #duke. We have all the #fun. We #hash and call #hashCode.",
       "#hash #tag and hashcodes are part of #compsci",
       "duke compsci fun is predicated on hashtaggery and #tags"};

       String output;
       output = h.maxTag(tags, messages);

        if (expected1.equals(output)) {
            System.out.println("It worked");
        }

       //System.out.println(maxTag(tags, messages));      

}
