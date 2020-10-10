package com.example.memoapp2.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    //private static final int COUNT = 25;

    static {
       addItem(new DummyItem("Memo 001", "Saturday's To Do List", "All must be done by the end of the day Saturday! If you forget, consider yourself in big trouble!", " Walk the dog\n Wash the dishes\n Do the laundry\n Read a book"));
       addItem(new DummyItem("Memo 002", "Directions to Lia's House", "Don't forget to tell Lia about the major upcoming project you were forewarned about!", " Turn left off Number St.\n Turn right near the grocery store\n Drive Straight 10 miles\n Turn left at Sheridan Rd."));
       addItem(new DummyItem("Memo 003", "Important Emails", "Read emails from Cathy and Luke", "Don't forget to acknowledge the emails and tell Luke that there is a meeting tom!"));
       addItem(new DummyItem("Memo 004", "Grocery List", "Remember to buy these on your way home from the dentist appointment on Thursday!", " Milk\n Bread\n Eggs\n Bagels\n Jell-O\n Noodles\n Coriander\n Oregano"));
       addItem(new DummyItem("Memo 005", "Textbooks To Buy", "Order Sadaf's textbooks for her classes this semester", " https://www.amazon.ca/Canadian-Criminal-Justice-Curt-Griffiths/dp/0176529209\n\n https://www.wiley.com/en-us/Big+Java%3A+Late+Objects%2C+1st+Edition-p-9781119626152#:~:text=Big%20Java%3A%20Late%20Objects%2C%201st%20Edition%20%7C%20Wiley,first%20course%20in%20programming%20for%20computer%20science%20students."));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.title, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String title;
        public final String description;
        public final String details;


        public DummyItem(String id, String title, String description, String details) {
            this.id = id;
            this.title = title;
            this.description = description;
            this.details = details;
        }

        @Override
        public String toString() {
            return description;
        }
    }
}