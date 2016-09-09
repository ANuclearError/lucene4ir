package lucene4ir;

import org.apache.lucene.analysis.util.TokenFilterFactory;
import org.apache.lucene.analysis.util.TokenizerFactory;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("TOKENIZERS");
        for(String tokenizer : TokenizerFactory.availableTokenizers()) {
            System.out.println("\t" + tokenizer);
        }
        System.out.println("\nTOKEN FILTERS");
        for(String filter : TokenFilterFactory.availableTokenFilters())
            System.out.println("\t" + filter);
    }
}
