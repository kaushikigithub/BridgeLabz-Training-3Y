class MovieTicketBooking {
    String movieName;
    String seatNumber;
    double price;

    // Method to book ticket
    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    // Method to display ticket details
    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicketBooking ticket1 = new MovieTicketBooking();
        ticket1.bookTicket("Inception", "A12", 250);
        ticket1.displayTicket();
    }
}
