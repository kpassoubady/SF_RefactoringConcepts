package com.kavinschool.legacy.sproutmethod;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BadTransactionGate {
    private TransactionBundle transactionBundle;

    public void postEntries(List entries) {
        List entriesToAdd = new LinkedList();
        for (Object o : entries) {
            Entry entry = (Entry) o;
            if (!transactionBundle.getListManager().hasEntry(entry)) {
                entry.postDate();
                entriesToAdd.add(entry);
            }
        }
        transactionBundle.getListManager().add(entriesToAdd);
    }
}
