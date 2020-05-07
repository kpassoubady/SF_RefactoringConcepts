package com.kavinschool.legacy.sproutmethod;

import java.util.Iterator;
import java.util.List;

public class TransactionGate
{
    private TransactionBundle transactionBundle;

    public void postEntries(List entries) {
        for (Object o : entries) {
            Entry entry = (Entry) o;
            entry.postDate();
        }
        transactionBundle.getListManager().add(entries);
    }
}


