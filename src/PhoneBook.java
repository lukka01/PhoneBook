public class PhoneBook extends MiniJava{
    private Entry[] entries;

    public PhoneBook(Entry[] entries) {
        this.entries = entries;
    }

    public Entry[] getEntries() {
        return entries;
    }

    public String find(String firstName, String lastName) {
        int left = 0;
        int right = entries.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            Entry midEntry = entries[mid];

            int LastNameCmp = lastName.compareTo(midEntry.getLastName());
            if (LastNameCmp == 0) {
                int firstNameCmp = firstName.compareTo(midEntry.getFirstName());
                if (firstNameCmp == 0) {
                    return midEntry.getPhoneNumber();
                } else if (firstNameCmp < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (LastNameCmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null;
    }




}
