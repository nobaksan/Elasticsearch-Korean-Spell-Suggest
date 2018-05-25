package elasticsearch.koreanspell.token;

import org.apache.lucene.analysis.TokenStream;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.index.analysis.AbstractTokenFilterFactory;

/**
 * Created by seungmokang on 2018. 4. 12..
 */
public class KoreanSpellTokenFilterFactory extends AbstractTokenFilterFactory {

    public KoreanSpellTokenFilterFactory(IndexSettings indexSettings, Environment env, String name, Settings settings) {
        super(indexSettings, name, settings);
    }

    @Override
    public TokenStream create(TokenStream tokenStream) {
        return new KoreanSpellTokenFilter(tokenStream);
    }
}
