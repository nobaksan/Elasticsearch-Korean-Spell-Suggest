package org.elasticsearch.plugin.analysis;

import elasticsearch.koreanspell.token.KoreanSpellTokenFilterFactory;
import org.elasticsearch.index.analysis.TokenFilterFactory;
import org.elasticsearch.indices.analysis.AnalysisModule;
import org.elasticsearch.plugins.AnalysisPlugin;
import org.elasticsearch.plugins.Plugin;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by seungmokang on 2018. 4. 12..
 */
public class AnalysisKoreanSpellTokenFilterPlugin extends Plugin implements AnalysisPlugin {
    @Override
    public Map<String, AnalysisModule.AnalysisProvider<TokenFilterFactory>> getTokenFilters() {
        Map<String, AnalysisModule.AnalysisProvider<TokenFilterFactory>> extra = new HashMap<>();
        extra.put("korean_spell", KoreanSpellTokenFilterFactory::new);
        return extra;
    }
}