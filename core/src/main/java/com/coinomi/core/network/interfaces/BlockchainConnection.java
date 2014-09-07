package com.coinomi.core.network.interfaces;

import com.coinomi.core.coins.CoinType;
import com.coinomi.core.network.AddressStatus;
import com.coinomi.core.network.ServerClient;
import com.coinomi.core.network.interfaces.TransactionEventListener;
import com.google.bitcoin.core.Address;
import com.google.bitcoin.core.Transaction;

import java.util.List;

/**
 * @author Giannis Dzegoutanis
 */
public interface BlockchainConnection {
    void subscribeToAddresses(CoinType coin, List<Address> addresses,
                              TransactionEventListener listener);

    void getUnspentTx(CoinType coinType, AddressStatus status,
                      TransactionEventListener listener);

    void getTx(CoinType coinType, AddressStatus status, ServerClient.UnspentTx utx, TransactionEventListener listener);

    void broadcastTx(CoinType coinType, final Transaction tx, final TransactionEventListener listener);

    void ping();
}