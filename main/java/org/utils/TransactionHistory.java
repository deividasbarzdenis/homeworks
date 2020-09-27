package org.utils;

import org.models.Transaction;

public class TransactionHistory extends Transaction implements Comparable<TransactionHistory>{
    private int historyId;

    @Override
    public int compareTo(TransactionHistory o) {
        return 0;
    }
}
