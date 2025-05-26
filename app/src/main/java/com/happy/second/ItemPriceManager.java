package com.happy.second;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.HashMap;
import java.util.Map;

public class ItemPriceManager {

    private DatabaseReference itemsRef;
    private Map<String, Double> itemPrices;

    public ItemPriceManager() {
        // Initialize Firebase database reference
        itemsRef = FirebaseDatabase.getInstance().getReference().child("items");
        itemPrices = new HashMap<>();

        // Retrieve item prices from Firebase database
        fetchItemPrices();
    }

    private void fetchItemPrices() {
        itemsRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot itemSnapshot : dataSnapshot.getChildren()) {
                    String itemId = itemSnapshot.getKey();
                    String itemName = itemSnapshot.child("name").getValue(String.class);
                    double itemPrice = itemSnapshot.child("price").getValue(Double.class);
                    itemPrices.put(itemId, itemPrice);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Handle errors
            }
        });
    }

    public double getItemPrice(String itemId) {
        return itemPrices.getOrDefault(itemId, 0.0);
    }
}
