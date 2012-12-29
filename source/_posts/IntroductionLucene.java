import java.io.IOException;
import java.text.ParseException;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
 
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;


public class IntroductionLucene {
	
	public static void main(String[] args) throws IOException, ParseException, Exception {
	
    // تحديد المُفهرس

	    StandardAnalyzer analyzer = new StandardAnalyzer(Version.LUCENE_40);

            // الفهرسة  

	    Directory index = new RAMDirectory();

	    IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_40, analyzer);

	    IndexWriter w = new IndexWriter(index, config);
	    
	    addDoc(w, "dtmdeblog of daade", "000001");
	    addDoc(w, "Lucene in daade", "000002");
	    addDoc(w, "tayeb el daadi", "000003");
	    addDoc(w, "lucene in arabic", "000004");
	    w.close();
	    // السؤال
	    String querystr = args.length > 0 ? args[0] : "lucene";
            Query q = new QueryParser(Version.LUCENE_40, "title", analyzer).parse(querystr);

	    // البحث
	    int hitsPerPage = 10;
	    IndexReader reader = DirectoryReader.open(index);
	    IndexSearcher searcher = new IndexSearcher(reader);
	    TopScoreDocCollector collector = TopScoreDocCollector.create(hitsPerPage, true);
	    searcher.search(q, collector);
	    ScoreDoc[] hits = collector.topDocs().scoreDocs;
	    // عرض النتائج
	    System.out.println("Found " + hits.length + " hits.");
	    for(int i=0;i<hits.length;++i) {
	      int docId = hits[i].doc;
	      Document d = searcher.doc(docId);
	      System.out.println((i + 1) + ". " + d.get("num") + "\t" + d.get("title"));
	    }

	    reader.close();
	  }
          private static void addDoc(IndexWriter w, String title, String isbn) throws IOException {
	    Document doc = new Document();  
	    doc.add(new Field("title", title, Field.Store.YES,Field.Index.ANALYZED));
	    doc.add(new Field("isbn", isbn, Field.Store.YES,Field.Index.ANALYZED));
	    w.addDocument(doc);
	  }
	  
}

