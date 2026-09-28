package defpackage;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.Topic;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ob0 {
    public static GetTopicsResponse a(android.adservices.topics.GetTopicsResponse getTopicsResponse) {
        getTopicsResponse.getClass();
        ArrayList arrayList = new ArrayList();
        for (Topic topic : getTopicsResponse.getTopics()) {
            arrayList.add(new androidx.privacysandbox.ads.adservices.topics.Topic(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        return new GetTopicsResponse(arrayList);
    }

    public static GetTopicsResponse b(android.adservices.topics.GetTopicsResponse getTopicsResponse) {
        getTopicsResponse.getClass();
        ArrayList arrayList = new ArrayList();
        for (Topic topic : getTopicsResponse.getTopics()) {
            arrayList.add(new androidx.privacysandbox.ads.adservices.topics.Topic(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (EncryptedTopic encryptedTopic : getTopicsResponse.getEncryptedTopics()) {
            byte[] encryptedTopic2 = encryptedTopic.getEncryptedTopic();
            encryptedTopic2.getClass();
            String keyIdentifier = encryptedTopic.getKeyIdentifier();
            keyIdentifier.getClass();
            byte[] encapsulatedKey = encryptedTopic.getEncapsulatedKey();
            encapsulatedKey.getClass();
            arrayList2.add(new androidx.privacysandbox.ads.adservices.topics.EncryptedTopic(encryptedTopic2, keyIdentifier, encapsulatedKey));
        }
        return new GetTopicsResponse(arrayList, arrayList2);
    }
}
