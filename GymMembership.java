// Base Class
class GymMemberships{
    String memberName;
    String membershipType;
    int duration; // in months

    // Constructor
    GymMemberships(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    // Method to calculate membership fee
    double calculateFee() {
        double monthlyFee = 0;

        if (membershipType.equalsIgnoreCase("Basic")) {
            monthlyFee = 1000;
        } else if (membershipType.equalsIgnoreCase("Standard")) {
            monthlyFee = 1500;
        } else if (membershipType.equalsIgnoreCase("Premium")) {
            monthlyFee = 2000;
        }

        return monthlyFee * duration;
    }

    // Method to check special offers
    void checkSpecialOffer() {
        if (duration >= 12) {
            System.out.println("Special Offer: Get 2 months free!");
        } else {
            System.out.println("No special offer available.");
        }
    }
}

// Subclass
class PremiumMembership extends GymMemberships {
    boolean personalTrainer;
    boolean spaAccess;

    // Constructor
    PremiumMembership(String memberName, String membershipType,
                      int duration, boolean personalTrainer, boolean spaAccess) {
        super(memberName, membershipType, duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    // Overriding fee calculation
    @Override
    double calculateFee() {
        double fee = super.calculateFee();

        if (personalTrainer) {
            fee += 500 * duration;
        }

        if (spaAccess) {
            fee += 300 * duration;
        }

        return fee;
    }

    // Display details
    void displayDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Personal Trainer: " + personalTrainer);
        System.out.println("Spa Access: " + spaAccess);
        System.out.println("Total Fee: ₹" + calculateFee());

        checkSpecialOffer();
    }
}
// Main Class
public class GymMembership{
    public static void main(String[] args) {

        PremiumMembership member =
                new PremiumMembership("Bhawna", "Premium",
                        12, true, true);

        member.displayDetails();
    }
}
