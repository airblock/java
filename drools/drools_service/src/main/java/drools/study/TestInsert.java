package drools.study;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.impl.ClassPathResource;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.QueryResults;

public class TestInsert {
    public static void main(String[] args) {
        KnowledgeBuilder
                kb = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kb.add(new ClassPathResource("test/test_insert.drl"),
                ResourceType.DRL);
        KnowledgeBase knowledgeBase = kb.newKnowledgeBase();
        StatefulKnowledgeSession statefulSession = knowledgeBase.newStatefulKnowledgeSession();
        statefulSession.fireAllRules();
        QueryResults qr = statefulSession.getQueryResults("query fact count");
        statefulSession.dispose();
        System.out.println("customer 对象数目:" + qr.size());
        System.out.println("end.....");
    }
}