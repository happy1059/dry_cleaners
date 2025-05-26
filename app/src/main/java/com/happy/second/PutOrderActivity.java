package com.happy.second;
import com.happy.second.ItemPriceManager;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.*;

public class PutOrderActivity extends AppCompatActivity {

    private EditText editTextCustomerName;
    private EditText editTextPhoneNumber;
    private EditText editTextRoomNumber;
    private List<Item> selectedItems;
    private TextView quantityText1,quantityText2,quantityText3,quantityText4,quantityText5,quantityText6,quantityText7,quantityText8,quantityText9,quantityText10,quantityText11,quantityText12,quantityText13,quantityText14,quantityText15,quantityText16;
    private Button minusBtn1, plusBtn1, minusBtn2, plusBtn2, minusBtn3, plusBtn3, minusBtn4, plusBtn4,minusBtn5, plusBtn5,minusBtn6, plusBtn6,minusBtn7, plusBtn7,minusBtn8, plusBtn8,minusBtn9, plusBtn9,minusBtn10, plusBtn10,minusBtn11, plusBtn11,minusBtn12, plusBtn12,minusBtn13, plusBtn13,minusBtn14, plusBtn14,minusBtn15, plusBtn15,minusBtn16, plusBtn16;
    private ItemPriceManager itemPriceManager;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_put_order);

        // Initialize ItemPriceManager
        itemPriceManager = new ItemPriceManager();

        // Now you can use itemPriceManager to retrieve item prices
        double tshirtPrice = itemPriceManager.getItemPrice("itemId1");
        double shirtPrice = itemPriceManager.getItemPrice("itemId2");
        // Retrieve prices for other items as needed


        // Find the views by their IDs
        quantityText1 = findViewById(R.id.qt1);
        quantityText2 = findViewById(R.id.qt2);
        quantityText3 = findViewById(R.id.qt3);
        quantityText4 = findViewById(R.id.qt4);
        quantityText5 = findViewById(R.id.qt5);
        quantityText6 = findViewById(R.id.qt6);
        quantityText7 = findViewById(R.id.qt7);
        quantityText8 = findViewById(R.id.qt8);
        quantityText9 = findViewById(R.id.qt9);
        quantityText10 = findViewById(R.id.qt10);
        quantityText11 = findViewById(R.id.qt11);
        quantityText12 = findViewById(R.id.qt12);
        quantityText13 = findViewById(R.id.qt13);
        quantityText14 = findViewById(R.id.qt14);
        quantityText15 = findViewById(R.id.qt15);
        quantityText16 = findViewById(R.id.qt16);
        minusBtn1 = findViewById(R.id.mb1);
        minusBtn2 = findViewById(R.id.mb2);
        minusBtn3 = findViewById(R.id.mb3);
        minusBtn4 = findViewById(R.id.mb4);
        minusBtn5 = findViewById(R.id.mb5);
        minusBtn6 = findViewById(R.id.mb6);
        minusBtn7 = findViewById(R.id.mb7);
        minusBtn8 = findViewById(R.id.mb8);
        minusBtn9 = findViewById(R.id.mb9);
        minusBtn10 = findViewById(R.id.mb10);
        minusBtn11 = findViewById(R.id.mb11);
        minusBtn12 = findViewById(R.id.mb12);
        minusBtn13 = findViewById(R.id.mb13);
        minusBtn14 = findViewById(R.id.mb14);
        minusBtn15 = findViewById(R.id.mb15);
        minusBtn16 = findViewById(R.id.mb16);
        plusBtn1 = findViewById(R.id.pb1);
        plusBtn2 = findViewById(R.id.pb2);
        plusBtn3 = findViewById(R.id.pb3);
        plusBtn4 = findViewById(R.id.pb4);
        plusBtn5 = findViewById(R.id.pb5);
        plusBtn6 = findViewById(R.id.pb6);
        plusBtn7 = findViewById(R.id.pb7);
        plusBtn8 = findViewById(R.id.pb8);
        plusBtn9 = findViewById(R.id.pb9);
        plusBtn10 = findViewById(R.id.pb10);
        plusBtn11 = findViewById(R.id.pb11);
        plusBtn12 = findViewById(R.id.pb12);
        plusBtn13 = findViewById(R.id.pb13);
        plusBtn14 = findViewById(R.id.pb14);
        plusBtn15 = findViewById(R.id.pb15);
        plusBtn16 = findViewById(R.id.pb16);

        // Set click listeners for the buttons of card 1
        minusBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText1.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText1.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText1.getText().toString());
                currentQuantity++;
                quantityText1.setText(String.valueOf(currentQuantity));
            }
        });
        // Set click listeners for the buttons of card 2
        minusBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText2.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText2.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText2.getText().toString());
                currentQuantity++;
                quantityText2.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 3
        minusBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText3.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText3.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText3.getText().toString());
                currentQuantity++;
                quantityText3.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 4
        minusBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText4.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText4.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText4.getText().toString());
                currentQuantity++;
                quantityText4.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 5
        minusBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText5.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText5.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText5.getText().toString());
                currentQuantity++;
                quantityText5.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 6
        minusBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText6.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText6.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText6.getText().toString());
                currentQuantity++;
                quantityText6.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 7
        minusBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText7.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText7.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText7.getText().toString());
                currentQuantity++;
                quantityText7.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 8
        minusBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText8.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText8.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText8.getText().toString());
                currentQuantity++;
                quantityText8.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 9
        minusBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText9.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText9.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText9.getText().toString());
                currentQuantity++;
                quantityText9.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 10
        minusBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText10.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText10.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText10.getText().toString());
                currentQuantity++;
                quantityText10.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 11
        minusBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText11.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText11.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText11.getText().toString());
                currentQuantity++;
                quantityText11.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 12
        minusBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText12.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText12.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText12.getText().toString());
                currentQuantity++;
                quantityText12.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 13
        minusBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText13.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText13.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText13.getText().toString());
                currentQuantity++;
                quantityText13.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 14
        minusBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText14.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText14.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText14.getText().toString());
                currentQuantity++;
                quantityText14.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 15
        minusBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText15.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText15.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText15.getText().toString());
                currentQuantity++;
                quantityText15.setText(String.valueOf(currentQuantity));
            }
        });

        // Set click listeners for the buttons of card 16
        minusBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText16.getText().toString());
                if (currentQuantity >= 1) {
                    currentQuantity--;
                    quantityText16.setText(String.valueOf(currentQuantity));
                }
            }
        });

        plusBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentQuantity = Integer.parseInt(quantityText16.getText().toString());
                currentQuantity++;
                quantityText16.setText(String.valueOf(currentQuantity));
            }
        });


        Button savebtn = findViewById(R.id.buttonSave);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //on clicking on this button, user will be directed to the bill activity.
                gatherDataAndNavigate();

               startActivity(new Intent(PutOrderActivity.this, BillActivity.class));
            }
            private void gatherDataAndNavigate() {
                // Retrieve customer details from EditText fields
                EditText customerNameEditText = findViewById(R.id.customer_name_edittext);
                EditText phoneNumberEditText = findViewById(R.id.phone_number_edittext);
                EditText roomNumberEditText = findViewById(R.id.room_number_edittext);

                String customerName = customerNameEditText.getText().toString().trim();
                String phoneNumber = phoneNumberEditText.getText().toString().trim();
                String roomNumber = roomNumberEditText.getText().toString().trim();

                // Check if customer details are not empty
                if (TextUtils.isEmpty(customerName) || TextUtils.isEmpty(phoneNumber) || TextUtils.isEmpty(roomNumber)) {
                    Toast.makeText(PutOrderActivity.this, "Please enter all customer details", Toast.LENGTH_SHORT).show();
                    return;
                }

                // List to store selected items
                List<Item> selectedItems = new ArrayList<>();

                // Declare itemList as a list of items
                List<Item> itemList = new ArrayList<>();

                // Populate itemList with sample items (replace this with your actual data)
                itemList.add(new Item("T-shirt", 10.0, 0)); // Example: T-shirt costs 10.0 and initial quantity is 0
                itemList.add(new Item("Shirt", 15.0, 0));   // Example: Shirt costs 15.0 and initial quantity is 0
                // Add more items as needed


                // Assuming itemList is your list of items displayed to the user
                for (Item item : itemList) {
                    // Retrieve the quantity selected for each item
                    int quantity = item.getQuantity();

                    // Check if quantity is greater than 0
                    if (quantity > 0) {
                        // Add the item to the list of selected items
                        selectedItems.add(item);
                    }
                }

                // Check if any items are selected
                if (selectedItems.isEmpty()) {
                    Toast.makeText(PutOrderActivity.this, "Please select at least one item", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Create Intent to navigate to OrderDetailsActivity
                Intent intent = new Intent(PutOrderActivity.this, BillActivity.class);
                intent.putExtra("customer_name", customerName);
                intent.putExtra("phone_number", phoneNumber);
                intent.putExtra("room_number", roomNumber);
                intent.putParcelableArrayListExtra("selected_items", (ArrayList<? extends Parcelable>) selectedItems);

                // Start OrderDetailsActivity
                startActivity(intent);
            }
        });

    }
}