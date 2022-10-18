import java.util.*;


public class Thesaurus {
    public String[] edit(String[] entry) {
        ArrayList<TreeSet<String>> list = convert(entry);

        while (true) {
            int size = list.size();
            list = combine(list); // will combine if can, will only combine to a length-1. Must repeat to combine again
            if (list.size() == size) break; // if we tried to reduce but did not, exit loop
        }

        ArrayList<String> output = new ArrayList<>();
        for(TreeSet<String> set : list) {
            String s = String.join(" ", set);
            output.add(s);
        }
        Collections.sort(output);
        return output.toArray(new String[0]);

    }

    public ArrayList<TreeSet<String>> convert(String[] input) {
        ArrayList<TreeSet<String>> outputList = new ArrayList<>();

        for (String each : input) {
            String[] words = each.split("\\s+");
            //ArrayList<String> wordsList = new ArrayList<>();
            //wordsList.addAll(wordsList)
            TreeSet<String> currentTree = new TreeSet<>();
            currentTree.addAll(Arrays.asList(words));
            outputList.add(currentTree);
        }
        return outputList;
    }

    public ArrayList<TreeSet<String>> combine(ArrayList<TreeSet<String>> listToCombine) {
        // check the list, if two or more words in common, combine 
        // and return combined entry and all other entries. 

        for (int i = 0; i < listToCombine.size()-1; i++){
            for (int j = i + 1; j < listToCombine.size(); j++){
                TreeSet<String> currentSet = new TreeSet<String>(listToCombine.get(i));
                TreeSet<String> nextSet = new TreeSet<String>(listToCombine.get(j));
                currentSet.retainAll(nextSet);
                if (currentSet.size() >= 2) {
                    listToCombine.get(i).addAll(nextSet);
                    listToCombine.remove(listToCombine.get(j));
                    // for (TreeSet<String> set : listToCombine) {
                    //     System.out.println(set);
                    // }
                    
                    return listToCombine;
                }
            }

            
        }
        return listToCombine;


    }


        public static void main(String[] args) {
            String[] list = {"point run score","point dot","cut run tear score","cut valley","cute pretty"};
            Thesaurus testInstance = new Thesaurus();
            String[] testResult = testInstance.edit(list);
            for (String s : testResult) {
                System.out.println(s);  
            }
            
            
        }
}
